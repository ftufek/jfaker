package org.jfaker.internal;

public class Address {
	private Runtime runtime;
	
	public Address(Runtime r){
		runtime = r;
	}
	
	public String zipCode() {
		return runtime.evalStr("Address", "zipCode");
	}

//	public String zipCodeFormat() {
//		return runtime.evalStr("Address", "zipCodeFormat");
//	}

	public String city() {
		return runtime.evalStr("Address", "city");
	}

	public String streetName() {
		return runtime.evalStr("Address", "streetName");
	}

	public String streetAddress() {
		return runtime.evalStr("Address", "streetAddress");
	}

	public String secondaryAddress() {
		return runtime.evalStr("Address", "secondaryAddress");
	}

	public String brState() {
		return runtime.evalStr("Address", "brState");
	}

	public String ukCounty() {
		return runtime.evalStr("Address", "ukCounty");
	}

	public String ukCountry() {
		return runtime.evalStr("Address", "ukCountry");
	}

	public String usState() {
		return runtime.evalStr("Address", "usState");
	}

	public String latitude() {
		return runtime.evalStr("Address", "latitude");
	}

	public String longitude() {
		return runtime.evalStr("Address", "longitude");
	}
}
