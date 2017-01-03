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
public class Hooldusraamat /**extends Application*/ {
    //Button nupp;
    public static void main(String[] args) {
        Scanner skanner1 = new Scanner(System.in);
        Scanner skanner2 = new Scanner(System.in);
        String AutoMark, Kytus;

        System.out.println("Sisesta automark: ");
        AutoMark = skanner1.nextLine();

        System.out.println("Sisesta kW arv: ");
        int kW = skanner1.nextInt();

        System.out.println("Mis kütusel sõidab? (B-bensiin D-diisel G-gaas)");
        Kytus = skanner2.nextLine();

        System.out.println("Mark: " + AutoMark + " kW: " + kW + "kW " + "Kütus: " + Kytus );

        System.out.println("Mis on hetkeläbisõit?");
        int ls = skanner1.nextInt();

        /**launch(args);*/

    }

    /**@Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Vajuta, kui julged");

        nupp = new Button();
        nupp.setText("DOOMSDAY");

        StackPane kujundus = new StackPane();
        kujundus.getChildren().add(nupp);

        Scene lava = new Scene(kujundus, 300, 300);
        primaryStage.setScene(lava);
        primaryStage.show();*/
    }

