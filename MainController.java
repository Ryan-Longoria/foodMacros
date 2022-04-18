package application;
import javafx.event.ActionEvent;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

/**
 * This class will show the home screen
 * 
 * @author Ryan Longoria 
 * @id iex998
 */
public class MainController extends Application
{
	/**
	 * This function will set roots, scenes, and stages for all controllers.
	 * This sets up buttons basically.
	 */
	@Override
	public void start(Stage stage) throws Exception
	{
		Parent root = FXMLLoader.load(getClass().getResource("Info.fxml"));
		Parent root2 = FXMLLoader.load(getClass().getResource("CalMac.fxml"));
		Parent root3 = FXMLLoader.load(getClass().getResource("References.fxml"));
		Scene scene = new Scene(root);
		Scene scene2 = new Scene(root2);
		Scene scene3 = new Scene(root3);
		
		stage.setScene(scene);
		stage.setScene(scene2);
		stage.setScene(scene3);
		stage.show();
	}
	
	
	@FXML
	Button info;

	@FXML
	TextField title;
	
	@FXML
	Button foods;
	
	@FXML
	Button references;
	
	/**
	 * @param event: allows button click to info
	 * @throws IOException
	 */
	@FXML
	private void infoClick(ActionEvent event) throws IOException
	{
		Parent home_parent = FXMLLoader.load(getClass().getResource("Info.FXML"));
		Scene home_scene = new Scene(home_parent);
		Stage home_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		home_stage.setScene(home_scene);
		home_stage.show();
	}
	
	/**
	 * @param event: allows button click to food
	 * @throws IOException
	 */
	@FXML
	private void foodClick(ActionEvent event) throws IOException
	{
		Parent home_parent = FXMLLoader.load(getClass().getResource("CalMac.FXML"));
		Scene home_scene = new Scene(home_parent);
		Stage home_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		home_stage.setScene(home_scene);
		home_stage.show();
	}
	
	/**
	 * @param event: allows button click to references
	 * @throws IOException
	 */
	@FXML
	private void referencesClick(ActionEvent event) throws IOException
	{
		Parent home_parent = FXMLLoader.load(getClass().getResource("References.FXML"));
		Scene home_scene = new Scene(home_parent);
		Stage home_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		home_stage.setScene(home_scene);
		home_stage.show();
	}
}
