package org.jfaker.internal;

public class Company {
	private Runtime runtime;
	
	public Company(Runtime r){
		runtime = r;
	}
	
	public String[] suffixes(){
		return runtime.evalArr("Company", "suffixes");
	}
	
	public String companyName(){
		return runtime.evalStr("Company", "companyName");
	}
	
	public String companySuffix(){
		return runtime.evalStr("Company", "companySuffix");
	}
	
	public String catchPhrase(){
		return runtime.evalStr("Company", "catchPhrase");
	}
	
	public String bs(){
		return runtime.evalStr("Company", "bs");
	}
}
