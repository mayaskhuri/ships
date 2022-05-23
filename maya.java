package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class maya {
	public static void main (String[] args) {
		Weapon x=new Weapon("Cannons",10,110);
		Weapon y=new Weapon("Photon",120,260);
		List <Weapon> dodo=new ArrayList<>();
		dodo.add(y);
		dodo.add(x);

		Weapon z=new Weapon("rami",85,80);
		List <Weapon> we=new ArrayList<>();
		we.add(x);
		we.add(y);
		we.add(z);
		List <Weapon> de=new ArrayList<>();

		CrewWoman s=new CrewWoman(12,5,"mimk");
		CrewWoman s1=new CrewWoman(12,7,"mimk");
		Set<CrewMember> set = new HashSet<CrewMember> (); 
		set.add(s1);		set.add(s);
		Bomber dodoo=new Bomber("Yamaguchi",2416,9.9f,set,dodo,5) ;
		System.out.println(dodoo.getAnnualMaintenanceCost()+"   mmmmmmmmmmmmmmmm");
		//System.out.println(dodoo.getWeapon().size());
		

		/////////////////////////////////////////////////
		Weapon bm=new Weapon("sadsfm",135,680);
		Weapon cm=new Weapon("sakmjjkjojm",18563,808);
		de.add(cm);
		de.add(bm);
		////nasssssss
		Cylon sm=new Cylon("hi",5,1,58);
		Cylon sd=new Cylon("hvdi",5,1,58);
	
		CrewWoman s12=new CrewWoman(12,7,"vdzsfmimk");
		CrewWoman s155=new CrewWoman(48,7,"vdzmayakhurrinsfmimk");
		
		CrewWoman s51=new CrewWoman(12,7,"mdgsgimk");
	
		Set<Cylon> nn = new HashSet<Cylon> (); 
		nn.add(sm);	
		Set<CrewMember> se = new HashSet<CrewMember>();
		////////////////////////////////////////////////////
		Officer yx= new Officer("majd", 38, 16,OfficerRank.Admiral); 
		Officer zyx= new Officer("mafdjd", 36, 16,OfficerRank.Commander) ;
		Officer zmyx= new Officer("mkmafdjd", 36, 16,OfficerRank.Lieutenant) ;
		Set<CrewMember> of=new HashSet<CrewMember>();
		of.add(yx);
		of.add(zyx);
		of.add(zmyx);
		TransportShip kmml=new TransportShip("mhyhyah",36,(float) 152.3,of,42,15);
		List <Spaceship> mayasami=new ArrayList<Spaceship>();
		mayasami.add(kmml);
		///////////////////////////////////////////////
		Officer yxa= new Officer("abcd", 3858, 516,OfficerRank.LieutenantCommander); 
		Officer zyxa= new Officer("abc", 3446, 186,OfficerRank.Lieutenant) ;
		Officer zmyxa= new Officer("abcdef", 3696, 16,OfficerRank.Captain) ;
		Set<CrewMember> omf=new HashSet<CrewMember>();
		omf.add(yxa);
		omf.add(zyxa);
		omf.add(zmyxa);
		TransportShip kmmklol=new TransportShip("smmmmmmmmmmmm",3856,(float) 152.63,omf,42,15);
		mayasami.add(kmmklol);
	//	System.out.println (StarfleetManager.getOfficerRanksSortedByPopularity(mayasami));
	



		/////////////////////////////////////////////////////
		
		//System.out.println(yx.getRank().compareTo(zyx.getRank()));
/*		ColonialViper m=new ColonialViper("bayman",52,(float) 152.3,set,we);
		CylonRaider mh=new CylonRaider("bayan",52,(float) 152.3,nn,de);

		TransportShip kl=new TransportShip("sessd",36,(float) 152.3,se,42,15);*/
		//Set<String> weapons =new HashSet<String>();
		//weapons.addAll(null);
		//TransportShip k=new TransportShip("se",52,(float) 152.3,sr,42,15);
		Collection<Spaceship> fleet=new ArrayList<>();
		//System.out.println(k.getAnnualMaintenanceCost());
		//System.out.println(m.getAnnualMaintenanceCost());
		 ///System.out.println(k instanceof Mybattleship);//true  

		//fleet.add(k);
		/*fleet.add(m);
		fleet.add(mh);
		fleet.add(kl);*/
		//System.out.print(m.toString());
/*		String str=("ColonialViper\r\n"
				+ "	Name=bayan\r\n"
				+ "	CommissionYear=52\r\n"
				+ "	MaximalSpeed=152.3\r\n"
				+ "	FirePower=23\r\n"
				+ "	CrewMembers=1\r\n"
				+ "	AnnualMaintenanceCost=80230\r\n"
				+ "	WeaponArray=[Weapon [name=sam, firePower=13, annualMaintenanceCost=80]]"
				);*/

		//System.out.println(m.toString().equals(str));
		

	}}


