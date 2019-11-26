package functionalinterface;

import java.util.function.BiFunction;

public class AreNumbersOppositeSign implements BiFunction<Integer, Integer, Boolean> {

	@Override
	public Boolean apply(Integer arg0, Integer arg1) {
		return (arg0*arg1)<0;
	}

}
