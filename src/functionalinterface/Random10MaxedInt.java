package functionalinterface;

import java.util.function.Supplier;

public class Random10MaxedInt implements Supplier<Integer> {

	@Override
	public Integer get() {
		return (int)(10*Math.random());
	}

}
