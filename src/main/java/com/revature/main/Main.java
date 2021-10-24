package com.revature.main;

import com.revature.dao.ManagerDAO;
import io.javalin.Javalin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Javalin app = Javalin.create(config -> { config.addStaticFiles("/public");
        }).start(7000);
        ManagerDAO.instance().connect();
        System.out.println(ManagerDAO.instance().getLastName("Johnson"));



        


    }
}
