package com.example.learningspring;

import com.example.learningspring.model.Topics;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Service
public class TopicService {

    List<Topics> topics = new ArrayList<>(Arrays.asList(
            new Topics("1", "test", "test desc"),
            new Topics("2", "test1", "test desc1"),
            new Topics("3", "test2", "test desc2")
    ));


    public List<Topics> getAllTopics()
    {
        return topics;
    }

    public Topics getTopic(String id)
    {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topics topic) {
        topics.add(topic);
    }

    public void updateTopic(Topics topic, String id) {
        for (int i = 0; i < topics.size(); i++)
        {
            Topics t = topics.get(i);
            if (t.getId().equals(id))
            {
                topics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }
}
