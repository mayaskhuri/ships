package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.List;
import java.util.Set;

public class Mybattleship extends MyabsrtactSpaceship {
	private List<Weapon> weapons;
	public Mybattleship(String name, int CommissionYear, float maximalSpeed, Set<? extends CrewMember> crewMembers,List<Weapon> weapons) {
		super(name, CommissionYear, maximalSpeed, crewMembers);
		this.weapons=weapons;	
	}
	public List<Weapon> getWeapon() {return weapons;}
	
	@Override
	public int getFirePower() {
		return (super.getFirePower()+MySumFirePower_AnnualMaintenance__forwepons(this.weapons,true));
	}
	
	protected static int MySumFirePower_AnnualMaintenance__forwepons(List<Weapon> weapons,boolean isFirePower){
		int fp_am=0;
		//System.out.print(weapons);
		for (Weapon w : weapons) {
			if (isFirePower) 
				fp_am+=w.getFirePower();
			else 
				fp_am+=w.getAnnualMaintenanceCost();
		}
		return fp_am;
	}
	
	public String toString() {
		return(super.toString()+"\n\tWeaponArray="+this.getWeapon());
	}
	@Override
	public int getAnnualMaintenanceCost() {
		// TODO Auto-generated method stub
		return 0;
	}
	

	
}
