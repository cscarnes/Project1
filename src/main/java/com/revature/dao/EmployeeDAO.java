package com.revature.dao;

import java.sql.*;

public class EmployeeDAO {

    private Connection connection = null;
    private PreparedStatement preparedStment = null;
    private Statement statement = null;
    private ResultSet result = null;

    public void connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(
                "jdbc::postgresql://database-1.cuodwo1rggyl.us-east-2.rds.amazonaws.com", "postgres", "Senrac02!");
    }

    public String getUsername(String username) throws SQLException {
        String retrievedUsername;
        String selectQuery = "SELECT username FROM employee WHERE username = '" + username + "'";
        statement = connection.createStatement();
        result = statement.executeQuery(selectQuery);
        retrievedUsername = result.getString("username");

        return retrievedUsername;
    }

    public String getPassword(String password) throws SQLException {
        String retrievedPassword;
        String selectQuery = "SELECT password FROM employee WHERE password = '" + password + "'";
        statement = connection.createStatement();
        result = statement.executeQuery(selectQuery);
        retrievedPassword = result.getString("password");

        return retrievedPassword;
    }

    public String getFirstName(String firstName) throws SQLException
    {
        String retrievedFirstName;
        String selectQuery = "SELECT first_name FROM employee WHERE first_name = '" + firstName + "'";
        statement = connection.createStatement();
        result = statement.executeQuery(selectQuery);
        retrievedFirstName = result.getString("first_name");

        return retrievedFirstName;
    }

    public String getLastName(String lastName) throws SQLException
    {
        String retrievedLastName;
        String selectQuery = "SELECT last_name FROM employee WHERE last_name = '" + lastName + "'";
        statement = connection.createStatement();
        result = statement.executeQuery(selectQuery);
        retrievedLastName = result.getString("last_name");

        return retrievedLastName;
    }

    public String getEmail(String email) throws SQLException {
        String retrievedEmail;
        String selectQuery = "SELECT email FROM employee WHERE email = '" + email + "'";
        statement = connection.createStatement();
        result = statement.executeQuery(selectQuery);
        retrievedEmail = result.getString("first_name");

        return retrievedEmail;
    }
}
