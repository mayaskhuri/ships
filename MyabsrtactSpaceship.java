package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public abstract class MyabsrtactSpaceship implements Spaceship {
	protected String name;
	protected int CommissionYear;
	protected float maximalSpeed;
	protected Set<? extends CrewMember> crewMembers;

	public MyabsrtactSpaceship(String name,int CommissionYear,float maximalSpeed,Set<? extends CrewMember>  crewMembers) {
		this.name=name;
		this.CommissionYear=CommissionYear;
		this.maximalSpeed=maximalSpeed;
		this.crewMembers=crewMembers;
	}
	
	@Override
	public String getName() {return this.name;}

	@Override
	public int getCommissionYear() {return this.CommissionYear;}

	@Override
	public float getMaximalSpeed() {return this.maximalSpeed;}

	@Override
	public int getFirePower() {return 10;}

	@Override
	public Set<? extends CrewMember> getCrewMembers() {return this.crewMembers;}
	
	
	
	public String toString() {
		return (this.getClass().getSimpleName()+"\n\tName="+this.getName()+"\n\tCommissionYear="+this.getCommissionYear()
		+"\n\tMaximalSpeed="+this.getMaximalSpeed()+
		"\n\tFirePower="+getFirePower()+"\n\tCrewMembers="+getCrewMembers().size()+"\n\tAnnualMaintenanceCost="+this.getAnnualMaintenanceCost());
	}

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
		MyabsrtactSpaceship other = (MyabsrtactSpaceship) obj;
		return Objects.equals(this.name, other.name);
	}


}