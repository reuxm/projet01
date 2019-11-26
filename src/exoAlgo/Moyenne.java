package exoAlgo;

import java.util.ArrayList;
import java.util.Scanner;

public class Moyenne {

	public static void main(String[] arfs) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Combien de nombres à prendre en compte : ");
		int numbers = sc.nextInt();
		
		ArrayList<Integer> values = new ArrayList<Integer>();//user-controlled list' size. yeah!
		for(int i=0; i<numbers;i++) {
			System.out.print("Nombre n°"+(i+1)+" : ");
			values.add( sc.nextInt() );
		}
		
		sc.close();//mandatory
		
		double moyenne = 0;
		int somme = 0;
		for(Integer i : values) {
			moyenne += ((double)i)/numbers;
			somme += i;
		}

		System.out.println("moyenne : "+moyenne);
		System.out.println("somme : "+somme);
	}
}
