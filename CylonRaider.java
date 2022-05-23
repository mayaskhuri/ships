package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.List;
import java.util.Set;

public class CylonRaider extends Fighter {

	public CylonRaider(String name, int commissionYear, float maximalSpeed, Set<Cylon> crewMembers,
			List<Weapon> weapons) {
		super(name,commissionYear,maximalSpeed,crewMembers,weapons);
	}
	public int getAnnualMaintenanceCost() {
		return (int) (3500+MySumFirePower_AnnualMaintenance__forwepons(this.getWeapon(),false)+
				500*this.getCrewMembers().size()+1200*getMaximalSpeed());
	}
	public String toString() {
		return(super.toString());
	}
}
