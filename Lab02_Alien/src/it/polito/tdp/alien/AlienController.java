package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
	AlienDictionary a;
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
    
        
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	
    	a = new AlienDictionary();
    	
    }
  
    
    @FXML
    void doTranslate(ActionEvent event) {
    	String parolaScritta = txtWord.getText().trim();
    	if(parolaScritta.contains("> <")) {
    		String risultato[] = parolaScritta.split("> <");
    		String alienWord = (risultato[0].substring(1)).trim().toLowerCase();
    		String translation = (risultato[1].substring(0, risultato[1].length()-1)).trim().toLowerCase();
    		a.AddWord(alienWord, translation);
    		txtResult.appendText(a.translateWord(alienWord)+"\n");
    		txtWord.clear();
    	
    	}
    	
    	if(!parolaScritta.contains("> <")) {
    		String alienWord = (parolaScritta.substring(1, parolaScritta.length()-1)).trim().toLowerCase();
    		String translation = a.translateWord(alienWord);
    		txtResult.appendText(translation+"\n");
    		txtWord.clear();
    	}
    	    	
    }
    
    
    @FXML
    void doReset(ActionEvent event) {
    	
    	a.clearLista();
    	txtResult.clear();

    }
    
}
