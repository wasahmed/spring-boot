package com.example.learningspring.controller;

import com.example.learningspring.model.Topics;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class controller {

    @RequestMapping("/topics")
    public List<Topics> topics()
    {
        return Arrays.asList(
                new Topics(1, "test", "test desc"),
                new Topics(2, "test1", "test desc1"),
                new Topics(3, "test2", "test desc2")

        );
    }
}
