package com.mirea.kt.example;

import java.io.*;

public class Message implements Serializable {
    private int id;
    private String body;
    private String type;
    private boolean hasAttachments;
    private long timestamp;


    private static final long serialVersionUID=-3380157693869190848L;

    public Message(int id, String body, String type, boolean hasAttachments, long timestamp) {
        this.id = id;
        this.body = body;
        this.type = type;
        this.hasAttachments = hasAttachments;
        this.timestamp = timestamp;
    }

    public Message() {}

    public int getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public String getType() {
        return type;
    }

    public boolean isHasAttachments() {
        return hasAttachments;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHasAttachments(boolean hasAttachments) {
        this.hasAttachments = hasAttachments;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }



    @Override
    public String toString() {
        return "Message {id: "+getId() +
                ", body: "+getBody() +
                ", type: "+getType() +
                ", hasAttachments: "+isHasAttachments() +
                ", timestamp: "+ getTimestamp()+ "}";
    }
}
