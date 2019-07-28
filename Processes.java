import nl.cwi.reo.runtime.Input;
import nl.cwi.reo.runtime.Output;

public class Processes {

	public static void Producer1(Output<String> port) {
		while (true) {
			for (int i = 0; i < 30000000; ++i);
			String datum = "I'm producer 01.";
			port.put(datum);
		}
	}

	public static void Producer2(Output<String> port) {
		while (true) {
			for (int i = 0; i < 50000000; ++i);
			String datum = "I'm producer 02.";
			port.put(datum);
		}
	}

	public static void Consumer(Input<String> port) {
		System.out.println("I'm consumer.");
		for (int k = 0; k < 10; ++k) {
			for (int i = 0; i < 40000000; ++i);
			String datum = port.get();
			System.out.println(datum);
		}
		System.exit(0);
	}
}
