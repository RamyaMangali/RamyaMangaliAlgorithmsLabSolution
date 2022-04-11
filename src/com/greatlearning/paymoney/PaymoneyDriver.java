package com.greatlearning.paymoney;

import java.util.Scanner;

public class PaymoneyDriver {

	public static void main(String[] args) {
		
		System.out.println("Enter the size of transaction array : ");
		
		Scanner sc = new Scanner(System.in);
		
		int transize = sc.nextInt();
		
		int tran[] = new int[transize];
		
		System.out.println("Enter the values of array : ");
		
		for(int i=0;i<transize;i++) {
			
			tran[i] = sc.nextInt();
		
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved : ");
		
		int targetsize = sc.nextInt();
		
		Transactions targetHelper = new Transactions();
		
		while(targetsize--!=0) {
			
			System.out.println("Enter the value of target : ");
			
			int target = sc.nextInt();
			
			targetHelper.targetCheck(target,tran);
			
		}

		sc.close();
	}

}
