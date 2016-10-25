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
    Button nupp;
    public static void main(String[] args) {
        /**Scanner juku = new Scanner(System.in);
        System.out.println("Sisesta automark: ");
        String AutoMark = juku.nextLine();
        System.out.println("Sisesta kW arv: ");
        int kW = juku.nextInt();
        System.out.println("Mis kütusel sõidab? (B-bensiin D-diisel G-gaas)");
        String Kytus = juku.nextLine();
        System.out.println("Mark: " + AutoMark + " kW: " + kW + "kW " + "Kütus: " + Kytus );*/
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Vajuta, kui julged");

        nupp = new Button();
        nupp.setText("DOOMSDAY");

        StackPane kujundus = new StackPane();
        kujundus.getChildren().add(nupp);

        Scene lava = new Scene(kujundus, 300, 300);
        primaryStage.setScene(lava);
        primaryStage.show();
    }
}
