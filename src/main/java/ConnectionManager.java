import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    private String URL;
    private String userName;
    private String password;

    public ConnectionManager(String URL, String userName, String password) {
        this.URL = URL;
        this.userName = userName;
        this.password = password;
    }

    public Connection getConnection() {

        Connection connection = null;
        try {
            Driver driver = (Driver)Class.forName("org.postgresql.Driver").newInstance();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, userName, password);
        }
        catch (SQLException e ) {
            System.out.println("Ошибка подключения к БД.");
        }
        catch (Exception e) {
            System.out.println("Проблема подключения драйвера.");
        }
        return connection;
    }
}
