public class Fenerbahce {

    private String yeniFutbolcu;
    private int age;

    public  Fenerbahce(String yeniFutbolcu,int age){
        this.yeniFutbolcu=yeniFutbolcu;
        this.age=age;
    }

    public static Fenerbahce yeniFutbolcuUret(String yeniFutbolcu){
        return new Fenerbahce(yeniFutbolcu,22);
    }
}
