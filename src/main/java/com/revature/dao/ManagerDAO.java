package com.revature.dao;

import com.revature.main.Manager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ManagerDAO {


    private static ManagerDAO managerDAO = null;

    private ManagerDAO() {
    }

    public static ManagerDAO instance() {
        if (managerDAO == null) {
            managerDAO = new ManagerDAO();
        }
        return managerDAO;
    }

    public Optional<Manager> getUserById(int id) {
        return users.stream().filter(u -> u.getId() == id).findAny();
    }

    public Iterable<String> getAllUsernames() {
        return users.stream().map(user -> user.getName()).collect(Collectors.toList());
    }

    public int getId()
    {	int a = 0;
    	return a;
    }

    public String getUsername()
    {}

    public String getPassword()
    {}

    public String getAllEmployees()
    {}

    public boolean denyRequest()
    {}

    public boolean approveRequest()
    {}

    public void viewReimbursementByUser()
    {}

    public void viewReimbursementAll()
    {}



    
}
