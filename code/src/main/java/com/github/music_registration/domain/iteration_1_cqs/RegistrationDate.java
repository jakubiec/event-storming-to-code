package com.github.music_registration.domain.iteration_1_cqs;

import java.time.LocalDate;

public record RegistrationDate(LocalDate value) {
    
    static RegistrationDate now() {
        return new RegistrationDate(LocalDate.now());
    }
    
    Boolean isToday() {
        return value.isEqual(LocalDate.now());
    }
}
