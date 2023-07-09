import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler=new ArrayList<String>();

        sehirler.add("Elazığ");
        sehirler.add("Ankara");
        sehirler.add("İzmir");
        sehirler.add("Aydın");

        sehirler.remove("İzmir");
        Collections.sort(sehirler);
        for(String sehir:sehirler){
            System.out.println(sehir);
        }
    }
}