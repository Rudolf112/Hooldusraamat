import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.control.Button;
import javafx.stage.Stage;
/**
 * Created by rudolf on 8.10.2016.
 */
public class Hooldusraamat extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage aken) throws Exception {

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

        Button Salvesta = new Button("Salvesta");
        GridPane.setConstraints(Salvesta, 0, 10);
        Salvesta.setOnAction(e -> {
            if (onNumber(ls)==true){
                System.out.println("Sain kätte true ja võin info ära salvestada");
            }
            else{
                System.out.println("Ei saanud kätte true, kuskil lahtris ei asu number!");
            }
        }
        );

        paan.getChildren().addAll(margiSilt, autoMark, lsSilt, ls, Salvesta);

        Scene stseen = new Scene(paan, 900, 600);
        aken.setScene(stseen);
        aken.setTitle("Hooldusraamat");
        aken.show();
    }
    private boolean onNumber(TextField sisend) //https://www.youtube.com/watch?v=cwJK_WpseKQ
    {
        try {
            int ls = Integer.parseInt(sisend.getText());
            System.out.println("Sisend on number");
            return true;
        }
        catch(NumberFormatException e){
            System.out.println("Sisend ei ole number");
            return false;
        }
    }
}
