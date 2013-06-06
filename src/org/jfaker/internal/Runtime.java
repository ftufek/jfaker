package org.jfaker.internal;

import java.io.InputStreamReader;
import java.io.Reader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Runtime {
	private ScriptEngine engine;
	
	public Runtime(){
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
	 * @param module Name, Adress, PhoneNumber, etc. Must be a String
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
}
