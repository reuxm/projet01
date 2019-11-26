package functionalinterface;

public class Main {

	public static void main(String[] args) {
		Display display = new Display();
		Square square = new Square();
		AreNumbersOppositeSign sign = new AreNumbersOppositeSign();
		IsEven isEven = new IsEven();
		IsPositive isPositive = new IsPositive();
		Random10MaxedInt rand10 = new Random10MaxedInt();
		
		display.accept(square.apply(6));
		display.accept(sign.apply(2, -4));
		display.accept(sign.apply(2, 4));
		display.accept(isEven.apply(2));
		display.accept(isEven.apply(3));
		int val = square.apply(-2);
		display.accept(isEven.apply(val)&&isPositive.apply(val));
		display.accept(isEven.apply(-2)&&isPositive.apply(-2));
		display.accept(rand10.get());
	}

}
