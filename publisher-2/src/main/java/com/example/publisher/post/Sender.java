package com.example.publisher.post;

import com.example.publisher.dao.MessageRepository;
import com.example.publisher.entity.Action;
import com.example.publisher.entity.Message;
import com.example.publisher.service.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/")
public class Sender {

    static final String MESSAGE_JSON = "http://localhost:8080/api/message.json";
    MessageServiceImpl messageServiceImpl;


    @Autowired
    public Sender(MessageServiceImpl messageServiceImpl) {
        this.messageServiceImpl = messageServiceImpl;
    }


    @GetMapping("/send")
    public void send() {

        ExecutorService executorService = Executors.newFixedThreadPool(5);
            for(int i = 0; i<5; i++) {
                executorService.submit(
                        (Runnable) () -> {

                            while (true)
                             {
                                 try {
                                     Thread.sleep(100);
                                 } catch (InterruptedException e) {
                                     e.printStackTrace();
                                 }

                                 RestTemplate restTemplate = new RestTemplate();
//
                                int msisdn = new Random().nextInt(1_000_000_000);
                                int actionNumber = new Random().nextInt(2);
                                long timestamp = new Date().getTime();

                                Message message = new Message( msisdn, Action.values()[actionNumber], timestamp);

                                messageServiceImpl.save(message);

                                HttpEntity<Message> requestBody = new HttpEntity<>(message);

                                restTemplate.postForEntity(MESSAGE_JSON, requestBody, Message.class);
                           }

                        });
                }
    }
}
