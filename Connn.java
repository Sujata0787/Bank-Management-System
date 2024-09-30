package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Connn {
    public PreparedStatement statement;
    public Connn()
    {
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "");
            statement = (PreparedStatement) connection.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
