package com.example.moviebooking2.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.example.moviebooking2.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
 
}
