package org.jfaker.internal;

public class Name {
	private Runtime runtime;
	
	public Name(Runtime r){
		runtime = r;
	}
	
	public String firstName() {
		return runtime.evalStr("Name", "firstName");
	}

	public String lastName() {
		return runtime.evalStr("Name", "lastName");
	}

	public String findName() {
		return runtime.evalStr("Name", "findName");
	}
}
