package com.example.moviebooking2.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.example.moviebooking2.model.Confirmation;

public interface ConfirmationRepository extends JpaRepository<Confirmation, Long> {
    
}
