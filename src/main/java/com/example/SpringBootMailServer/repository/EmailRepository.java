package com.example.SpringBootMailServer.repository;

import com.example.SpringBootMailServer.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmailRepository extends JpaRepository<Email, Long> {
    List<Email> findByToUserId(Long userId);
    List<Email> findByFromUserId(Long userId);
}
