package com.github.music_registration.domain.iteration_1_cqs;

import java.util.UUID;

public record MusicalWorkId(UUID uuid) {
    
    static MusicalWorkId next() {
        return new MusicalWorkId(UUID.randomUUID());
    }
}
