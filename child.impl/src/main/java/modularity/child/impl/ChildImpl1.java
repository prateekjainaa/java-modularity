package modularity.child.impl;

import modularity.child.api.ChildIf;

public class ChildImpl1 implements ChildIf {

	@Override
	public String greetMessage(String name) {
		
		return "welcome!!! " + name;
	}

}
