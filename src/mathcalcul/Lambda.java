package mathcalcul;

public class Lambda {

	public static int calculer(int a, int b, Calcul op) {
		return op.calc(a, b);
	}

	public static void main(String[] args) {
		int a = 3;
		int b = 5;

		System.out.println( calculer(a, b, (int x, int y) -> x+y) );
		System.out.println( calculer(a, b, (int x, int y) -> x*y) );
	}
}
