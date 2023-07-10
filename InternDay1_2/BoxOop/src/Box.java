public class Box {

    public Box(int yukseklik,int uzunKenar,int kisaKenar, String renk){
        this.yukseklik=yukseklik;
        this.uzunKenar=uzunKenar;
        this.kisaKenar=kisaKenar;
        this.renk=renk;

    }
    public Box(){
        yukseklik=10;
        kisaKenar=10;
        uzunKenar=10;
        renk="Kahverengi";
    }
    private String renk;
    public String getRenk(){
        return renk;
    }
    private int kisaKenar;
    public int getKisaKenar(){
     return kisaKenar;
    }
    public void setKisaKenar(int kisaKenar){
        this.kisaKenar=kisaKenar;
    }
    private int uzunKenar;
    public int getUzunKenar(){
        return uzunKenar;
    }
    public void setUzunKenar(int uzunKenar){
        this.uzunKenar=uzunKenar;
    }
    private int yukseklik;
    public int getYukseklik(){
        return  yukseklik;
    }
    public void setYukseklik(int yukseklik){
        this.yukseklik=yukseklik;
    }


    int getHacimHesapla(){

        return kisaKenar*uzunKenar*yukseklik;
    }

    int kacTane;
    public int kupEkle(int n){

        int kupHacim=n*n*n;

        if(getHacimHesapla()<kupHacim){
           return -1;
        }else{
             kacTane=getHacimHesapla()/kupHacim;
            return kacTane;
        }
    }

    public int neKadarKaldi(){

        int neKadar=getHacimHesapla()-kacTane;

        return neKadar;
    }


}
