package com.greatlearning.paymoney;

public class Transactions {
	
	public void targetCheck(int target, int[] transactionArray) {
		
		long sum=0;
		int flag = 0;
		
		for(int i=0; i<transactionArray.length; i++) {
			
			sum += transactionArray[i];
			
			if(sum >= target) {
				
				System.out.println("\nTarget achieved after "+(i+1)+" transactions \n");
				flag=1;
				break;
			}
		}
		
		if(flag!=1) {
			
			System.out.println("Given target is not achieved");
		}
	}

}
