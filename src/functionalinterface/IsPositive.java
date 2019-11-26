package functionalinterface;

import java.util.function.Function;

public class IsPositive implements Function<Integer, Boolean> {

	@Override
	public Boolean apply(Integer arg0) {
		return arg0>=0;
	}

}
