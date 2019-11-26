package functionalinterface;

import java.util.function.Consumer;

public class Display implements Consumer<Object> {

	@Override
	public void accept(Object arg0) {
		System.out.println( arg0.toString() );
	}

}
