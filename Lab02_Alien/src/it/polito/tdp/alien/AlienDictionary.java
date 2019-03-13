package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	
	private List<WordEnhanced> dizionario = new LinkedList<WordEnhanced>();
	
	
	public AlienDictionary() {
		
	}
	
	public void AddWord(String alienWord, String translation) {
		WordEnhanced newParola = new WordEnhanced(alienWord, translation);
		
		boolean trovato = false;
		for(int i=0; i<dizionario.size(); i++) {
			if(dizionario.get(i).getAlienWord().compareTo(alienWord)==0) {
				dizionario.get(i).setTranslation(translation);
				trovato = true;
			}
		}
		
		if(trovato == false)
		dizionario.add(newParola);
		
	}
	
	public String translateWord(String alienWord) {
		
		String translation = null;
		for(int i=0; i<dizionario.size(); i++) {
			if(dizionario.get(i).getAlienWord().compareTo(alienWord)==0)
				translation = dizionario.get(i).getTranslation();
		}
		
		return translation;
	}
	
	public void clearLista() {
		
		dizionario.clear();
		
	}

	
}
