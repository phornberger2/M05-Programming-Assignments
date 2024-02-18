import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class exercise_14_01 extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a pane to hold the images views
        GridPane pane = new GridPane();

        // Place nodes in the pane
        pane.add(new ImageView(new Image("flag1.gif")), 0, 0);
        pane.add(new ImageView(new Image("flag2.gif")), 1, 0);
        pane.add(new ImageView(new Image("flag6.gif")), 0, 1);
        pane.add(new ImageView(new Image("flag7.gif")), 1, 1);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("exercise_14_01"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage.
    }
}