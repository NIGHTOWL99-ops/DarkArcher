package info.java.poc;

public class SortingRawDataTestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] n= {99,98,12,44,65,70,1,0,23};
		
		int[] obj=n.clone();
		
		System.out.println(n.getClass().toGenericString());
		
		System.out.println(obj);
		
		
		System.out.println(n.hashCode());
		for(int i=0;i<obj.length;i++) {
			
			System.out.println(obj[i]);
			
			
		}

	}

}
