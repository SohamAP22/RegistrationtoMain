package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Scene2Controller {


	@FXML
	Label nameLabel1;
	
	public void displayName1(String Password) {
		nameLabel1.setText("Password: " + Password);
	}
	
	@FXML
	Label nameLabel;
	
	public void displayName(String Username) {
		nameLabel.setText("Username: " + Username);
	}
	
	@FXML
	Label nameLabel2;
	
	public void displayName2(String Name) {
		nameLabel2.setText("Name: " + Name);
	}
	
	@FXML
	Label nameLabel3;
	
	public void displayName3(String Email_Address) {
		nameLabel3.setText("Email_Address: " + Email_Address);
	}
	
	@FXML
	Label nameLabel4;
	
	public void displayName4(String Age) {
		nameLabel4.setText("Age: " + Age);
	}
	
	@FXML
	Label nameLabel5;
	
	public void displayName5(String Gender) {
		nameLabel5.setText("Gender: " + Gender);
	}
	
	@FXML
	Label nameLabel6;
	
	public void displayName6(String Height) {
		nameLabel6.setText("Height: " + Height);
	}
	
	@FXML
	Label nameLabel7;
	
	public void displayName7(String Weight) {
		nameLabel7.setText("Weight: " + Weight);
	}

	
	
	
}