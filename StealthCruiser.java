package il.ac.tau.cs.sw1.ex9.starfleet;


import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class StealthCruiser extends Fighter {
	static final List<Weapon> default_weap= Arrays.asList(new Weapon ("Laser Cannons",10,100));
	static int num_of_stealthcruiser= 0;

	public StealthCruiser(String name, int commissionYear, float maximalSpeed, Set<CrewMember> crewMembers, List<Weapon> weapons) {
		super(name,commissionYear,maximalSpeed,crewMembers,weapons);
		num_of_stealthcruiser++;
	}

	public StealthCruiser(String name, int commissionYear, float maximalSpeed, Set<CrewMember> crewMembers){
		this(name,commissionYear,maximalSpeed,crewMembers,default_weap);
	}
	public int getAnnualMaintenanceCost() {
		return(super.getAnnualMaintenanceCost()+num_of_stealthcruiser*50);
	}
	public String toString() {
		return(super.toString());
	}



	
}