public abstract class GameCalculator {
    //soyut sınıflar asla newlenemez
    //zorunlu overriding yapman gereken metotlar kullanırken

    public abstract void hesapla();
    public final void gameOver() {
        System.out.println("Oyun bitti.");
    }
}
