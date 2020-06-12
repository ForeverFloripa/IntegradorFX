package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		try {
			Pane root = FXMLLoader.load(getClass().getResource("/view/Layout.fxml"));
			Scene scene = new Scene(root,640,480);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Gerenciador de Senhas");
			primaryStage.setMinWidth(600);
			primaryStage.setMinHeight(400);
			
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
		
	

	public static void main(String[] args) {
		launch(args);
	}
}
