package info.opt.test;

import java.util.Optional;

public class OptionalTestTask {
	
	static Optional<Integer> opt=Optional.of(0);
	
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		System.out.println(opt);
		
		System.out.println(opt.isEmpty());
		 
		System.out.println(opt.get());
		
		System.out.println(opt.ofNullable(13));

		System.out.println(opt.ofNullable(13).get());
		
		System.out.println(opt.filter(x->x!=0));
		
		
		System.out.println(opt.filter(x->x==0));
		 
	}

}
