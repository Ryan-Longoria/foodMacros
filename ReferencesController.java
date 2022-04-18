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
import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * This class will show references
 * 
 * @author Ryan Longoria 
 * @id iex998
 */
public class ReferencesController extends Application
{
	/**
	 * This function will set roots, scenes, and stages for all controllers.
	 * This sets up buttons basically.
	 */
	@Override
	public void start(Stage stage) throws Exception
	{
		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
	
		Scene scene = new Scene(root);
	
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	TextArea info;
	
	@FXML
	Button previous;

	@FXML
	TextField title;
	
	/**
	 * @param event: allows button click to home
	 * @throws IOException
	 */
	@FXML
	private void previousClick(ActionEvent event) throws IOException
	{
		Parent home_parent = FXMLLoader.load(getClass().getResource("Main.FXML"));
		Scene home_scene = new Scene(home_parent);
		Stage home_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		home_stage.setScene(home_scene);
		home_stage.show();
	}
}
