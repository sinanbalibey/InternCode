public class Main {
    public static void main(String[] args) {


        String mesaj="Vade Oranı";

        Product product1=new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStcok(3);
        product1.setImageUrl("img/1.png");

        Product product2=new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitsInStcok(3);
        product2.setImageUrl("img/2.png");

        Product product3=new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitsInStcok(3);
        product3.setImageUrl("img/1.png");

        Product[] products={product1,product2, product3};


        for(Product product:products){
            System.out.println(product.getName());
        }

        System.out.println();
        IndividualCustomer individualCustomer=new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05123123");
        individualCustomer.setCustomerNumber("21123123");
        individualCustomer.setFirstName("Sinan");
        individualCustomer.setLastName("Balıbey");

        CorporatateCustomer corporatateCustomer=new CorporatateCustomer();


        Customer[] customers=new Customer[]{corporatateCustomer,individualCustomer};

    }
}