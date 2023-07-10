public class Main {
    public static void main(String[] args) {

        ProductManager manager=new ProductManager();
        Product product=new Product();
        product.price=100;
        product.name="";

        manager.add(product);



        DataBaseHelper.Crud.delete();
        DataBaseHelper.Crud.update();
        DataBaseHelper.Connection.createConnection();






    }
}