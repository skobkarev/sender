package com.example.subscriber.entity;

import javax.persistence.*;
import java.sql.Timestamp;



@Entity
@Table(name="subscription")
public class Subscribtion {


    @Id
    @SequenceGenerator(name = "subscriptionIdSeq", sequenceName = "subscription_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "subscriptionIdSeq")
    private int id;


    @Column(name="incomingid")
    private int incomingid;

    @Column(name="msisdn")
    private int msisdn;

    @Column(name="timestamp")
    private long timestamp;

    public Subscribtion() {
    }

    public Subscribtion(int incomingid, int msisdn, long timestamp) {
        this.incomingid = incomingid;
        this.msisdn = msisdn;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIncomingid() {
        return incomingid;
    }

    public void setIncomingid(int incomingid) {
        this.incomingid = incomingid;
    }

    public int getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(int msisdn) {
        this.msisdn = msisdn;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Subscribtion{" +
                "id=" + id +
                ", incomingid=" + incomingid +
                ", msisdn=" + msisdn +
                ", timestamp=" + timestamp +
                '}';
    }
}
