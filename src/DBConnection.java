
import java.sql.Connection;
import java.sql.DriverManager;

import static java.lang.Class.forName;

public class DBConnection {
    static Connection connect = null;

    private DBConnection() {
    }

    public static Connection getDBConnection() {
        try {
            if (connect == null) {
                Class.forName("com.mysql.jdbc.Driver");
                connect = DriverManager.getConnection("jdbc://localhost/lastlab", "postgres", "1111");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connect;
    }
}
