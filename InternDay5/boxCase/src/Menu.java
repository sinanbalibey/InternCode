import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scan;
    private ArrayList<Kutu> kutular;


    public Menu() {
        scan = new Scanner(System.in);
        kutular = new ArrayList<>();
    }

    public void anaSayfa() {
        boolean devam = true;

        while (devam) {
            System.out.println();
            System.out.println("Kutu oluşturma sistemine hoş geldiniz ");
            System.out.println("1 : Kutu İşlemleri");
            System.out.println("2 : Çıkış");

            int secim = scan.nextInt();

            switch (secim) {
                case 1:
                    kutuIslemleri();
                    break;
                case 2:
                    devam = false;
                    System.out.println("Çıkış Yapılıyor");
                    break;
                default:
                    System.out.println("Hatalı tuşlama yaptınız");
                    anaSayfa();
                    break;
            }
        }
    }

    public void run() {
        anaSayfa();
    }

    public void kutuIslemleri() {
        System.out.println();
        System.out.println("Kendi kutunuzu oluşturma için 1");
        System.out.println("Hazır kutu oluşturmak için 2 ");
        System.out.println("Kutuları listelemek için 3 ");
        System.out.println("Kutuları id ye göre listelemek için 4 ");
        //System.out.println("Kutu içeriğini görmek için 4 ");


        int secim = scan.nextInt();
        scan.nextLine();

        switch (secim){
            case 1:
                kutuOlustur();
                kutuIslemleri();
                break;
            case 2:
                hazirKutuOlustur();
                kutuIslemleri();


            case 3:
                kutulariListele();
                break;

            case 4:
                idSirala();
                break;

           /* case 4:
                kutuDetayList();*/

            default:
                System.out.println("Hatalı tuşlama yaptınız");
                kutuIslemleri();
                break;

        }

    }

    public void kutuOlustur() {

        System.out.println("Kutu için genislik girin");
        int genislik = scan.nextInt();
        scan.nextLine();

        System.out.println("Kutu için yukseklik girin");
        int yukseklik = scan.nextInt();
        scan.nextLine();

        System.out.println("Kutu için en giriniz ");
        int en = scan.nextInt();
        scan.nextLine();

        System.out.println("Kutu için renk giriniz");
        String renk = scan.nextLine();



        Kutu kutu = new Kutu(genislik, yukseklik, en, renk);

        kutular.add(kutu);
        System.out.println("Kutu olutşturuldu ID:" + kutu.getId());

    }

    public void hazirKutuOlustur(){
        Kutu kutu=new Kutu();

        kutular.add(kutu);
        System.out.println("Kutu oluşturuldu ID:"+kutu.getId());
    }


    public void kutulariListele() {

        System.out.println("Kutular: ");
        System.out.println();
        for (Kutu kutu : kutular) {
            System.out.println("Kutu ID:" + kutu.getId());
            System.out.println("Hacim: " + kutu.getHacim());
            System.out.println("Renk: " + kutu.getRenk());
            System.out.println();

        }
    }

    public void idSirala(){
        System.out.println("Kutu id'sini giriniz");

        int id=scan.nextInt();
        scan.nextLine();

        Kutu kutu=null;

        for(Kutu k:kutular){
            if(k.getId()==id){
                kutu=k;
                break;
            }
        }
        if(kutu!=null){
            kutu.kutuBilgiGoster();
        }
        else {
            System.out.println("Belirtilen id ye göre bir kutu yok");
        }
    }


   /* public void kutuDetayList(){
        System.out.println("Kutu ID'sini giriniz");
        int secim=scan.nextInt();
        scan.nextLine();
        System.out.println(  );
        }
        */





}


