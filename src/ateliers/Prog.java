package ateliers;

import java.util.Arrays;
import java.util.Scanner;

//solve some simple problems given by an external document
public class Prog {

	public static void main(String[] args) {
		Prog p = new Prog();
		p.atelier2();
		p.atelier3();
		p.atelier4();
		p.atelier5();
		p.atelier6();
		p.atelier7();
		p.atelier8();
		p.atelier9();
		p.atelier10();
		p.atelier11();
	}

	public void atelier2() {
		//define a few variables
		char c = 'c';
		String string = "String";
		byte b = 27;
		int i = -12345;
		double d = Math.PI;
		
		//print the variables
		System.out.println(c+"\n"+string+"\n"+b+"\n"+i+"\n"+d);
		
		//happy end
		System.out.println("Fin de l'atelier 2!\n");
	}

	public void atelier3() {
		Scanner sc = new Scanner(System.in);
		String lastName, firstName,age;
		
		//just asking some questions
		//no validity check asked
		System.out.print("Votre Nom :");
		lastName = sc.nextLine();
		
		System.out.print("Votre Prénom :");
		firstName = sc.nextLine();
		
		System.out.print("Votre Age :");
		age = sc.nextLine();
		
		//print collected data
		System.out.println("Nom : "+lastName
				+ "\nPrénom : "+firstName
				+ "\nAge : "+age);
		sc.close();//mandatory
		
		//happy end
		System.out.println("Fin de l'atelier 3!\n");
	}

	public void atelier4() {
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		//gather some data
		System.out.print("Donne moi un nombre a : ");
		a = sc.nextInt();
		System.out.println("Un autre, disons b : ");
		b = sc.nextInt();

		//doing math
		System.out.println("leur somme : " + (a+b));
		System.out.println("a - b : " + (a-b));
		System.out.println("leur produit : " + (a*b));
		System.out.println("la division de a par b : "
				+ (b!=0 ? a/b : "n'est pas possible") );
		System.out.println("le reste de la division de a par b : "
				+ (b!=0 ? a%b : "n'est pas possible"));
		System.out.println("a+b-(a/b) : "
				+ (b!=0 ? a+b-(a/b) : "n'est pas possible" ) );
		System.out.println("a+(b-a)/b : "
				+ (b!=0 ? a+(b-a)/b : "n'est pas possible" ) );

		//some more math
		System.out.println("a=b? "   + (a==b) );
		System.out.println("a=/=b? " + (a!=b) );
		System.out.println("a>=b? "  + (a>=b) );
		System.out.println("a>b? "   + (a>b)  );
		System.out.println("a<=b? "  + (a<=b) );
		System.out.println("a<b? "   + (a<b)  );
		
		sc.close();//mandatory
		
		//and now for some formal logic
		boolean c = true;
		boolean d = false;
		System.out.println("T AND F : " + (c&&d) );
		System.out.println("T OR F : "  + (c||d) );
		System.out.println("NOT T : " + !c );
		
		//happy end
		System.out.println("Fin de l'atelier 4!");
	}

	@SuppressWarnings("unused")
	public void atelier5() {
		byte a = 127;
		short b = 32767;
		//b = a;
		//System.out.println(b);//print 127
		
		//a = b;//not allowed
	}

	public void atelier6() {//some String equality tests
		String s  = "Chaîne de caractères";
		String s2 = new String("Une autre chaîne de caractères");
		String s3 = new String("Chaîne de caractères");
		String s4 = "Chaîne de caractères";

		System.out.println(s==s2);
		System.out.println(s==s3);
		System.out.println(s==s4);
		System.out.println(s=="Chaîne de caractères");
		System.out.print("\n");
		
		System.out.println(s.equals(s2));
		System.out.println(s.equals(s3));
		System.out.println(s.equals(s4));
		System.out.println(s.equals("Chaîne de caractères"));
		System.out.print("\n");

		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.indexOf('i'));
	}

	public void atelier7() {//Some math lib tests
		System.out.println(Math.min(2,  3));
		System.out.println(Math.max(2,  3));
		System.out.println(Math.abs(-3));
		System.out.println(Math.random());
	}

	public void atelier8() {//boolean/conditional tests now...

		boolean a = true;
		boolean b = false;
		byte c = 1;
		byte d = 2;

		if(a) {
			System.out.println("a");
		}
		if(b) {
			System.out.println("b");
		}
		if(c==d) {
			System.out.println("c=d");
		} else {
			if(c==1) {
				System.out.println("c=1");
			}
			if(d==2) {
				System.out.println("d=2");
			}
			System.out.println("c different de d");
		}
		if(c>d) {
			System.out.println("c > d");
		}
		
		int x = 5;
		switch(x) {
			case 1 :
				System.out.println("x=1");
				break;
			case 2 :
				System.out.println("x=2");
				break;
			case 5 :
				System.out.println("x=5");
				break;
			default :
				System.out.println("x = ?");
		}
	}
	
	public void atelier9() {//loop tests now...
		int i = 1;
		while(i <= 5) {
			System.out.println(i);
			i++;
		}
		
		do {
			System.out.println("once");
		} while(false);
		
		for(i=1;i<=5;i++) {
			System.out.println(i);
		}
	}
	
	public void atelier10() {//hey! array tests!
		String[] pokemons = {"Pikachu","Bulbizare","Salameche","Carapuce","Racaillou"};
		Arrays.parallelSort(pokemons);
		for(String p : pokemons) {
			System.out.println(p);
		}
		System.out.println(Arrays.binarySearch(pokemons, "Carapuce"));
		
		String[][] evolutions = {
				{"Pikachu", "Raichu"},
				{"Bublizare", "Herbizare", "Florizare"},
				{"Carapuce", "Carabaffe", "Tortank"},
				{"Salameche" ,"Reptincel", "Dracofeu"},
				{"Racaillou"}
		};
		for(String[] list : evolutions) {
			System.out.println("Famille d'evolution de "+list[0]);
			for(String p : list) {
				System.out.print(p+" ");
			}
			System.out.print("\n\n");
		}
	}
	
	public void atelier11() {//guess a number without hint
		int goal = (int)(10*Math.random());
		int tries = 5;
		int guess = -1;//value doesn't matter, just for the sake of init
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Règles :\n" + 
				"1. Un nombre entre 1 et 10 va être généré aléatoirement\n" + 
				"2. Vous avez 5 chances pour retrouver ce nombre\n" + 
				"Veuillez entrer votre pseudo :");
		String pseudo = sc.nextLine();
		
		while(guess != goal && tries>0) {//until good guess or no try left
			System.out.print("Essais restants : "+tries+"\nTa proposition : ");
			guess = sc.nextInt();
			tries--;
		}
		
		System.out.println(pseudo+(guess==goal?" WIN":" LOOSE"));
		
		sc.close();//mandatory
	}
}
