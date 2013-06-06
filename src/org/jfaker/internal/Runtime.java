package org.jfaker.internal;

import java.io.InputStreamReader;
import java.io.Reader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import sun.org.mozilla.javascript.internal.NativeArray;

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
		return evalStr(module, function, "");
	}
	
	public String evalStr(String module, String function, String args) {
		try {
			engine.eval("var temp = (Faker." + module + "." + function + "("+args+"))");
		} catch (ScriptException e) {
			e.printStackTrace();
		}
		return (String) engine.get("temp");
	}
	
	public String[] evalArr(String module, String function){
		return evalArr(module, function, "");
	}
	
	public String[] evalArr(String module, String function, String args){
		try {
			engine.eval("var temp = (Faker." + module + "." + function + "("+args+"))");
		} catch (ScriptException e) {
			e.printStackTrace();
		}
		NativeArray na = (NativeArray) engine.get("temp");
		String[] s = new String[(int) na.getLength()];
		for (Object n : na.getIds()) {
			int index = (Integer) n;
			s[index] = (String) na.get(n);
		}
		return s;
	}
}
