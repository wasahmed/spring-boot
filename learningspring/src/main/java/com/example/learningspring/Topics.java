package com.example.learningspring;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topics {
    @Id
    private String id;
    private String topic;
    private String desc;

    public Topics() {
    }

    public Topics(String id, String topic, String desc) {
        this.id = id;
        this.topic = topic;
        this.desc = desc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
