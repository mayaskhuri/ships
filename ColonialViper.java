package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.List;
import java.util.Set;

public class ColonialViper extends Fighter {

	public ColonialViper(String name, int commissionYear, float maximalSpeed, Set<CrewWoman> crewMembers,
			List<Weapon> weapons) {
		super(name,commissionYear,maximalSpeed,crewMembers,weapons);
		
	}
	public int getAnnualMaintenanceCost() {
		return (int) (4000+MySumFirePower_AnnualMaintenance__forwepons(this.getWeapon(),false)+
				getMaximalSpeed()*500+this.getCrewMembers().size()*500);
	}
	public String toString() {
		return(super.toString());
	}

}
