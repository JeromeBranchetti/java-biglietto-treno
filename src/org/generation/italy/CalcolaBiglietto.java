package org.generation.italy;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		// TODO Auto-generated method stubù
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Inserire numero chilometri viaggio: ");
		double numKm = scan.nextDouble();
		System.out.print("Quanti anni ha il passeggero: ");
		int age = scan.nextInt();
		double rate = 0.21;
		double total;
		
		double basePrice = numKm * rate;
		
		if (age > 0 && age < 120) {
			if (age < 18) {
				total = basePrice * 0.80;
			}
			else if (age > 65) {
				total = basePrice * 0.60;
							
			}
			else {
				total = basePrice;
			}
			System.out.print("Il costo totale del viaggio è: " + total + "€");
			
		}
		else {
			System.out.print("Inserisci una età valida");
		}
		
		
		
	
		scan.close();
	}

}
