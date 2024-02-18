import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class exercise_15_07 extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a Stack pane
        StackPane pane = new StackPane();

        // Create a circle and set its properties
        Circle circle = new Circle(50);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        pane.getChildren().add(circle);

        // Create and register the handler
        pane.setOnMousePressed(e -> {
            circle.setFill(Color.BLACK);
        });

        pane.setOnMouseReleased(e -> {
            circle.setFill(Color.WHITE);
            circle.setStroke(Color.BLACK);
        });

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 120, 120);
        primaryStage.setTitle("exercise_15_07"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

    }
}