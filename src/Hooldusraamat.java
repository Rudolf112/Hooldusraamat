import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
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

        Label lsSilt = new Label("Hetkeläbisõit (km)");
        GridPane.setConstraints(lsSilt, 0, 1);
        TextField ls = new TextField();
        GridPane.setConstraints(ls, 1, 1);

        Label olivahetusSilt = new Label("Järgmine mootoriõli vahetus (km)");
        GridPane.setConstraints(olivahetusSilt, 0, 2);
        TextField olivahetus = new TextField();
        GridPane.setConstraints(olivahetus, 1, 2);

        Label kysimus = new Label("Milliseid featuure soovid autol jälgida?");
        GridPane.setConstraints(kysimus, 0, 3);

        CheckBox ylevaatuse_aeg = new CheckBox("Ülevaatuse aeg");
        GridPane.setConstraints(ylevaatuse_aeg, 0, 4);
        CheckBox poliisi_kehtivus = new CheckBox("Kindlustuspoliisi kehtivus");
        GridPane.setConstraints(poliisi_kehtivus, 1, 4);

        Button Salvesta = new Button("Salvesta");
        GridPane.setConstraints(Salvesta, 0, 40);
        Salvesta.setOnAction(e -> {
            if (onNumber(ls) && onNumber(olivahetus)){
                System.out.println("Sain kätte true ja võin info ära salvestada");
            }
            else{
                System.out.println("Ei saanud kätte true, kuskil lahtris ei asu number!");
            }
        }
        );

        paan.getChildren().addAll(margiSilt, autoMark, lsSilt, ls,
                olivahetusSilt, olivahetus, kysimus, ylevaatuse_aeg, poliisi_kehtivus, Salvesta);

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
