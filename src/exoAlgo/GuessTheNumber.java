package exoAlgo;

import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		int goal = (int)(Math.random()*100);
		Scanner sc = new Scanner(System.in);
		int guess = -1;
		int tries = 0;
		
		while(guess!=goal) {
			System.out.print("Donne un nombre : ");
			guess = sc.nextInt();
			if(guess>goal) {
				System.out.println("C'est moins");
			}
			if(guess<goal) {
				System.out.println("C'est plus");
			}
			tries++;
		}
		System.out.println("C'est ça. Essais : "+tries);
		
		sc.close();
	}
}
