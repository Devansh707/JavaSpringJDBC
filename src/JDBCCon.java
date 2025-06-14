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

        int sid = 101;
        String jessy = "Jessy";
        int jMarks = 91;

        String sql = "insert into student values (?,?,?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setInt(1, sid);
        st.setString(2, jessy);
        st.setInt(3, jMarks);

        st.execute();

        conn.close();

    }
}
