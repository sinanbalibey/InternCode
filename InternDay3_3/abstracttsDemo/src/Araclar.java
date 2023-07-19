public abstract class Araclar implements IAracDavranislari{

    abstract void calistir();
    void ureticiyiGetir(){
        System.out.println("TOGG");
    }

    final public  int finalDegisken=4;
    final public  static double finalStaticDegisken=33;
    static boolean staticDegisken=true;

    public int publicDegisken=5;
    private int privateDegisken=6;
    protected float protectedDegisken=7;

}
