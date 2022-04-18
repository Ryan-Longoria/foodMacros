package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.application.Application;

/**
 * This class will show egg info
 * 
 * @author Ryan Longoria  
 * @id iex998
 */
public class EggController extends Application
{
	/**
	 * This function will set roots, scenes, and stages for all controllers.
	 * This sets up buttons basically.
	 */
	@Override
	public void start(Stage stage) throws Exception
	{
		Parent root = FXMLLoader.load(getClass().getResource("CalMac.fxml"));
		
		Scene scene = new Scene(root);
		
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	TextArea info;
	
	@FXML
	Button previous;
	
	@FXML
	TextField egg;
	
	/**
	 * @param event: allows button click to previous
	 * @throws IOException
	 */
	@FXML
	private void previousClick(ActionEvent event) throws IOException
	{
		Parent home_parent = FXMLLoader.load(getClass().getResource("CalMac.FXML"));
		Scene home_scene = new Scene(home_parent);
		Stage home_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		home_stage.setScene(home_scene);
		home_stage.show();
	}
}
