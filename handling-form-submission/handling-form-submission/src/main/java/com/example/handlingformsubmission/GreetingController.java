package com.example.handlingformsubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller//make this class the controller for http requests
public class GreetingController {

    //ensures that HTTP GET requests to the specified end point are to the greetingForm method.
    @GetMapping("/greeting")
    public String greetingForm(Model model){
        model.addAttribute("greeting", new Greeting());
        return "greeting";//returns a name of a view responsible for rendering html content
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        return "result";
    }
//    The Greeting is a @ModelAttribute, so it is bound to the incoming form content.
//    Also, the submitted data can be rendered in the result view by referring to it
//    by name (by default, the name of the method parameter, so greeting in this case)
}
https://spring.io/guides/gs/handling-form-submission/
