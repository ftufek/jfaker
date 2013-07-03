package org.jfaker.internal;

import java.util.Random;

public class Helper {
	Random rand;
	
	public Helper(){
		rand = new Random();
	}
	
	public String numerify(String str){
		//TODO: not very efficient, fix when have time
		String toReturn = str;
		while(toReturn.contains("#")){
			toReturn = toReturn.replace('#', String.valueOf(rand.nextInt(10)).charAt(0));
		}
		return toReturn;
	}
}
