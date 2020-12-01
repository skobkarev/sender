package com.example.subscriber.service;


import com.example.subscriber.dao.PurchaseRepository;
import com.example.subscriber.entity.Purchase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PurchaseServiceImpl implements PurchaseService{

    @Autowired
    PurchaseRepository purchaseRepository;



    @Override
    public synchronized String save(Purchase purchase) {

        purchaseRepository.save(purchase);


        return "Purchase with " + purchase.getId() + " was saved";
    }

    @Override
    public List<Purchase> findAll() {
        return purchaseRepository.findAll();
    }



    @Override
    public Purchase findById(int number) {
        return null;
    }
}
