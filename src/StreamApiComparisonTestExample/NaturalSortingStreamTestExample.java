package StreamApiComparisonTestExample;

import java.util.Comparator;
import java.util.List;

public class NaturalSortingStreamTestExample {

	public static void main(String[] args) {


		List<String> listBids= List.of("xyz", "abcd", "abcd", "okay");
		 listBids=listBids.stream().sorted().toList();
		
		
		for(String ipo:listBids) {
			
			System.out.println(ipo);
		}
		
		
		System.out.println("**************************Comparision Multiple Fields******************************");
		
		List<HNIIpo> listBids1= List.of(new HNIIpo(9,"xyz"),
				      new HNIIpo(6, "abcd"),
				      new HNIIpo(1, "abcd"),
				      new HNIIpo(2, "okay"));
		
		
		List<HNIIpo> listHNIIpo1=listBids1.stream().
				sorted(Comparator.comparing(HNIIpo::getBidAmount).
						thenComparing(HNIIpo::getName)).toList();
		
		listHNIIpo1.forEach(x->System.out.println(x.getBidAmount()+x.getName()));
	}

}
