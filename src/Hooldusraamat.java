/**
 * Created by rudolf on 8.10.2016.
 */
public class Hooldusraamat {
    public static void main(String[] args) {
        String AutoMark;
        int kW;
        String Kytus;
        System.out.println("Sisesta automark: ");
        AutoMark = TextIO.getlnString();
        System.out.println("Sisesta kW arv: ");
        kW = TextIO.getInt();
        System.out.println("Mis kütusel sõidab? (B-bensiin D-diisel G-gaas)");
        Kytus = TextIO.getlnString();
        System.out.println("Mark: " + AutoMark + " kW: " + kW + "kW" + "Kütus: " + Kytus );
    }
}
