/**
 * @author Angela Rizzo (hpo347)
 * UTSA CS 3443 - Team Project
 * Fall 2022
 * 
 * TO DO:
 * - First Name Text Box
 * - Last Name Text Box
 * - Address
 * - Phone Number
 * - Height
 * - Weight
 * - Patient History
 *    > Are you diabetic? Y/N
 *    > Have you ever experienced: Heart Disease? Y/N
 *    > Have you ever experienced: Cancer? Y/N
 *    > Have you ever experienced: High Blood Pressure? Y/N
 *    > Have you ever experienced: Seizures? Y/N
 * 
 * - Save Data from Customers!
 */

package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	public static Stage stage;

	@Override
	public void start(Stage primaryStage) {
		try {
			//give access to the other controllers to this primary stage
			stage = primaryStage;
			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/Information.fxml"));
			AnchorPane layout = (AnchorPane) loader.load();
			
			Scene scene = new Scene(layout);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
