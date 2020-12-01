package com.example.publisher;

import com.example.publisher.dao.MessageRepository;
import com.example.publisher.post.Sender;
import com.example.publisher.service.MessageService;
import com.example.publisher.service.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PublisherApplication {


	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(PublisherApplication.class, args);

	}


}
