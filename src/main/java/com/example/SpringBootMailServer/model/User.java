package com.example.SpringBootMailServer.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;
    private String password;

    @OneToMany(mappedBy = "fromUser", cascade = CascadeType.ALL)
    private List<Email> sentEmails;

    @OneToMany(mappedBy = "toUser", cascade = CascadeType.ALL)
    private List<Email> receivedEmails;
}
