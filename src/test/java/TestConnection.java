import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

    public static void main(String[] args)  {

        /**
         * host: 54.159.164.229
         * port: 1521
         * SID : XE
         * user: hr
         * password: hr
         *
         *
         * jdbc url AKA connection String
         * syntax :
         * jdbc : vendorName: driverType @YourHost:POST:SID
         *
         * jdbc:oracle:thin@54.159.164.229:1521:XE
         */

        String url = "jdbc:oracle:thin:@54.159.164.229:1521:XE";
       try{
           Connection con = DriverManager.getConnection(url, "hr","hr");
           System.out.println("CONNECTION SUCCESSFUL");

        }catch(SQLException e){
           System.out.println("CONNECTION HAS FAILED "+ e.getMessage());
       }
    }
}
