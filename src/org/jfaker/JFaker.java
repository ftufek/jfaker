package org.jfaker;

import java.io.InputStreamReader;
import java.io.Reader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JFaker {
	private ScriptEngine engine;

	public JFaker() {
		ScriptEngineManager factory = new ScriptEngineManager();
		engine = factory.getEngineByName("JavaScript");

		Reader faker = new InputStreamReader(getClass().getClassLoader()
				.getResourceAsStream("Faker.js"));
		try {
			engine.eval(faker);
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param module
	 *            Name, Adress, PhoneNumber, etc. Must be a String
	 * @param function
	 * @return
	 */
	public String evalStr(String module, String function) {
		try {
			engine.eval("var temp = (Faker." + module + "." + function + "())");
		} catch (ScriptException e) {
			e.printStackTrace();
		}
		return (String) engine.get("temp");
	}

	/* Name module */
	public String firstName() {
		return evalStr("Name", "firstName");
	}

	public String lastName() {
		return evalStr("Name", "lastName");
	}

	public String findName() {
		return evalStr("Name", "findName");
	}

	/* Address module */
	public String zipCode() {
		return evalStr("Address", "zipCode");
	}

//	public String zipCodeFormat() {
//		return evalStr("Address", "zipCodeFormat");
//	}

	public String city() {
		return evalStr("Address", "city");
	}

	public String streetName() {
		return evalStr("Address", "streetName");
	}

	public String streetAddress() {
		return evalStr("Address", "streetAddress");
	}

	public String secondaryAddress() {
		return evalStr("Address", "secondaryAddress");
	}

	public String brState() {
		return evalStr("Address", "brState");
	}

	public String ukCounty() {
		return evalStr("Address", "ukCounty");
	}

	public String ukCountry() {
		return evalStr("Address", "ukCountry");
	}

	public String usState() {
		return evalStr("Address", "usState");
	}

	public String latitude() {
		return evalStr("Address", "latitude");
	}

	public String longitude() {
		return evalStr("Address", "longitude");
	}
	
	/* PhoneNumber module */
	public String phoneNumber(){
		return evalStr("PhoneNumber", "phoneNumber");
	}
	
	/* Internet module */
	public String email(){
		return evalStr("Internet", "email");
	}

	public String userName(){
		return evalStr("Internet", "userName");
	}
	
	public String domainName(){
		return evalStr("Internet", "domainName");
	}
	
	public String domainWord(){
		return evalStr("Internet", "domainWord");
	}
	
	public String ip(){
		return evalStr("Internet", "ip");
	}
}
