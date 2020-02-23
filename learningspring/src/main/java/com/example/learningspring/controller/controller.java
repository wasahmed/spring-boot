package com.example.learningspring.controller;

import com.example.learningspring.TopicService;
import com.example.learningspring.model.Topics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class controller {

    @Autowired
    private TopicService topicService;
    //instance of the service

    @RequestMapping("/topics")
    public List<Topics> getAllTopics()
    {
        return topicService.getAllTopics();
    }
    //getting the list from our service

    @RequestMapping("/topics/{id}")
    public Topics getTopic(@PathVariable String id)
    {
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topics topic)
    {
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "topics/{id}")
    public void updateTopic(@RequestBody Topics topic, @PathVariable String id)
    {
        topicService.updateTopic(topic, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "topics/{id}")
    public void deleteTopic(@PathVariable String id)
    {
        topicService.deleteTopic(id);
    }
}
