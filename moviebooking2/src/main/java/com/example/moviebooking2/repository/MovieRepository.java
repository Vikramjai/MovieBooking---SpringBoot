package com.example.moviebooking2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.moviebooking2.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
