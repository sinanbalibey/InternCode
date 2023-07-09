import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers=new ArrayList<Customer>();

        Customer sinan=new Customer(0,"Ali","Kaş");
        customers.add(sinan);
        customers.add(new Customer(1,"Sinan","Balibey"));
        customers.add(new Customer(2,"Taha","Balibey"));
        customers.add(new Customer(3,"Hikmet","Balibey"));

       customers.remove(sinan);

        for(Customer customer:customers){
            System.out.println(customer.firstName);

        }
    }
}