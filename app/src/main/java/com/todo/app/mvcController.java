package com.todo.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class mvcController {
    @Autowired
    TodoRepo repo;

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

    @RequestMapping("/addTodo")
    public String addTodo(Todo todo)
    {
        repo.save(todo);
        return "home.html";
    }

    @RequestMapping("/getAll")
    public String getAll(Model model)
    {
        List<Todo> lst = repo.printAll();
        StringBuilder str = new StringBuilder("");
        for (Todo t: lst) {
            str.append("<li>");
            str.append(t.toString());
        }
        model.addAttribute("toDo", str.toString());
        return "showTodo.html";
    }

    @RequestMapping("/login")
    public String auth()
    {
        return "login.html";
    }
}
