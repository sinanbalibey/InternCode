public class Main {
    public static void main(String[] args) {
//soyut sınıflar newlenmez

        CustomerManager customerManager=new CustomerManager(new MySqlCustomerDal());

        customerManager.add();




        /**
         * Katmanlar
         * Veri Katmanı
         * Uyumlu (Ehliyet alacaksa sınavdan 70 üstümü gibi
         * Arayüz Katmanı(Kullanıcıya gösterilen)
         * **Katmanlar arası geçişler interfaceler ile yapılır
         * )*/

    }
}