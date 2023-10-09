package Data;
import java.sql.*;

public class RetrieveData {
    public static ResultSet resultSet;
    DataBaseData dataBaseData ;
    PreparedStatement statement;
    Connection connection;
    public Connection connect() throws SQLException {
        dataBaseData = new DataBaseData();
        return DriverManager.getConnection(dataBaseData.jdbcUrl, dataBaseData.username, dataBaseData.password);
    }
    public ResultSet retrieveData(){
        try {
            connection = connect();
            String sql = "SELECT * FROM users.dbo.users;";
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultSet;
    }
    public void close() throws SQLException {
        resultSet.close();
        statement.close();
        connection.close();
    }
}
