import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class BoxCreateUI {

    public BoxCreateUI(){

        Scanner scan = new Scanner(System.in);

        boolean devam=true;





        while (devam){
            System.out.println("Hoş Geldiniz Kutu Oluşturma Sistemine");
            System.out.println("Kendi istediğiniz kutuyu yaratmak için 1'i Sistemimiz tarafından oluşturulan kutu için 2 y'i tuşlayınız");
            System.out.println("Sistemden çıkmak için lütfen 0'ı tuşlayınız");

            int secim = scan.nextInt();

            switch (secim){
                case 0:
                    System.out.println("Çıkış Yapılıyor... ");
                    devam=false;
                    break;

                case 1:



                    System.out.println("Kendi kutunuzu yaratmak için kısa kenarını giriniz");
                    int secimKisaKenar = scan.nextInt();
                    System.out.println("Kendi kutunuzu yaratmak için uzun kenarını giriniz");
                    int secimUzunKenar = scan.nextInt();
                    System.out.println("Kendi kutunuzu yaratmak için yüksekliği giriniz");
                    int secimYukseklik = scan.nextInt();
                    System.out.println("Kendi kutunuzu yaratmak için rengi girin");
                    String  secimRenk=scan.nextLine();

                    Box kutu = new Box(secimYukseklik, secimUzunKenar, secimKisaKenar,secimRenk);

                    System.out.println("Tebrikler Kutunuz eklendi kutunuzun hacmi :" + kutu.getHacimHesapla() + " cm^3");

                    System.out.println("Kutunuza Hediye küpleri eklemez ister misiniz?");
                    System.out.println("Evet ise 1 Hayır ise 2 yi tuşlayınız");

                    int secimBir = scan.nextInt();

                    if (secimBir == 1) {
                        System.out.println("Eklemek istediğiniz hediye küplerin bir kenarı kaç cm olsun ");
                        System.out.println("Lütfen değer giriniz");

                        int secimBirBir = scan.nextInt();

                        int adet= kutu.kupEkle(secimBirBir);

                        System.out.println(adet+" Küp sığdı");

                        System.out.println(kutu.neKadarKaldi()+" cm^3 boş yeriniz kaldı ");

                    }
                    else {
                        System.out.println("Teşekkürler iyi günler dileriz");
                    }
                    break;

                case 2:
                    Box kutu2=new Box();
                    System.out.println("Kutunuz oluştu Hacmi : "+kutu2.getHacimHesapla()+" cm^3");

                    System.out.println("Kutunuza Hediye küpler eklemek ister misiniz?");
                    System.out.println("Küp eklemek için 1'i eklememek için 2'yi tuşlayınız");
                    int secim2=scan.nextInt();

                    if(secim2==1){
                        System.out.println("Eklemek istediğiniz hediye küplerin bir kenarı kaç cm olsun ");
                        System.out.println("Lütfen değer giriniz");

                        int secimIkiBir = scan.nextInt();

                        int adet= kutu2.kupEkle(secimIkiBir);

                        System.out.println(adet+" Küp sığdı");

                        System.out.println(kutu2.neKadarKaldi()+" cm^3 boş yeriniz kaldı ");

                    }

                    break;
                default:
                    System.out.println("Yanlış Tuşlama Yaptınız");
                    break;

            }


            System.out.println();
        }


    }
}
