package application.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class InformationController implements EventHandler<ActionEvent>{
	
	@FXML TextField firstNameTextField;
	@FXML TextField lastNameTextField;
	@FXML TextField streetTextField;
	@FXML TextField cityTextField;
	@FXML TextField stateTextField;
	@FXML TextField zipTextField;
	@FXML TextField phoneNumberTextField;
	@FXML TextField heightFeetTextField;
	@FXML TextField heightInchesTextField;
	@FXML TextField weightTextField;
	@FXML Button saveButton;
	@FXML Button nextButton;

	File file = new File("../data/biometric.csv");
	
	//HashMap<String, String, String, String, String, String, String, String, String, String> biometricInfo = new HashMap<>();
	String[] biometricInfo = new String[9];
	
	@Override
	public void handle(ActionEvent event) {
		System.out.println("Save button clicked");
		System.out.println("Entering biometric information to biometric.csv file");
		String firstName = firstNameTextField.getText();
		String lastName = lastNameTextField.getText();
		String streetName = streetTextField.getText();
		String city = cityTextField.getText();
		String state = stateTextField.getText();
		String zip = zipTextField.getText();
		String phoneNumber = phoneNumberTextField.getText();
		String heightInFeet = heightFeetTextField.getText();
		String heightInInches = heightInchesTextField.getText();
		String weight = weightTextField.getText();
		
		try {
			updateBiometricInformation();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void updateBiometricInformation() throws IOException {
		Scanner scanner = new Scanner(System.in);
		//biometricInfo.clear();
		//biometricInfo = new HashMap<>();
		while(scanner.hasNext()) {
			String[] biometric = scanner.nextLine().split(",");
			//biometricInfo.put(...);
		}
	}
	
	public void writeToFile() throws IOException {
		String firstName = firstNameTextField.getText();
		String lastName = lastNameTextField.getText();
		String streetName = streetTextField.getText();
		String city = cityTextField.getText();
		String state = stateTextField.getText();
		String zip = zipTextField.getText();
		String phoneNumber = phoneNumberTextField.getText();
		String heightInFeet = heightFeetTextField.getText();
		String heightInInches = heightInchesTextField.getText();
		String weight = weightTextField.getText();
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
		writer.write(firstName + "," + lastName + "," + streetName + "," + city + "," + state + "," + zip + "," + phoneNumber + "," + 
		heightInFeet + "," + heightInInches + "," + weight + "\n");
		
		writer.close();
	}
	
}
