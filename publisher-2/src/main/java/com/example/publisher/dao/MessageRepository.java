package com.example.publisher.dao;


import com.example.publisher.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface MessageRepository extends JpaRepository<Message, Integer> {
}
