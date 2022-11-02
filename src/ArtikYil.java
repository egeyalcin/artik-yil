import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil;
        Scanner inp = new Scanner(System.in);
        System.out.println("Yil giriniz :");
        yil = inp.nextInt();

        if (yil % 4 == 0 ) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    System.out.println(yil + " artik bir yildir !");
                }
                else {
                    System.out.println(yil + " artik bir yil degildir !");
                }
            }
            else {
                System.out.println(yil + " artik bir yildir !");
            }
        }
        else {
            System.out.println(yil + " artik bir yil degildir !");
        }
    }


}
