import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class C14E1DisplayImages extends Application {
	@Override 
	public void start(Stage primaryStage) {
		GridPane g = new GridPane();

		g.add(new ImageView(new Image("gifs/uk_image.gif")), 0, 0);
		g.add(new ImageView(new Image("gifs/ca_image.gif")), 1, 0);
		g.add(new ImageView(new Image("gifs/china_image.gif")), 0, 1);
		g.add(new ImageView(new Image("gifs/us_image.gif")), 1, 1);

		Scene s = new Scene(g);
		primaryStage.setTitle("C14E1DisplayImages"); 
		primaryStage.setScene(s); 
		primaryStage.show(); 
	}
}
