package project1;
import java.sql.*;
public class connect {
    private final String url = "jdbc:mysql://localhost/project";
    private final String username = "root";
    private final String password = "";
    Connection c ;
    public Connection setconnect() throws SQLException
    {        
        return DriverManager.getConnection(url, username, password);
    }
}
