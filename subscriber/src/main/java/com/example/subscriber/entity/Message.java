package com.example.subscriber.entity;




import java.sql.Timestamp;



public class Message {


    private int id;
    private int msisdn;
    private Action type;
    private long timestamp;

    public Message() {
    }

    public Message(int id, int msisdn, Action type, long timestamp) {
        this.id = id;
        this.msisdn = msisdn;
        this.type = type;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(int msisdn) {
        this.msisdn = msisdn;
    }

    public Action getType() {
        return type;
    }

    public void setType(Action type) {
        this.type = type;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
