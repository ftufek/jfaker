package org.jfaker;

import java.io.InputStreamReader;
import java.io.Reader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JFaker {
	private ScriptEngine engine;
	
	public JFaker() throws ScriptException{
        ScriptEngineManager factory = new ScriptEngineManager();
        engine = factory.getEngineByName("JavaScript");
        
        Reader faker =new InputStreamReader(getClass().getClassLoader().getResourceAsStream("Faker.js"));
        engine.eval(faker);
	}
	
	public String test() throws ScriptException{
        engine.eval("print(Faker.Name.findName())");
        return "";
	}
}
