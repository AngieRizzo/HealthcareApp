package application.controller;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.scene.control.RadioButton;
//


import application.model.Information;



// this doesn't inherit any classes?
public class InformationController {
	
	//model declaration
	Information info;
	
	
	//Declaration of text boxes
	@FXML private TextField lastNameTextBox;
	@FXML private TextField firstNameTextBox; 
	@FXML private TextField streetAddressTextBox;
	@FXML private TextField cityTextBox;
	@FXML private TextField stateTextBox;
	@FXML private TextField zipTextBox;
	@FXML private TextField phoneNumberTextBox;
	@FXML private TextField heightFeetTextBox;
	@FXML private TextField heightInchesTextBox;
	@FXML private TextField weightTextBox;
	
	
	//declaration of radio buttons
	@FXML private RadioButton diabeticRB;
	@FXML private RadioButton cancerRB;
	@FXML private RadioButton hypertensionRB;
	@FXML private RadioButton seizureRB;
	
	
	// need to add eventListener for screen size changes on the anchor box
	
	public void initialize() {
		//create new model object
		 info = new Information();
		 
		 // include all model updates. 
		
		
	}
	
	
	//	attach this to all free texts, 
	@FXML private void changedText(Event event) {
//		 insert model call to update property
		// create model dictionary for inputs, ie name of id
		// name of id should be == to dictionary input. 
		// this will allow the model to call functions anonymously depending
		// on the source of the key event
		/*
		 * options in the model should inclued:
		 * firstNameTextBox
		 * lastNameTextBox
		 * street address, model should handle input issues. 
		 * city, st, zip, --- model should auto update if possible:::
		 * phone number, could be single entry and model should update the 
		 * 		insertion of the -
		 * 
		 * 
		 * */
		
        System.out.println(((TextInputControl) event.getSource()).getText());
    }
	
//	@FXML private void testAction(Event event) {
//		 System.out.println("hello");
//		 
//       System.out.println(event);
//   }
	
	
//	@FXML private void 
}
