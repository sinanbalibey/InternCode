public class Main {
    public static void main(String[] args) {

        DortIslem dortIslem=new DortIslem();

        int a= dortIslem.Topla(10,2);
        double b=dortIslem.Bol(10,2);
        int c=dortIslem.Carp(10,2);
        int d=dortIslem.Cikar(10,2);


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}