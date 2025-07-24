package com.example.termsapi.model;

import jakarta.validation.constraints.NotBlank;

public class Terms {

    @NotBlank(message = "Terms content must not be blank")
    private String content;

    public Terms() {}

    public Terms(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
