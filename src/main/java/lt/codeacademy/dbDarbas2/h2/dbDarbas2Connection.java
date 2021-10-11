package lt.codeacademy.dbDarbas2.h2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbDarbas2Connection {
    public static void main(String[] args) {
        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/db_Darbas", "sa", "");
            System.out.println("Connected");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    }
