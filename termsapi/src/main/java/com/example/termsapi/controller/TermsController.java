package com.example.termsapi.controller;

import com.example.termsapi.model.Terms;
import com.example.termsapi.response.ApiResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/terms")
public class TermsController {

    private String currentTerms = "Default Terms and Conditions.";

    @GetMapping
    public ResponseEntity<ApiResponse> getTerms() {
        Terms terms = new Terms(currentTerms);
        return ResponseEntity.ok(new ApiResponse("Terms fetched successfully", terms));
    }

    @PutMapping
    public ResponseEntity<ApiResponse> updateTerms(@Valid @RequestBody Terms newTerms) {
        currentTerms = newTerms.getContent();
        return ResponseEntity.ok(new ApiResponse("Terms updated successfully", newTerms));
    }
}
