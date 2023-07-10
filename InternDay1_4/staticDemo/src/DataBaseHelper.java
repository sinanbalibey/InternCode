public class DataBaseHelper {

    public static  class Crud{//Create Read Update Delete

        public  static void delete(){
            System.out.println("VT nı silindi");
        }
        public  static void update(){
            System.out.println("VT nı güncellendi");
        }
    }

    public  static class Connection{
        public static void createConnection(){
            System.out.println("VT bağlanıldı");
        }
    }
}
