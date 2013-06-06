package org.jfaker.internal;

public class PhoneNumber {
	Runtime runtime;
	
	public PhoneNumber(Runtime r){
		runtime = r;
	}
	
	public String phoneNumber(){
		return runtime.evalStr("PhoneNumber", "phoneNumber");
	}
}
