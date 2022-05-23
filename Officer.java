package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.Comparator;

public class Officer extends  CrewWoman implements Comparable <Officer>   {
	private OfficerRank rank; 	
	public Officer(String name, int age, int yearsInService, OfficerRank rank) {
		super(age,yearsInService,name);
		this.rank=rank;	
	}
	public OfficerRank getRank() {
		return this.rank;
	}
	@Override
	public int compareTo(Officer o) {
			return(o.getRank().compareTo(this.getRank()));
		}		
	}

	
	

