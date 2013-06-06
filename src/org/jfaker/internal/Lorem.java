package org.jfaker.internal;

public class Lorem {
	private Runtime runtime;
	
	public Lorem(Runtime r){
		runtime = r;
	}
	
	public String[] words(){
		return words(3);
	}
	
	public String[] words(int n){
		return runtime.evalArr("Lorem", "words", Integer.toString(n));
	}
	
	public String sentence(){
		return sentence(3);
	}
	
	public String sentence(int n){
		return runtime.evalStr("Lorem", "sentence", Integer.toString(n));
	}

	public String sentences(){
		return sentences(3);
	}
	
	public String sentences(int n){
		return runtime.evalStr("Lorem", "sentences", Integer.toString(n));
	}

	public String paragraph(){
		return paragraph(3);
	}
	
	public String paragraph(int n){
		return runtime.evalStr("Lorem", "paragraph", Integer.toString(n));
	}

	public String paragraphs(){
		return paragraphs(3);
	}
	
	public String paragraphs(int n){
		return runtime.evalStr("Lorem", "paragraphs", Integer.toString(n));
	}
}
