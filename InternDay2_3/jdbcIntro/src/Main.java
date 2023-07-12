import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException{

        Connection connection=null;
        DbHelper helper=new DbHelper();
        PreparedStatement statement=null;
        ResultSet resultSet;

        try{
            connection =helper.getConnection();
            String sql="delete from city where id=?";
            statement=connection.prepareStatement(sql);
            statement.setInt(1,4080);

           int result=statement.executeUpdate();

            System.out.println("Kayıt Silindi ");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        }finally {
            statement.close();
            connection.close();
        }

    }
    public  static void selectDemo() throws SQLException{

        Connection connection=null;
        DbHelper helper=new DbHelper();
        Statement statement=null;
        ResultSet resultSet;

        try{
            connection =helper.getConnection();
            statement=connection.createStatement();
            resultSet=statement.executeQuery("select Code,Name,Continent,Region from country");
            ArrayList<Country> countries=new ArrayList<Country>();

            while (resultSet.next()){
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
            }
            System.out.println(countries.size());

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        }finally {
            connection.close();
        }

    }

    public static void insertData() throws SQLException{
        Connection connection=null;
        DbHelper helper=new DbHelper();
        PreparedStatement statement=null;
        ResultSet resultSet;

        try{
            connection =helper.getConnection();


            statement=connection.prepareStatement("insert into city (Name,CountryCode,District,Population) values ('Düzce','TUR','Düzce',5000)");

            int result=statement.executeUpdate();
            System.out.println("Kayıt Eklendi "+result);

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        }finally {
            statement.close();
            connection.close();
        }
    }

    public static void updateData() throws  SQLException{


        Connection connection=null;
        DbHelper helper=new DbHelper();
        PreparedStatement statement=null;
        ResultSet resultSet;

        try{
            connection =helper.getConnection();
            String sql="update city set population=80000,district='TURKEY' where id=4080";
            statement=connection.prepareStatement(sql);

            int result=statement.executeUpdate();

            System.out.println("Kayıt Güncellendi ");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        }finally {
            statement.close();
            connection.close();
        }
    }
}