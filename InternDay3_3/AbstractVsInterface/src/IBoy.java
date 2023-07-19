public interface IBoy  {
    int degisken=0;

    static String tanim(){
        return "Bu interface implement eden class için"
                +"boy bilgileri dönülmesini garanti eder ";
    }

    int boySantimetre();
    double boyMetre();
    default double boyKilometre() {//ZORUNlu değil
        return 0;
    }

    //interfacede tanımladıgımız her şey PUBLIC dir.
    //interfacede tanımladığımız değişkenler FINAL dır.

}
