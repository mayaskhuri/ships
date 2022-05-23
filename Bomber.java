package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.List;
import java.util.Set;

public class Bomber extends Mybattleship{
	private int numberOfTechnicians;
	
	public Bomber(String name, int commissionYear, float maximalSpeed, Set<CrewMember> crewMembers, List<Weapon> weapons, int numberOfTechnicians){
		super(name,commissionYear,maximalSpeed,crewMembers,weapons);	
		this.numberOfTechnicians=numberOfTechnicians;
		}
	public int getNumberOfTechnicians() {return numberOfTechnicians;}
	
	@Override
	public int getAnnualMaintenanceCost() {
		
		return ((int)(MySumFirePower_AnnualMaintenance__forwepons(this.getWeapon(),false)*
				((100- this.numberOfTechnicians*10)*0.01))    +5000);
	}
	@Override
	public String toString() {
		return (super.toString()+"\n\tNumberOfTechnicians="+this.getNumberOfTechnicians());
	}
}
	
	
