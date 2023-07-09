import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Kutu {
    private static int nextId = 1;
    private int id;
    private int yukseklik;
    private int genislik;
    private int en;
    private int hacim;
    private String renk;


    private ArrayList<Object> nesneler = new ArrayList<>();


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

  /*  public void setId(int id) {
        this.id = id;
    }*/

    public int getYukseklik() {
        return yukseklik;
    }

  /*  public void setYukseklik(int yukseklik) {
        this.yukseklik = yukseklik;
    }*/

    public int getGenislik() {
        return genislik;
    }

  /*  public void setGenislik(int genislik) {
        this.genislik = genislik;
    }*/

    public int getEn() {
        return en;
    }

   /* public void setEn(int en) {
        this.en = en;
    }*/

    public int getHacim() {
        return genislik * yukseklik * en;
    }

   /* public void setHacim(int hacim) {
        this.hacim = hacim;
    }*/

    public String getRenk() {
        return renk;
    }

    /*public void setRenk(String renk) {
        this.renk = renk;
    }*/

    public void kutuDoldur(String nesne) {

        hacim -= 100;
        nesneler.add(nesne);
    }

   /* public void kutuBosalt(String nesne) {
        nesneler.remove()
        hacim += 100;
    }*/

    public void kutuBilgiGoster() {

        System.out.println("Kutu Id: " + id);
        System.out.println("Kutu Hacim: "+hacim);
        System.out.println("Renk: "+renk);
        System.out.println("Kutu İçendeki Nesneler");

        for (Object nesne:nesneler){
            System.out.print(nesne+" ");
        }

        System.out.println();
    }


}
