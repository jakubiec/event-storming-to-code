package com.github.music_registration.domain.iteration_1_cqs;

public class MusicalWork {
    private MusicalWorkId id;
    private Status status = Status.Unregistered;
    private RegistrationDetails registrationDetails;

    public void register(CreatorId creatorId, WorkTitle title, MusicGenre musicGenre) {
        if (isRegistered()) {
            throw new MusicalWorkAlreadyRegistered(id, creatorId);
        }
        
        this.id = MusicalWorkId.next();
        this.registrationDetails = new RegistrationDetails(creatorId, title, musicGenre, RegistrationDate.now());
        this.status = Status.Registered;
    }
    
    Boolean isRegistered() {
        return status == Status.Registered;
    }

    MusicalWorkId id() {
        return id;
    }

    RegistrationDetails registrationDetails() {
        return registrationDetails;
    }

    static enum Status {
        Unregistered, Registered
    }
}
