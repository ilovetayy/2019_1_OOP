package oop_quiz2;

public class WordDefinitionPair {
	private String word;
	private String definition;
	
	public WordDefinitionPair(String w, String def) {
		word = w;
		definition = def;
	}
	
	public String getWord() {
		return word;
	}
	
	public String getDefinition() {
		return definition;
	}
	
	public void setWord(String w) {
		word = w;
	}
	
	public void setDefinition(String def) {
		definition = def;
	}
}
