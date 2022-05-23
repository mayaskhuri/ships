package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.List;
import java.util.Set;

public class Fighter extends Mybattleship {
	public Fighter(String name, int commissionYear, float maximalSpeed,Set<? extends CrewMember> crewMembers, List<Weapon> weapons){
		super(name,commissionYear,maximalSpeed,crewMembers,weapons);
	}
	public int getAnnualMaintenanceCost() {
		return  (2500
				+ MySumFirePower_AnnualMaintenance__forwepons(this.getWeapon(),false) 
				+ (int)this.getMaximalSpeed()*1000 );
	}
	public String toString() {
		return(super.toString());
	}


	
	
}
