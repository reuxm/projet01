package exoAlgo;

import java.util.Scanner;

public class Sapins {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Taille des sapins : ");
		int height = sc.nextInt();
		sc.close();
		
		for(int i=1;i<=height;i++) {
			for(int j=0;j<height*2;j++) {
				System.out.print( (Math.abs(height-j))>=i?" ":"*" );//distance to center
			}
			System.out.print("\n");
		}
		
		System.out.println("\n\n");
		
		for(int i=1;i<=height*2;i++) {
			for(int j=1;j<=height;j++) {
				System.out.print( height-Math.abs(height-i)>=j?"*":" " );//distance to the base + shift to 0
			}
			System.out.print("\n");
		}
		
		System.out.println("\n\n");
		
		for(int i=1;i<=height;i++) {
			for(int j=1;j<=(2*height)+1;j++) {
				System.out.print( test_sapin(i, j, height)?"*":" " );
			}
			System.out.print("\n\n");
		}
	}

	private static boolean test_sapin(int i, int j, int height) {
		int distance = Math.abs(height-j+1);//+1 to shift the center to the right
		return (i==height)//bottom
				|| (i==1 && j==height)//OR top
				|| (i>1 && distance<=i && distance%2==1);//OR half the branches
	}

}
