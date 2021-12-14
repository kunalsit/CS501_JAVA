import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
//import javafx.scene.paint.Colheightor;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class C14E12DisplayBarChart extends Application {
	@Override 
	public void start(Stage primaryStage) {
		HBox hb = new HBox(15);
		hb.setAlignment(Pos.BOTTOM_CENTER);

		String[] type = {"Projects", "Quizzes", "Midterms", "Finals"};
		double[] g = {20, 10, 30, 40};

		double max = getMaxGrade(g);

		double h = 200;
		double w = 150;

		StackPane pane = new StackPane();
		pane.setPadding(new Insets(20, 15, 5, 15));

		Rectangle r1 = new Rectangle(0, 0, w, h * g[0] / max);
		r1.setFill(Color.RED);
		Rectangle r2 = new Rectangle(0, 0, w, h * g[1] / max);
		r2.setFill(Color.BLUE);
		Rectangle r3 = new Rectangle(0, 0, w, h * g[2] / max);
		r3.setFill(Color.GREEN);
		Rectangle r4 = new Rectangle(0, 0, w, h * g[3] / max);
		r4.setFill(Color.ORANGE);

		Text t1 = new Text(0, 0, type[0] + " -- " + g[0] + "%");
		Text t2 = new Text(0, 0, type[1] + " -- " + g[1] + "%");
		Text t3 = new Text(0, 0, type[2] + " -- " + g[2] + "%");
		Text t4 = new Text(0, 0, type[3] + " -- " + g[3] + "%");
		
		hb.getChildren().addAll(getVBox(t1, r1), getVBox(t2, r2), 
			getVBox(t3, r3), getVBox(t4, r4));
		pane.getChildren().add(hb);

		Scene scene = new Scene(pane);
		primaryStage.setTitle("C14E12DisplayBarChart"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}

	public double getMaxGrade(double[] l) {
		double max = l[0];
		for (int i = 0; i < l.length; i++) {
			if (l[i] > max)
				max = l[i];
		}
		return max;
	}

	public VBox getVBox(Text t, Rectangle r) {
		VBox vBox = new VBox(5);
		vBox.setAlignment(Pos.BOTTOM_LEFT);
		vBox.getChildren().addAll(t, r);
		return vBox;
	}
}