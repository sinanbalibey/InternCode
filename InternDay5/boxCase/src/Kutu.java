
import java.util.ArrayList;


public class Kutu {
    private static int nextId = 1;
    private int id;
    private int yukseklik;
    private int genislik;
    private int en;
    private int hacim;
    private String renk;


    private ArrayList<ArrayList<Object>> nesneler = new ArrayList<>();


    public Kutu(int genislik, int yukseklik, int en, String renk) {
        this.id = nextId++;
        this.genislik = genislik;
        this.yukseklik = yukseklik;
        this.en = en;
        this.renk = renk;

    }

    public Kutu() {
        this.id = nextId++;
        genislik = 10;
        yukseklik = 10;
        en = 10;
        renk = "Kahverengi";
    }


    public int getId() {
        return id;
    }



    public int getYukseklik() {
        return yukseklik;
    }



    public int getGenislik() {
        return genislik;
    }



    public int getEn() {
        return en;
    }



    public int getHacim() {
        return genislik * yukseklik * en;
    }



    public String getRenk() {
        return renk;
    }



    /*public void kutuDoldur(String nesne) {

        hacim -= 100;
        nesneler.add(nesne);
    }*/

   /* public void kutuBosalt(String nesne) {
        nesneler.remove()
        hacim += 100;
    }*/

    public void kutuBilgiGoster() {

        System.out.println("Kutu Id: " + id);
        System.out.println("Kutu Hacim: "+hacim);
        System.out.println("Renk: "+renk);
        System.out.println("Kutu İçendeki Nesneler");

        for(ArrayList<Object> nesneListesi:nesneler){
            for(Object nesne :nesneListesi){
                System.out.println(nesne);
            }
        }

        System.out.println();
    }


}
