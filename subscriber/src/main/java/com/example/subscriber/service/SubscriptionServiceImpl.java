package com.example.subscriber.service;


import com.example.subscriber.dao.SubscriptionRepository;

import com.example.subscriber.entity.Subscribtion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SubscriptionServiceImpl implements SubscriptionService{

    @Autowired
    SubscriptionRepository subscriptionRepository;



    @Override
    public synchronized String save(Subscribtion subscription) {

        subscriptionRepository.save(subscription);


        return "Subscription with " + subscription.getId() + " was saved";
    }

    @Override
    public List<Subscribtion> findAll() {
        return subscriptionRepository.findAll();
    }



    @Override
    public Subscribtion findById(int number) {
        return null;
    }
}
