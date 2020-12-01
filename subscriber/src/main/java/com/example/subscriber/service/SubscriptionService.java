package com.example.subscriber.service;



import com.example.subscriber.entity.Purchase;
import com.example.subscriber.entity.Subscribtion;

import java.util.List;
import java.util.concurrent.Flow;

public interface SubscriptionService {

    public String save(Subscribtion subscribtion);

    public List<Subscribtion> findAll();

    public Subscribtion findById(int number);



}
