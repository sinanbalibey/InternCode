import java.util.ArrayList;
import java.util.List;
public class Kutu {

    private int id=0;

    private int yukseklik;
    private int genislik;
    private int  en;
    private  int hacim;
    private String renk;
    private String[] icerik;
    private List<String> nesneler;



    public Kutu(int genislik,int en,int yukseklik,String renk){
        this.genislik=genislik;
        this.en=en;
        this.yukseklik=yukseklik;
        this.renk=renk;
        id++;
        this.nesneler=new ArrayList<>();

    }
    public Kutu(){
        genislik=10;
        en=10;
        yukseklik=10;
        id++;
        renk="Kahverengi";
        nesneler=new ArrayList<>();
    }

    public int getId() {
        return id;
    }



    public int getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(int yukseklik) {
        this.yukseklik = yukseklik;
    }

    public int getGenislik() {
        return genislik;
    }

    public void setGenislik(int genislik) {
        this.genislik = genislik;
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getHacim() {
        return en*genislik*yukseklik;
    }

  /*  public void setHacim(int hacim) {
        this.hacim = hacim;
    }*///kutunun hacmi girilmemelidir.

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }


    public void kutuDoldur(String nesne){

        System.out.println("Kutunuzun hacmi"+getHacim());

        hacim-=1;
        nesneler.add(nesne);
    }

    public void kutuBilgiGoster(){
        System.out.println("Kutu ID: "+id);
        System.out.println("Hacim: "+getHacim()+"cm^3");
        System.out.println("Renk: "+renk);
        System.out.println("Kutu İçindeki Nesneler");
        for(String i:nesneler){
            System.out.println(i);
        }

    }




}
