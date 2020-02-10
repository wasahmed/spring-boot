package com.example.bootjpa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.bootjpa.Alien;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class mvcController {
    @Autowired
    AlienRepo repo;
    @RequestMapping("/home")
    public String home1()
    {
        return "home.html";
    }
    @RequestMapping("/")
    public String home()
    {
        return "home.html";
    }
    @RequestMapping("/addAlien")
    public String addAlien(Alien alien)
    {
        repo.save(alien);
        return "home.html";
    }
    @RequestMapping("/getAll")
    public String getAll()
    {
        System.out.println(repo.findAll());
        return "showAlien.html";
    }
    @RequestMapping("/login")
    public String auth()
    {
        return "login.html";
    }

//    @RequestMapping("/getAll")au
//    public ModelAndView getAlien(@RequestParam int aid)
//    {
//        ModelAndView mv=new ModelAndView("showAlien.jsp");
//        Alien alien=repo.findById(aid).orElse(new Alien());
//        mv.addObject(alien);
//        return mv;
//}
  
}
