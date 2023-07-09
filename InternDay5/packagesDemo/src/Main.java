//built-in
import matematik.DortIslem;
import matematik.Logaritma;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        System.out.println("Adınız: ");

        String isim=scanner.nextLine();

        System.out.println("Merhaba "+isim);

        DortIslem dortIslem=new DortIslem();
        dortIslem.topla(12,12);
        Logaritma logaritma=new Logaritma();



    }
}