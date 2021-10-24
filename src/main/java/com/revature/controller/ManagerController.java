package com.revature.controller;

import com.revature.dao.ManagerDAO;
import io.javalin.http.Handler;

public class ManagerController {



    public static Handler fetchAllUsernames = ctx -> {
        ManagerDAO dao = ManagerDAO.instance();
    //    Iterable<String> allUsers = dao.getAllUsernames();
    //    ctx.json(allUsers);
    };

    public String fetchUsername()
    {
        ManagerDAO dao = ManagerDAO.instance();
        String x = "";
        return x;
    }

   // public String fetchPassword()
  //  {
        //ManagerDAO dao = ManagerDAO.instance();
        //String password = dao.getPassword();
        //ctx.json(password);
   // }

    //public String getAllEmployees()
    {

    }




}
