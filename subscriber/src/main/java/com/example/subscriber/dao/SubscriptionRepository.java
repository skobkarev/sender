package com.example.subscriber.dao;



import com.example.subscriber.entity.Purchase;
import com.example.subscriber.entity.Subscribtion;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SubscriptionRepository extends JpaRepository<Subscribtion, Integer> {

}
