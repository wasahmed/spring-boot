package com.example.learningspring.controller;

import com.example.learningspring.TopicService;
import com.example.learningspring.model.Topics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class controller {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topics> getAllTopics()
    {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topics getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }
}
