public class StarbucksBuilder {

    //Gerekli
    private  String kahveBoyutu;


    //Seçime göre değişir.
    private String laktozsuzSutMiktari;
    private String yumusatici;



    public static class Builder{
        //Gerekli
        private final String kahveBoyutu;

        //Seçime göre değişir.
        private String laktozsuzSutMiktari;
        private String yumusatici;

        public Builder(String kahveBoyutu) {
            this.kahveBoyutu = kahveBoyutu;
        }

        public Builder laktoksuzIcenler(String laktozsuzSut){
            laktozsuzSutMiktari=laktozsuzSut;
            return this;
        }
        public Builder yumusakIcenler(String yumusakDeger){
            yumusatici=yumusakDeger;
            return this;
        }

        public StarbucksBuilder build(){
            return  new StarbucksBuilder(this);
        }
    }


    public StarbucksBuilder(Builder builder) {
        kahveBoyutu=builder.kahveBoyutu;
        laktozsuzSutMiktari=builder.laktozsuzSutMiktari;
        yumusatici=builder.yumusatici;

    }

}
