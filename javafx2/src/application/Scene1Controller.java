package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Scene1Controller {

	@FXML
	TextField nameTextField1;
	
	@FXML
	TextField nameTextField;
	
	@FXML
	TextField nameTextField2;
	
	@FXML
	TextField nameTextField3;
	
	@FXML
	TextField nameTextField4;
	
	@FXML
	TextField nameTextField5;
	
	@FXML
	TextField nameTextField6;
	
	@FXML
	TextField nameTextField7;

	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void login(ActionEvent event) throws IOException {
		
		
		String Username = nameTextField.getText();
		
		String Password = nameTextField1.getText();
		
		String Name = nameTextField2.getText();
		
		String Email_Address = nameTextField3.getText();
		
		String Age = nameTextField4.getText();
		
		String Gender = nameTextField5.getText();
		
		String Height = nameTextField6.getText();
		
		String Weight = nameTextField7.getText();
		
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));	
		root = loader.load();	
		
		Scene2Controller scene2Controller = loader.getController();
		scene2Controller.displayName(Username);
		
		Scene2Controller scene2Controller1 = loader.getController();
		scene2Controller1.displayName1(Password);
		
        Scene2Controller scene2Controller2 = loader.getController();
		scene2Controller2.displayName2(Name);
		
		
        Scene2Controller scene2Controller3 = loader.getController();		
		scene2Controller3.displayName3(Email_Address);
		
		
        Scene2Controller scene2Controller4 = loader.getController();		
		scene2Controller4.displayName4(Age);
		
		
        Scene2Controller scene2Controller5 = loader.getController();		
		scene2Controller5.displayName5(Gender);
		
		
        Scene2Controller scene2Controller6 = loader.getController();		
		scene2Controller6.displayName6(Height);
		
		
        Scene2Controller scene2Controller7 = loader.getController();		
		scene2Controller7.displayName7(Weight);
		
		
		//root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));	
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();

		
	}
}