package org.jfaker.internal;

public class PhoneNumber {
	Runtime runtime;
	
	public PhoneNumber(Runtime r){
		runtime = r;
	}
	
	public String phoneNumber(){
		return runtime.evalStr("PhoneNumber", "phoneNumber");
	}
	
	
	/**
	 *  
	 * @param format 0 : "###-###-####"
	 * 				 1 : "(###)###-####"
	 * 				 2 : "1-###-###-####"
	 * 				 3 : "###.###.####"
	 * 				 4 : "###-###-####"
	 * 			   	 5 : "(###)###-####"
	 * 				 6 : "1-###-###-####"
	 * 				 7 : "###.###.####"
	 * 				 8 : "###-###-#### x###"
	 *  			 9 : "(###)###-#### x###"
	 *  			 10 : "1-###-###-#### x###"
	 *  			 11 : "###.###.#### x###"
	 *  			 12 : "###-###-#### x####"
	 *  			 13 : "(###)###-#### x####"
	 *  			 14 : "1-###-###-#### x####"
	 *  			 15 : "###.###.#### x####"
	 *  			 16 : "###-###-#### x#####"
	 *  			 17 : "(###)###-#### x#####"
	 *  			 18 : "1-###-###-#### x#####"
	 *  			 19 : "###.###.#### x#####"
	 * @return
	 */
	public String phoneNumberFormat(int format){
		return runtime.evalStr("PhoneNumber", "phoneNumber",Integer.toString(format));
	}
}
