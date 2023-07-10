public class Main {
    public static void main(String[] args) {
        //Çok biçimlilik


      /*  BaseLogger[] loggers=new BaseLogger[]{
                new FileLogger(),
                new EmailLogger(),
                new DataBaseLogger(),
                new ConsoleLogger()
        };

        for(BaseLogger logger:loggers){
            logger.Log("Log Mesajı");
        }*/

        CustomerManager customerManager=new CustomerManager(new DataBaseLogger());
        customerManager.add();
//metotlar kucuk harfle başlar  CamelCase
    }
}