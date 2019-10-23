package modularity.child.runner;

import modularity.child.api.ChildIf;
import modularity.child.impl.ChildImpl1;

public class Runner {

	public static void main(String[] args) {
		ChildIf intf = new ChildImpl1();
		System.out.println(intf.greetMessage("Prateek"));
	}

}
