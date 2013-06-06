package org.jfaker.tests;

import javax.script.ScriptException;

import org.jfaker.JFaker;
import org.junit.Before;
import org.junit.Test;

public class BasicTest {
	JFaker faker;

	@Before
	public void setUp() throws Exception {
		faker = new JFaker();
	}
	
	private void p(String str){
		System.out.println(str);
	}

	@Test
	public void test() throws ScriptException {
		p(faker.Lorem.paragraphs(100));
	}

}
