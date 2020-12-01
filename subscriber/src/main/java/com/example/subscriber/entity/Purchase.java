package com.example.subscriber.entity;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name="purchase")
public class Purchase {

    @Id
    @SequenceGenerator(name = "purchaseIdSeq", sequenceName = "purchase_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "purchaseIdSeq")
    private int id;


    @Column(name="incomingid")
    private int incomingid;

    @Column(name="msisdn")
    private int msisdn;

    @Column(name="timestamp")
    private long timestamp;

    public Purchase(int incomingid, int msisdn, long timestamp) {
        this.incomingid = incomingid;
        this.msisdn = msisdn;
        this.timestamp = timestamp;
    }

    public Purchase() {
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
        return "Purchase{" +
                "id=" + id +
                ", incomingid=" + incomingid +
                ", msisdn=" + msisdn +
                ", timestamp=" + timestamp +
                '}';
    }
}
