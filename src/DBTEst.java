import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBTEst {


    public static void main(String[] args) {
        Connection connect = DBConnection.getDBConnection();
        try {

            String query = "SELECT * FROM lastlab";
            Statement statement = connect.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next())

            {

                System.out.println(resultSet.getString(1)+ " " + resultSet.getString(2));

            }
        } catch (Exception e) {
            System.out.println("ERROR");

        }
    }
}
