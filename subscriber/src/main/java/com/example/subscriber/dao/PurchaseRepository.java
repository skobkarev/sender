package com.example.subscriber.dao;



import com.example.subscriber.entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {

}
