public class Kamyon extends Araclar implements IIkiTekerlek{
    @Override
    void calistir() {
        System.out.println("Kamyon sınıfı başlatıldı");
    }

    @Override
    public int getTekerSayisi() {
        int tekerlekSayisi=2;
        return tekerlekSayisi;

    }

    public void herSeyiYazdir(){
        ureticiyiGetir();
        calistir();


        System.out.println("tekerlek sayısı : " + getTekerSayisi());
        System.out.println("finalDegisken : " + finalDegisken);
        System.out.println("finalStaticDegisken : " + finalStaticDegisken);
        System.out.println("staticDegisken : " + staticDegisken);
        System.out.println("publicDegisken : " + publicDegisken);
        System.out.println("privateDegisken : " + "Private yazdırılamaz :))");
        System.out.println("protectedDegisken : " + protectedDegisken);
    }
}
