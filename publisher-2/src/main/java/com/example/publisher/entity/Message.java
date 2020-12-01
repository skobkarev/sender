package com.example.publisher.entity;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Random;


@Entity
@Table(name="numbers")
public class Message {


    @Id
    @SequenceGenerator(name = "numbersIdSeq", sequenceName = "numbers_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "numbersIdSeq")

    //@GeneratedValue(strategy = GenerationType.AUTO)
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @Column(name="msisdn")
    private int msisdn;

    @Column(name="action")
    private Action action;

    @Column(name="timestamp")
    private long timestamp;


    public Message() { }


    public Message(int msisdn, Action action, long timestamp) {
        this.msisdn = msisdn;
        this.action = action;
        this.timestamp = timestamp;
    }

    public Message(int id, int msisdn, Action action, long timestamp) {
        this.id = id;
        this.msisdn = msisdn;
        this.action = action;
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

        return action;
    }


    public void setType(Action action) {
        this.action = action;
    }


    public long getTimestamp() {

        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
