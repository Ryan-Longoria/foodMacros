package application;
import javafx.event.ActionEvent;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Node;

/**
 * This class will show a list of foods.
 * 
 * @author Ryan Longoria 
 * @id iex998
 */
public class CalMacController extends Application
{
	/**
	 * This function will set roots, scenes, and stages for all controllers.
	 * This sets up buttons basically.
	 */
	@Override
	public void start(Stage stage) throws Exception
	{
		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		Parent root2 = FXMLLoader.load(getClass().getResource("Egg.fxml"));
		Parent root3 = FXMLLoader.load(getClass().getResource("Hamburger.fxml"));
		Parent root4 = FXMLLoader.load(getClass().getResource("Pizza.fxml"));
		Parent root5 = FXMLLoader.load(getClass().getResource("Salad.fxml"));
		Parent root6 = FXMLLoader.load(getClass().getResource("Spaghetti.fxml"));
		Parent root7 = FXMLLoader.load(getClass().getResource("Tortilla.fxml"));
		
		Scene scene = new Scene(root);
		Scene scene2 = new Scene(root2);
		Scene scene3 = new Scene(root3);
		Scene scene4 = new Scene(root4);
		Scene scene5 = new Scene(root5);
		Scene scene6 = new Scene(root6);
		Scene scene7 = new Scene(root7);
		
		stage.setScene(scene);
		stage.setScene(scene2);
		stage.setScene(scene3);
		stage.setScene(scene4);
		stage.setScene(scene5);
		stage.setScene(scene6);
		stage.setScene(scene7);
		stage.show();
	}
	
	@FXML
	TextArea instruct;
	
	@FXML
	Button home;
	
	@FXML 
	Button pizza;
	
	@FXML 
	Button burger;
	
	@FXML 
	Button spaghetti;
	
	@FXML
	Button salad;
	
	@FXML
	Button tortilla;
	
	@FXML
	Button egg;
	
	/**
	 * @param event: allows button click to home
	 * @throws IOException
	 */
	@FXML
	private void home2Click(ActionEvent event) throws IOException
	{
		Parent home_parent = FXMLLoader.load(getClass().getResource("Main.FXML"));
		Scene home_scene = new Scene(home_parent);
		Stage home_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		home_stage.setScene(home_scene);
		home_stage.show();
		// ..\Card\1.png
	}
	
	/**
	 * @param event: allows button click to pizza
	 * @throws IOException
	 */
	@FXML
	private void pizzaClick(ActionEvent event) throws IOException
	{
		Parent home_parent = FXMLLoader.load(getClass().getResource("Pizza.FXML"));
		Scene home_scene = new Scene(home_parent);
		Stage home_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		home_stage.setScene(home_scene);
		home_stage.show();
	}
	
	/**
	 * @param event: allows button click to burger
	 * @throws IOException
	 */
	@FXML
	private void burgerClick(ActionEvent event) throws IOException
	{
		Parent home_parent = FXMLLoader.load(getClass().getResource("Hamburger.FXML"));
		Scene home_scene = new Scene(home_parent);
		Stage home_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		home_stage.setScene(home_scene);
		home_stage.show();
	}
	
	/**
	 * @param event: allows button click to spaghetti
	 * @throws IOException
	 */
	@FXML
	private void spaghettiClick(ActionEvent event) throws IOException
	{
		Parent home_parent = FXMLLoader.load(getClass().getResource("Spaghetti.FXML"));
		Scene home_scene = new Scene(home_parent);
		Stage home_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		home_stage.setScene(home_scene);
		home_stage.show();
	}
	
	/**
	 * @param event: allows button click to salad
	 * @throws IOException
	 */
	@FXML
	private void saladClick(ActionEvent event) throws IOException
	{
		Parent home_parent = FXMLLoader.load(getClass().getResource("Salad.FXML"));
		Scene home_scene = new Scene(home_parent);
		Stage home_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		home_stage.setScene(home_scene);
		home_stage.show();
	}
	
	/**
	 * @param event: allows button click to tortilla
	 * @throws IOException
	 */
	@FXML
	private void tortillaClick(ActionEvent event) throws IOException
	{
		Parent home_parent = FXMLLoader.load(getClass().getResource("Tortilla.FXML"));
		Scene home_scene = new Scene(home_parent);
		Stage home_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		home_stage.setScene(home_scene);
		home_stage.show();
	}
	
	/**
	 * @param event: allows button click to egg
	 * @throws IOException
	 */
	@FXML
	private void eggClick(ActionEvent event) throws IOException
	{
		Parent home_parent = FXMLLoader.load(getClass().getResource("Egg.FXML"));
		Scene home_scene = new Scene(home_parent);
		Stage home_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		home_stage.setScene(home_scene);
		home_stage.show();
	}
}
