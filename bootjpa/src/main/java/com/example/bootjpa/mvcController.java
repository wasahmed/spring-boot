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
    @RequestMapping("/")
    public String home()
    {
        return "home.jsp";
    }
    @RequestMapping("/addAlien")
    public String addAlien(Alien alien)
    {
        repo.save(alien);
        return "home.jsp";
    }
//    @RequestMapping("/getAll")
//    public String getAll()
//    {
//        System.out.println(repo.findAll());
//        return "home.jsp";
//    }
    @RequestMapping("/getAll")
    public ModelAndView getAlien(@RequestParam int aid)
    {
        ModelAndView mv=new ModelAndView("showAlien.jsp");
        Alien alien=repo.findById(aid).orElse(new Alien());
        mv.addObject(alien);
        return mv;
}
  
}
