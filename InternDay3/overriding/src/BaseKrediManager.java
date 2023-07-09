public class BaseKrediManager {
    public  double hesapla(double tutar){

        return  tutar*1.18;
    }
}
//Bazı durumlarda ezmeye izin vermediğimiz zamanlar oluyor
//Bu durumda ise public final double hesapla(double tutar)
//Şeklinde olur.
