package info.hash.test;

public class InfoHashImprovisationTestExample {

	public static void main(String[] args) {
		
		
		String str=new String("value");
		int g=str.hashCode();
		
		System.out.println("old hash code......"+g+"   Binary String"+Integer.toBinaryString(g));
		int newhashcode=(g>>>16)^g;//Some arbitrary formula for new hash code
		
		System.out.println("new hashcode............"+newhashcode+"   Binary String"+Integer.toBinaryString(newhashcode));

	}

}
