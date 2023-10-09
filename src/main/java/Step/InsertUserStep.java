package Step;

import Data.User;
import io.qameta.allure.Step;

import java.sql.*;

public class InsertUserStep extends StepSetup{
    @Step("insert user in database")
    public InsertUserStep insertUser(User user) throws SQLException {
        Connection connection = retrieveData.connect();
        String insertQuery = "INSERT INTO users.dbo.users (firstName, lastName, phone, email, dateOfBirth, password) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            preparedStatement.setString(1, user.getFirstName());
            preparedStatement.setString(2, user.getLastName());
            preparedStatement.setString(3, user.getPhone());
            preparedStatement.setString(4, user.getEmail());
            preparedStatement.setString(5, user.getDate());
            preparedStatement.setString(6, user.getPassword());
            preparedStatement.executeUpdate();
        }
        return this;
    }
    @Step("clear database table")
    public void clearUsersTable() throws SQLException {
        Connection connection = retrieveData.connect();
        String sql = "TRUNCATE TABLE users.dbo.users";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.executeUpdate();
    }
}