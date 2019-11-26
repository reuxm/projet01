package functionalinterface;

import java.util.function.Function;

public class Square implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer arg0) {
		return arg0*arg0;
	}

}
