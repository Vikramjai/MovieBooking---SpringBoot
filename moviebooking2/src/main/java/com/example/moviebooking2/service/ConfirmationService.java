package com.example.moviebooking2.service;

import com.example.moviebooking2.model.Confirmation;
import com.example.moviebooking2.repository.ConfirmationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConfirmationService {

    private final ConfirmationRepository confirmationRepository;

    @Autowired
    public ConfirmationService(ConfirmationRepository confirmationRepository) {
        this.confirmationRepository = confirmationRepository;
    }

    public List<Confirmation> getAllConfirmations() {
        return confirmationRepository.findAll();
    }

    public Optional<Confirmation> getConfirmationById(Long id) {
        return confirmationRepository.findById(id);
    }

    public Confirmation createConfirmation(Confirmation confirmation) {
        return confirmationRepository.save(confirmation);
    }

    public Confirmation updateConfirmation(Confirmation confirmation) {
        return confirmationRepository.save(confirmation);
    }

    public void deleteConfirmationById(Long id) {
        confirmationRepository.deleteById(id);
    }
}
