package functionalinterface;

import java.util.function.Function;

public class IsEven implements Function<Integer, Boolean> {

	@Override
	public Boolean apply(Integer arg0) {
		return (arg0%2)==0;
	}

}
