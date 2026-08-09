package com.info.features.latest;

import info.test.streamapi.example.OfferInfoTest;

public sealed class  TestInfoOnSealedClases permits OfferInfoTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("* \n");
		System.out.println("** \n");
		System.out.println("* **\n");
		System.out.println("****** \n");
		System.out.println("******** \n");
		System.out.println("********* \n");
		System.out.println("********** \n");
		
		
		System.out.println("   * \n");
		System.out.println("  **** \n");
		System.out.println(" *******\n");
		System.out.println("********** \n");
		
		
		int rows=5;
		for(int i=1;i<=rows;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
