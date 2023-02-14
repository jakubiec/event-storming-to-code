package com.github.music_registration.domain.iteration_1_cqs;

public record WorkTitle(String value) {
    
    public WorkTitle {
        value = value.toUpperCase();
    }
}
