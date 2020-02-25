package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class myController {

    @Autowired
   DBConnect con;

    @RequestMapping("/")
    public  String test(){
        con.getConnection();
        return "testing connecion";
    }

}
