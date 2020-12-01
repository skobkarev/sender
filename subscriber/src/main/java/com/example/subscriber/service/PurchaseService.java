package com.example.subscriber.service;



import com.example.subscriber.entity.Purchase;

import java.util.List;

public interface PurchaseService {

    public String save(Purchase purchase);

    public List<Purchase> findAll();

    public Purchase findById(int number);



}
