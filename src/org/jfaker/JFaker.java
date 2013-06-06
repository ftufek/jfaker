package org.jfaker;

import org.jfaker.internal.Address;
import org.jfaker.internal.Name;
import org.jfaker.internal.PhoneNumber;
import org.jfaker.internal.Runtime;

public class JFaker {
	Runtime runtime;
	
	public Name Name;
	public Address Address;
	public PhoneNumber PhoneNumber;

	public JFaker() {
		runtime = new Runtime();
		
		Name = new Name(runtime);
		Address = new Address(runtime);
		PhoneNumber = new PhoneNumber(runtime);
	}

	
	/* Internet module */
	public String email(){
		return runtime.evalStr("Internet", "email");
	}

	public String userName(){
		return runtime.evalStr("Internet", "userName");
	}
	
	public String domainName(){
		return runtime.evalStr("Internet", "domainName");
	}
	
	public String domainWord(){
		return runtime.evalStr("Internet", "domainWord");
	}
	
	public String ip(){
		return runtime.evalStr("Internet", "ip");
	}
	
	
}
