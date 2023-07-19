
public class Main {
    public static void main(String[] args) {

        System.out.println("Bina ***********");
        Bina obje=new Bina();
        System.out.println(obje.boySantimetre());
        System.out.println(obje.boyMetre());
        System.out.println(obje.boyKilometre());
        System.out.println();

        System.out.println("İnsan ***********");
        Insan insan=new Insan(185,80);
        System.out.println(insan.canliMi());
        System.out.println(insan.boySantimetre());
        System.out.println(insan.boyMetre());
        System.out.println(insan.boyKilometre());
    }
}