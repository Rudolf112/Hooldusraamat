import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
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
    public void start(Stage aken) throws Exception {

        aken.setTitle("Hooldusraamat");

        GridPane paan = new GridPane();
        paan.setHgap(10);
        paan.setVgap(10);
        paan.setPadding(new Insets(30, 30, 30, 30));

        Label margiSilt = new Label("Automark");
        GridPane.setConstraints(margiSilt, 0, 0);

        TextField autoMark = new TextField();
        GridPane.setConstraints(autoMark, 1, 0);

        Label lsSilt = new Label("Läbisõit");
        GridPane.setConstraints(lsSilt, 0, 1);

        TextField ls = new TextField();
        GridPane.setConstraints(ls, 1, 1);

        paan.getChildren().addAll(margiSilt, autoMark, lsSilt, ls);

        Scene stseen = new Scene(paan, 900, 600);
        aken.setScene(stseen);
        aken.show();
    }
}
