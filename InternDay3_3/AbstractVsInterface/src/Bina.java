public class Bina implements  IBoy{


    public int boySantimetre() {
        return 2000;
    }

    public double boyMetre() {
        return 20;
    }


   public double boyKilometre() {
        return 0.02;
    /*
    * Bu metot zorunlu değil çunkü default
    * Bir class sadece ve sadece bir classı extend edebilir
    * Ama birden çok ınterfacei implemente edebilir*/
    }


}
