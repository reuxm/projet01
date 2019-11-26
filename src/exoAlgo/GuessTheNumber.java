package exoAlgo;

import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		int goal = (int)(Math.random()*101);//we can't really get 100 with rand*100
		Scanner sc = new Scanner(System.in);
		int guess = -1;//value doesn't matter, just for the sake of init
		int tries = 0;
		
		while(guess!=goal) {
			System.out.print("Donne un nombre : ");
			guess = sc.nextInt();
			if(guess>goal) {
				System.out.println("C'est moins");
			}
			if(guess<goal) {
				System.out.println("C'est plus");
			}//no else for ==, we just get out
			tries++;
		}
		System.out.println("C'est ça. Essais : "+tries);
		
		sc.close();//mandatory
	}
}
