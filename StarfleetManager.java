package il.ac.tau.cs.sw1.ex9.starfleet;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class StarfleetManager {

	/**
	 * Returns a list containing string representation of all fleet ships, sorted in descending order by
	 * fire power, and then in descending order by commission year, and finally in ascending order by
	 * name
	 */
	public static List<String> getShipDescriptionsSortedByFirePowerAndCommissionYear (Collection<Spaceship> fleet) {
		List <Spaceship> f= new ArrayList<Spaceship>(fleet);
		List<String> ret=new ArrayList<String>();
		Collections.sort(f,new Ships_Comparator());
		for (Spaceship s : f) {
			ret.add(s.toString());
		}
		return(ret);
	}
	public static 
	class Ships_Comparator implements Comparator<Spaceship> {
		public int compare(Spaceship s1,Spaceship s2) {
			int fire_1=s1.getFirePower();
			int fire_2=s2.getFirePower();
			if(fire_1==fire_2) {
				if (s1.getCommissionYear()==s2.getCommissionYear()) 
					return(s1.getName().compareTo(s2.getName()));
				return (Integer.compare(s2.getCommissionYear(),s1.getCommissionYear()));
			}
			return (Integer.compare(fire_2,fire_1));
		}
	}


	/**
	 * Returns a map containing ship type names as keys (the class name) and the number of instances created for each type as values
	 */
	public static Map<String, Integer> getInstanceNumberPerClass(Collection<Spaceship> fleet) {
		  Map<String, Integer> InstanceNumberPerClass = new HashMap<String, Integer>();
		  for (Spaceship spaceship : fleet) {
				
			String class_name=spaceship.getClass().getSimpleName();
			if (InstanceNumberPerClass.containsKey(class_name)) {
				InstanceNumberPerClass.put(class_name, InstanceNumberPerClass.get(class_name) + 1);
				}						
			else
				InstanceNumberPerClass.put(class_name,1);}
		  return InstanceNumberPerClass;
		  }


	/**
	 * Returns the total annual maintenance cost of the fleet (which is the sum of maintenance costs of all the fleet's ships)
	 */
	public static int getTotalMaintenanceCost (Collection<Spaceship> fleet) {
		int total=0;
		  for (Spaceship spaceship : fleet) {
			  total += spaceship.getAnnualMaintenanceCost();
		  }
		return total;

	}


	/**
	 * Returns a set containing the names of all the fleet's weapons installed on any ship
	 */
	public static Set<String> getFleetWeaponNames(Collection<Spaceship> fleet) {
		Set<String> weapons =new HashSet<String>();
		for (Spaceship spaceship : fleet) {
			if (spaceship instanceof Mybattleship) {
				Mybattleship bttleship =(Mybattleship) spaceship;
				for (Weapon weapon : bttleship.getWeapon()) {
					weapons.add(weapon.getName());
				}
			}
		}
		return weapons;
	}
	
	/*
	 * Returns the total number of crew-members serving on board of the given fleet's ships.
	 */
	public static int getTotalNumberOfFleetCrewMembers(Collection<Spaceship> fleet) {
		int total =0;
		for (Spaceship spaceship : fleet) {
			total +=spaceship.getCrewMembers().size();
			}
		return total;
		}
		
	

	/*
	 * Returns the average age of all officers serving on board of the given fleet's ships. 
	 */
	public static float getAverageAgeOfFleetOfficers(Collection<Spaceship> fleet) {
		float sum=0;
		int numofofficers=0;
		for (Spaceship spaceship : fleet) {
			for (CrewMember member : spaceship.getCrewMembers()) {
				if (member instanceof Officer) {
					sum+=member.getAge();
					numofofficers++;}
			}
			}

		return (sum/numofofficers);
	}

	/*
	 * Returns a map mapping the highest ranking officer on each ship (as keys), to his ship (as values).
	 */
	public static Map<Officer, Spaceship> getHighestRankingOfficerPerShip(Collection<Spaceship> fleet) {
		Map<Officer, Spaceship> map = new HashMap<Officer, Spaceship>();
		for (Spaceship spaceship : fleet) {
			SortedSet<Officer> of= new TreeSet<Officer>();
			for (CrewMember member : spaceship.getCrewMembers()) {
				if (member instanceof Officer) 
					of.add((Officer) member);
			}
			if (of.size()>0)
				map.put(of.last(), spaceship);}
			
		return map;
		}

	

	/*
	 * Returns a List of entries representing ranks and their occurrences.
	 * Each entry represents a pair composed of an officer rank, and the number of its occurrences among starfleet personnel.
	 * The returned list is sorted ascendingly based on the number of occurrences.
	 */
	public static List<Map.Entry<OfficerRank, Integer>> getOfficerRanksSortedByPopularity(Collection<Spaceship> fleet) {
		Map<OfficerRank, Integer> map = new HashMap<OfficerRank, Integer>();
		for(OfficerRank r: OfficerRank.values())
			{
            map.put(r,0);
			}
		for (Spaceship spaceship : fleet) {
			for (CrewMember member : spaceship.getCrewMembers()) {
				if (member instanceof Officer) {
					OfficerRank rank =((Officer) member).getRank();
					map.put(rank, map.get(rank)+1);
					}
			}
		}
		List<Map.Entry<OfficerRank, Integer>> sortedlist=new ArrayList<Map.Entry<OfficerRank, Integer>>();
		for (Map.Entry<OfficerRank, Integer> entry : map.entrySet()) {
			if(entry.getValue()>0)
				sortedlist.add(entry);
		}
		Collections.sort(sortedlist,new Mycomperator());
		return sortedlist;
	}
	public static class Mycomperator implements Comparator<Map.Entry<OfficerRank, Integer>>{
		@Override
		public int compare(Entry<OfficerRank, Integer> o1, Entry<OfficerRank, Integer> o2) {
			if (o1.getValue()==o2.getValue()) {
				return -1*(o1.getKey().compareTo(o2.getKey()));
			}
			return (o1.getValue().compareTo(o2.getValue()));
		}
	}
}
