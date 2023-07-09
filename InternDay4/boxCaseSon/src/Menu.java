import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner scan=new Scanner(System.in);
    ArrayList list=new ArrayList();
    Kutu kutu ;
    public  Menu(){


        boolean devam=true;

        while (devam){
            System.out.println("1.Kutu İşlemleri");
            System.out.println("2.Çıkış");
            int secim=scan.nextInt();
            switch (secim){

                case 1:
                    kutuSecenekleri();
                    break;

                case 2:
                    System.out.println("Çıkış Yapılıyor");
                    devam=false;
                default:
                    System.out.println("Geçersiz Seçim");
            }
        }

    }
    public void kutuSecenekleri(){
        System.out.println("1.Kutu Oluştur göster");
        System.out.println("2.Hazır Kutu Oluştur göster");
        int secim=scan.nextInt();

        if(secim==1){
            System.out.println("Genişliği ne kadar olsun ");
            int genislik=scan.nextInt();
            System.out.println("En i ne kadar olsun ");
            int en=scan.nextInt();
            System.out.println("Yüksekliği ne kadar olsun");
            int yukseklik=scan.nextInt();
            System.out.println("Rengi ne olsun");
            String renk=scan.nextLine();
            new Kutu(yukseklik,en,yukseklik,renk);
            kutu.kutuBilgiGoster();


        }

    }

    public void kutuOlustur(){

    }
    public void hazırKutuOlustur(){

    }
}
