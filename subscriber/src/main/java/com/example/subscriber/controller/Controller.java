package com.example.subscriber.controller;


import com.example.subscriber.entity.Action;
import com.example.subscriber.entity.Message;
import com.example.subscriber.entity.Purchase;
import com.example.subscriber.entity.Subscribtion;
import com.example.subscriber.service.PurchaseServiceImpl;
import com.example.subscriber.service.SubscriptionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {

    PurchaseServiceImpl purchaseServiceImpl;
    SubscriptionServiceImpl subscriptionServiceImpl;

    @Autowired
    public Controller(PurchaseServiceImpl purchaseServiceImpl, SubscriptionServiceImpl subscriptionServiceImpl) {
        this.purchaseServiceImpl = purchaseServiceImpl;
        this.subscriptionServiceImpl = subscriptionServiceImpl;
    }



    @PostMapping("/message.json")
    public ResponseEntity action(@RequestBody Message message) {



        Purchase purchase;
        Subscribtion subscribtion;

        Message incomingMessage = message;


        if(message.getType()==Action.Purchase) {
            purchase = new Purchase(message.getId(), incomingMessage.getMsisdn(), message.getTimestamp());
            //---------------------ENTER SAVE
            purchaseServiceImpl.save(purchase);
            System.out.println(purchase + " " + purchase.getId() + " saved");

        }
        if(message.getType()==Action.Subscription) {
            subscribtion = new Subscribtion(message.getId(), incomingMessage.getMsisdn(), message.getTimestamp());
            //-------------------------ENTER SAVE
            subscriptionServiceImpl.save(subscribtion);
            System.out.println(subscribtion + " " + subscribtion.getId() + " saved");
        }


        return new ResponseEntity(HttpStatus.OK);
    }

}
