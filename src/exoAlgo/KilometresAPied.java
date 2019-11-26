package exoAlgo;

public class KilometresAPied {

	public static void main(String[] args) {
		int steps = 15;
		
		for(int i=1;i<= steps;i++) {
			System.out.println(
				  i+" kilomètre"+(i==1?"":"s")+" à pied, ça use, ça use,\n"
				+ i+" kilomètre"+(i==1?"":"s")+" à pied ça use les souliers.\n"
			);
		}
	}
}
