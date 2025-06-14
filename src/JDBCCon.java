import java.sql.*;
public class JDBCCon {
    public static void main(String[] args) throws Exception {
/*
        import packages
        load and register
        create connection
           execute statement
            process the results
            close connection
        */

        String url = "jdbc:postgresql://localhost:5432/Demo";
        String username = "postgres";
        String pass = "Devansh@02";

        Connection conn = DriverManager.getConnection(url, username, pass);
        System.out.println("Connection Extablished");



    }
}
