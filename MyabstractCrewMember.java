package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.Objects;

public abstract class MyabstractCrewMember implements CrewMember {

	private int age;
	private String name;
	private int YearsInService;


	public MyabstractCrewMember(String name,int age,int YearsInService) {
		this.age=age;
		this .YearsInService=YearsInService;
		this.name=name;
	}
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public int getYearsInService() {
		return this.YearsInService;
	}
	@Override
	public int getAge() {
		return this.age;
	}
	/*public String tosString () {
		return("\nName="+this.name+"\n")
		Fighter
		Name=USS Defiant
		CommissionYear=2423
		MaximalSpeed=6.0
		FirePower=290
		CrewMembers=130
		AnnualMaintenanceCost=8990
	}*/
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyabstractCrewMember other = (MyabstractCrewMember) obj;
		return Objects.equals(this.name, other.name);
	}
}
