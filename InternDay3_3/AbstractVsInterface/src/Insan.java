public class Insan extends Hayvan{


    public Insan(int boy,int kilo){
        this.setBoy(boy);
        this.setKilo(kilo);
    }    public boolean canliMi() {
        return true;
    }
    public int boySantimetre() {
        return this.getBoy();
    }
    public double boyMetre() {
        return this.getBoy()/100.0;
    }

}
