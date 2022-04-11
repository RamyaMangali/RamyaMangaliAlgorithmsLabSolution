package com.greatlearning.currencydenomination;

import java.util.Scanner;

import com.greatlearning.currencydenomination.service.Mergesort;
import com.greatlearning.currencydenomination.service.NotesCount;

public class CurrencyDriver {
	
	public static void main(String[] args) {
		
		Mergesort mergesort = new Mergesort();
		NotesCount notesCount = new NotesCount();
		
		System.out.println("Enter the size of currency denominations : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] notes = new int[size];
		System.out.println("\nEnter the currency denominations value :");
		for(int i=0; i<size; i++) {
			
			notes[i] = sc.nextInt();
		}
		
		System.out.println("\nEnter the amount you want to pay : ");
		int amount = sc.nextInt();
		
		mergesort.sort(notes,0,notes.length-1);
		notesCount.notesCountImplementation(notes,amount);
		
		sc.close();
	}

}
