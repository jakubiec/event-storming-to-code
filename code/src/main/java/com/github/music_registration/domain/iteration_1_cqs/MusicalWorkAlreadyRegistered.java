package com.github.music_registration.domain.iteration_1_cqs;

public class MusicalWorkAlreadyRegistered extends RuntimeException {
    final MusicalWorkId musicalWorkId;
    final CreatorId registrationRequestedBy;
    
    MusicalWorkAlreadyRegistered(MusicalWorkId musicalWorkId, CreatorId registrationRequestedBy) {
        this.musicalWorkId = musicalWorkId;
        this.registrationRequestedBy = registrationRequestedBy;
    }
}
