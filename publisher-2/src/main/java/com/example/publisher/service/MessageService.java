package com.example.publisher.service;

import com.example.publisher.entity.Message;

import java.util.List;

public interface MessageService {

    public String save(Message message);

    public List<Message> findAll();

    public Message findById(int number);



}
