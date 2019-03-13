package it.polito.tdp.alien;

public class WordEnhanced {
	
	private String alienWord;
	private String translation;
	
	
	public WordEnhanced(String alienWord, String translation) {
		this.alienWord=alienWord;
		this.translation=translation;
	}


	public String getAlienWord() {
		return alienWord;
	}


	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}
	

	public String getTranslation() {
		return translation;
	}


	public void setTranslation(String translation) {
		this.translation = this.translation +" / "+ translation;
	}

}
