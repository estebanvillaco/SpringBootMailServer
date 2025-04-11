package com.example.SpringBootMailServer.service;

import com.example.SpringBootMailServer.model.Email;
import com.example.SpringBootMailServer.model.User;
import com.example.SpringBootMailServer.repository.EmailRepository;
import com.example.SpringBootMailServer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EmailService {

    @Autowired
    private EmailRepository emailRepository;

    @Autowired
    private UserRepository userRepository;

    public Email sendEmail(Long fromUserId, Long toUserId, Email email) {
        User fromUser = userRepository.findById(fromUserId).orElseThrow();
        User toUser = userRepository.findById(toUserId).orElseThrow();

        email.setFromUser(fromUser);
        email.setToUser(toUser);
        email.setTimestamp(LocalDateTime.now());

        return emailRepository.save(email);
    }

    public List<Email> getSentEmails(Long userId) {
        return emailRepository.findByFromUserId(userId);
    }

    public List<Email> getReceivedEmails(Long userId) {
        return emailRepository.findByToUserId(userId);
    }
}
