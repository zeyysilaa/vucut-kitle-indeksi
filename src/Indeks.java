import java.util.Scanner;
public class Indeks {
    public static void main(String[] args) {
        double kilo,boy;
        Scanner girdi = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = girdi.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo = girdi.nextDouble();

        double indeks;
        indeks = (kilo / (boy * boy) );
        System.out.println(indeks);


    }
}
