package mathcalcul;

public class Anon {

	public static int calculer(int a, int b, Calcul op) {
		return op.calc(a, b);
	}

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		
		System.out.println( calculer(a, b, new Calcul() {
			@Override
			public int calc(int a, int b) {
				return a+b;
			}
		}) );
		
		System.out.println( calculer(a, b, new Calcul() {
			@Override
			public int calc(int a, int b) {
				return a*b;
			}
		}) );
	}
}
