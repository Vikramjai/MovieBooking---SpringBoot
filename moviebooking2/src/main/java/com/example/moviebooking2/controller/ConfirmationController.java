package com.example.moviebooking2.controller;

import com.example.moviebooking2.model.Confirmation;
import com.example.moviebooking2.service.ConfirmationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/confirmations")
public class ConfirmationController {

    private final ConfirmationService confirmationService;

    @Autowired
    public ConfirmationController(ConfirmationService confirmationService) {
        this.confirmationService = confirmationService;
    }

    @GetMapping
    public List<Confirmation> getAllConfirmations() {
        return confirmationService.getAllConfirmations();
    }

    @GetMapping("/{id}")
    public Confirmation getConfirmationById(@PathVariable Long id) {
        return confirmationService.getConfirmationById(id).orElse(null);
    }

    @PostMapping
    public Confirmation createConfirmation(@RequestBody Confirmation confirmation) {
        return confirmationService.createConfirmation(confirmation);
    }

    @PutMapping("/{id}")
    public Confirmation updateConfirmation(@PathVariable Long id, @RequestBody Confirmation confirmation) {
        confirmation.setId(id);
        return confirmationService.updateConfirmation(confirmation);
    }

    @DeleteMapping("/{id}")
    public void deleteConfirmation(@PathVariable Long id) {
        confirmationService.deleteConfirmationById(id);
    }
}
