package application;
import javafx.event.ActionEvent;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

/**
 * This class will show info about calories and macros
 * 
 * @author Ryan Longoria 
 * @id iex998
 */
public class InfoController extends Application 
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
	TextField infosect;
	
	@FXML
	Button home;
	
	@FXML
	TextArea desc;
	
	/**
	 * @param event: allows button click to home
	 * @throws IOException
	 */
	@FXML
	private void homeClick(ActionEvent event) throws IOException
	{
		Parent home_parent = FXMLLoader.load(getClass().getResource("Main.FXML"));
		Scene home_scene = new Scene(home_parent);
		Stage home_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		home_stage.setScene(home_scene);
		home_stage.show();
	}
}
