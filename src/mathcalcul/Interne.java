package mathcalcul;

public class Interne {

	public static int calculer(int a, int b, Calcul op) {
		return op.calc(a, b);
	}
	
	public static void main(String[] args) {
		int a = 3;
		int b = 5;

		System.out.println( calculer(a, b, new Addition()) );
		System.out.println( calculer(a, b, new Produit()) );
	}
	
	static class Addition implements Calcul {
		@Override
		public int calc(int a, int b) {
			return a+b;
		}
	}
	
	static class Produit implements Calcul {
		@Override
		public int calc(int a, int b) {
			return a*b;
		}
	}
}
