package org.jfaker.internal;

public class Company {
	private Runtime runtime;
	
	public Company(Runtime r){
		runtime = r;
	}
	
	public String[] suffixes(){
		return runtime.evalArr("Company", "suffixes");
	}
}
