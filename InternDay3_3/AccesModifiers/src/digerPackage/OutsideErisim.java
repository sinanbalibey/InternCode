package digerPackage;

import accessmodifiers.Test;

public class OutsideErisim extends Test {
    public static void main(String[] args) {

        Test test=new Test();

        System.out.println("Erişebildiklerim : "+
                test.herkes+" ");

        OutsideErisim outsideErisim=new OutsideErisim();

        System.out.println("Erişdiklerim : "+
                outsideErisim.korumali+", "+outsideErisim.herkes);
    }
}
