package accessmodifiers;

public class Main {
    public static void main(String[] args) {

        Test testObjesi=new Test();

        System.out.println("Erişebildiklerim : "+
                testObjesi.duz+", "+testObjesi.herkes+
                ", "+testObjesi.korumali);

    }
}

/*
 * Access Modifiers    Class        Package       SubClass(Aynı Paket)       SubClass(Farklı Paket)      Outside
 *                     (Sınıf)       (Paket)      (AltSınıf)                 (Alt Sınıf)                 (Her yer)
 *
 * Public                +               +           +                           +                           +
 *
 * Protected             +               +           +                           +                           -
 *
 * Default               +               +           +                           -                           -
 *(Yazmaksak)
 * Private               +               -           -                           -                           -
 *
 * */