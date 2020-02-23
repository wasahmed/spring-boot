package com.example.learningspring.model;

public class Topics {
    private int id;
    private String topic;
    private String desc;

    public Topics() {
    }

    public Topics(int id, String topic, String desc) {
        this.id = id;
        this.topic = topic;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
