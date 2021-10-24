package com.revature.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import com.revature.model.Employee;
import com.revature.model.Manager;

public class ManagerDAO {

    private static ManagerDAO manager = null;

    private ManagerDAO(){
    }

    public static ManagerDAO instance(){
        if(manager == null) {
            manager = new ManagerDAO();
        }
        return manager;
    }

    private Connection connection = null;
    private PreparedStatement preparedStment = null;
    private Statement statement = null;
    private ResultSet result = null;

    public void connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(
            "jdbc:postgresql://database-1.cuodwo1rggyl.us-east-2.rds.amazonaws.com/", "postgres", "Senrac02!");
    }

    public String getUsername(String username) throws SQLException {
        String retrievedUsername;
        String selectQuery = "SELECT username FROM reimbursement_project.user WHERE username = '" + username + "'";
        statement = connection.createStatement();
        result = statement.executeQuery(selectQuery);
        retrievedUsername = result.getString("username");

        return retrievedUsername;
    }

    public String getPassword(String password) throws SQLException {
        String retrievedPassword;
        String selectQuery = "SELECT password FROM reimbursement_project.user WHERE password = '" + password + "'";
        statement = connection.createStatement();
        result = statement.executeQuery(selectQuery);
        retrievedPassword = result.getString("password");

        return retrievedPassword;
    }

    public String getFirstName(String firstName) throws SQLException
    {
        String retrievedFirstName;
        String selectQuery = "SELECT first_name FROM reimbursement_project.user WHERE first_name = '" + firstName + "'";
        statement = connection.createStatement();
        result = statement.executeQuery(selectQuery);
        retrievedFirstName = result.getString("first_name");

        return retrievedFirstName;
    }

    public String getLastName(String lastName) throws SQLException
    {
        String retrievedLastName = "";
        String selectQuery = "SELECT last_name FROM reimbursement_project.user WHERE last_name = '" + lastName + "'";
        statement = connection.createStatement();
        result = statement.executeQuery(selectQuery);
        while(result.next()) {
            retrievedLastName = result.getString("last_name");
        }

        return retrievedLastName;
    }

    public String getRole(String role) throws SQLException {
        String retrievedRole;
        String selectQuery = "SELECT role FROM reimbursement_project.user Where role = '" + role + "'";
        statement = connection.createStatement();
        result = statement.executeQuery(selectQuery);
        retrievedRole = result.getString("role");

        return retrievedRole;
    }

    public List<String> getAllEmployees() throws SQLException {
        List<String> retrievedEmployees = new ArrayList<>();
        String selectQuery = "SELECT first_name, last_name FROM reimbursement_project.user WHERE role = 'employee'";
        statement = connection.createStatement();
        result = statement.executeQuery(selectQuery);

        while (result.next())
        {
            retrievedEmployees.add(result.getString("role"));
        }

        return retrievedEmployees;
    }


}
