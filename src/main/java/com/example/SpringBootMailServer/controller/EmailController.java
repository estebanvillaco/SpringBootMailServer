package com.example.SpringBootMailServer.controller;

import com.example.SpringBootMailServer.model.Email;
import com.example.SpringBootMailServer.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emails")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/send")
    public Email send(@RequestParam Long fromUserId, @RequestParam Long toUserId, @RequestBody Email email) {
        return emailService.sendEmail(fromUserId, toUserId, email);
    }

    @GetMapping("/sent/{userId}")
    public List<Email> getSentEmails(@PathVariable Long userId) {
        return emailService.getSentEmails(userId);
    }

    @GetMapping("/received/{userId}")
    public List<Email> getReceivedEmails(@PathVariable Long userId) {
        return emailService.getReceivedEmails(userId);
    }
}
