public class Main {
    public static void main(String[] args) {

        String yiyilecek="hamburger";
        Yemek yemek=Yemek.sogukYemek(yiyilecek);
        Yemek yemek1=Yemek.sicakYemek(yiyilecek);

        Fenerbahce fener=new Fenerbahce("Sinan",22);
        Fenerbahce fener2=new Fenerbahce("Ahmet",22);
        Fenerbahce fener3=new Fenerbahce("Ali",22);

        Fenerbahce fb=Fenerbahce.yeniFutbolcuUret("Sabri");



    }
}

/*
*       Neden Consturctor yerine Static Factory Method?
*   Konu:
* ==>Consturctorlarda istediğiniz ismi vermek gibi bir seçeneğimiz yok.
* ==>Durmadan yeni instance(Class değişkenleri) ürettiğimizde cacheleme gibi bir mekanizma kurma şansımız yok.
* ==>Constructorlar ile alt tipte veya farklı tipte bir obje üretemiyoruz.
*
*   Özet:
* ==>Static factory method ile isim seçme özelliği kazanıyoruz.
* ==>Hangi instanceyi döndüreceğimiz ile ilgili tüm kontrolü elimize alıyoruz.
* ==>Hangi tipte obje döneceksek bunun kontrolünü de ele alıyoruz.
* !!!Not: Sadece Konu kısmında yazan problemlerde kullan
*
* */