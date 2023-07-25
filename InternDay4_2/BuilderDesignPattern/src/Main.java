public class Main {
    public static void main(String[] args) {

        StarbucksBuilder sb=new StarbucksBuilder
                .Builder("Tall")
                .yumusakIcenler("ben yumuşak seviyorum")
                .build();




        /*
            2. Yol
        StarbucksBuilder sb=new StarbucksBuilder();

        sb.setLaktozsuzSutMiktari("yüzde 5");
        int value=3;
        sb.setYumusatici("olsun");*/


    }
}

/*
* 1.YOL: Bütün constructorları teker teker ekleme yaparız.
*   Sonuç:Patladı.Çünkü bu sınıfta sadece 3 tane değişkenimiz var. Daha fazla olunca ne yapacaksın.
*   (Telescope Pattern)
*
* 2.YOL: Setterlar oluşturma
*   Sonuç:Araya farklı bir değer ekleyemeyiz int value gibi.Sadece alt alt eklememiz lazım.
*   (Java Bean Pattern)
*
* 3.YOL:(Builder Pattern)
* */