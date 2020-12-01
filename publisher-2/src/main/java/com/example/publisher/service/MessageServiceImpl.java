package com.example.publisher.service;

import com.example.publisher.dao.MessageRepository;
import com.example.publisher.entity.Message;
import com.example.publisher.post.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class MessageServiceImpl implements MessageService{

    @Autowired
    MessageRepository messageRepository;



    @Override
    public synchronized String save(Message message) {

        messageRepository.save(message);


        return "Message with " + message.getId() + " and " + message.getType() + " was saved";
    }

    @Override
    public List<Message> findAll() {
        return messageRepository.findAll();
    }



    @Override
    public Message findById(int number) {
        return null;
    }
}
