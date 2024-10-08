package com.luisgalp.parcial1_paa;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


public interface MessageRepository extends JpaRepository<Message, Long> {
    Optional<Message> findTopByOrderByIdDesc();
}

