package com.todo.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.net.http.HttpClient;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

    @RequestMapping("/delete")
    public String delete(@RequestParam int id)
    {
        repo.deleteById(id);
        return "showToDo.html";
    }

    // TODO: 2020/02/10
//    @RequestMapping("/update")
//    public String update(@RequestParam int id)
//    {
//        repo.
//        return "showToDo.html";
//    }

    @RequestMapping("/getAll")
    public String getAll(Model model)
    {
        List<Todo> lst = repo.printAll();
        StringBuilder str = new StringBuilder("");
        for (Todo t: lst) {
            str.append("<li>");
            str.append(t.toString());
            str.append("</li>");
            str.append("<a href='/delete?id=");
            str.append(t.getId());
            str.append("'>Delete</a>  ");
//            str.append("<a href='/update?id=");
//            str.append(t.getId());
//            str.append("'>Edit</a>");
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
