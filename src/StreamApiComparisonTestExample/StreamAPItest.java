package StreamApiComparisonTestExample;

import java.util.Comparator;
import java.util.List;

public class StreamAPItest {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<HNIIpo> listBids= List.of(new HNIIpo(9,"xyz"),new HNIIpo(6, "abcd"),new HNIIpo(1, "abcd"));
		
		//listBids.add(new HNIIpo(3, "rty"));//Throws Exception;List is unmodifiable
		
		
		System.out.println("Before Sorting............... \n");
      for(HNIIpo l:listBids) {
			
			System.out.print(l.getBidAmount());
		}
		
		List<HNIIpo> listHNIIpo=listBids.stream().sorted(Comparator.comparing(HNIIpo::getBidAmount)).toList();
		
		
		System.out.println("\nAfter Sorting............");
		for(HNIIpo l:listHNIIpo) {
			
			System.out.print(l.getBidAmount());
		}
		
		
		
	}

}
