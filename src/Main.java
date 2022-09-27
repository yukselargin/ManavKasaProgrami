import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armutFiyat=2.14, elmaFiyat=3.67, domatesFiyat=1.11,muzFiyat= 0.95, patlicanFiyat=5.00;
        double armut,elma,domates,muz,patlican,toplam;
        Scanner kacKilo = new Scanner(System.in);

        System.out.print ("Armut Kaç Kilo ?  ");
        armut= kacKilo.nextDouble();
        System.out.print ("Elma Kaç Kilo ?  ");
        elma= kacKilo.nextDouble();
        System.out.print ("Domates Kaç Kilo ?  ");
        domates= kacKilo.nextDouble();
        System.out.print ("Muz Kaç Kilo ?  ");
        muz= kacKilo.nextDouble();
        System.out.print ("Patlıcan Kaç Kilo ?  ");
        patlican= kacKilo.nextDouble();

        toplam = armut*armutFiyat+elma*elmaFiyat+domates*domatesFiyat;
        toplam += muz*muzFiyat+patlican*patlicanFiyat;
        System.out.print ("Toplam tutar = "+toplam);
        System.out.print (" TL");

    }
}