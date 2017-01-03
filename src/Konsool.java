import java.util.Scanner;

/**
 * Created by rudolf on 3.01.2017.
 */
public class Konsool {
    {
        Scanner skanner1 = new Scanner(System.in);
        Scanner skanner2 = new Scanner(System.in);
        String AutoMark, Kytus;

        System.out.println("Sisesta automark: ");
        AutoMark = skanner1.nextLine();

        System.out.println("Sisesta kW arv: ");
        int kW = skanner1.nextInt();

        System.out.println("Mis kütusel sõidab? (B-bensiin D-diisel G-gaas)");
        Kytus = skanner2.nextLine();

        System.out.println("Mark: " + AutoMark + " kW: " + kW + "kW " + "Kütus: " + Kytus);

        System.out.println("Mis on hetkeläbisõit?");
        int ls = skanner1.nextInt();
    }
}
