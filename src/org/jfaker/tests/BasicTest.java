package org.jfaker.tests;

import javax.script.ScriptException;

import org.jfaker.JFaker;
import org.junit.Before;
import org.junit.Test;

public class BasicTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() throws ScriptException {
		System.out.println(new JFaker().test());
	}

}
