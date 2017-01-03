import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.Event;
/**
 * Created by rudolf on 8.10.2016.
 */
public class Hooldusraamat extends Application {

    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Vajuta, kui julged");

        Button nupp;
        nupp = new Button();
        nupp.setText("DOOMSDAY");

        StackPane kujundus = new StackPane();
        kujundus.getChildren().add(nupp);

        Scene lava = new Scene(kujundus, 300, 300);
        primaryStage.setScene(lava);
        primaryStage.show();
    }
}
