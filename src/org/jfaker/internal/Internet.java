package org.jfaker.internal;

public class Internet {
	public Runtime runtime;
	
	public Internet(Runtime r){
		runtime = r;
	}
	
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
