package org.jfaker;

import org.jfaker.internal.Address;
import org.jfaker.internal.Company;
import org.jfaker.internal.Helper;
import org.jfaker.internal.Internet;
import org.jfaker.internal.Lorem;
import org.jfaker.internal.Name;
import org.jfaker.internal.PhoneNumber;
import org.jfaker.internal.Runtime;

public class JFaker {
	Runtime runtime;
	
	public Name Name;
	public Address Address;
	public PhoneNumber PhoneNumber;
	public Internet Internet;
	public Company Company;
	public Lorem Lorem;
	public Helper Helper;

	public JFaker() {
		runtime = new Runtime();
		
		Name = new Name(runtime);
		Address = new Address(runtime);
		PhoneNumber = new PhoneNumber(runtime);
		Internet = new Internet(runtime);
		Company = new Company(runtime);
		Lorem = new Lorem(runtime);
		Helper = new Helper();
	}	
}
