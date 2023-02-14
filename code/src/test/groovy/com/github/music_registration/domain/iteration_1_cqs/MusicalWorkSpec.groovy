package com.github.music_registration.domain.iteration_1_cqs

import spock.lang.Specification

class MusicalWorkSpec extends Specification {
    
    private MusicalWork musicalWork
    
    def "should register new musical work"() {
        given:
        noEvents()
        
        when:
        registerMusicalWork("bob-marley-1234", "One Love", MusicGenre.Reggae)
        
        then:
        expectsThatMusicalWorkRegistered(new CreatorId("bob-marley-1234"), new WorkTitle("ONE LOVE"), MusicGenre.Reggae)
    }

    def "should not register already registered musical work"() {
        given:
        musicalWorkRegistered("bob-marley-1234", "One Love", MusicGenre.Reggae)

        when:
        registerMusicalWork("ziggy-marley-543", "One Love", MusicGenre.Reggae)

        then:
        def musicalWorkAlreadyRegistered = thrown(MusicalWorkAlreadyRegistered)
        musicalWorkAlreadyRegistered.registrationRequestedBy == new CreatorId("ziggy-marley-543")
    }
    
    private def noEvents() {
        musicalWork = new MusicalWork()
    }
    
    private def musicalWorkRegistered(String creatorId, String title, MusicGenre genre) {
        musicalWork = new MusicalWork()
        registerMusicalWork(creatorId, title, genre)
    }
    
    private def registerMusicalWork(String creatorId, String title, MusicGenre genre) {
        musicalWork.register(new CreatorId(creatorId), new WorkTitle(title), genre)
    }
    
    private def expectsThatMusicalWorkRegistered(CreatorId creatorId, WorkTitle workTitle, MusicGenre genre) {
        musicalWork.id() != null
        musicalWork.isRegistered() == true
        musicalWork.registrationDetails().registeredBy() == creatorId
        musicalWork.registrationDetails().title() == workTitle
        musicalWork.registrationDetails().genre() == genre
        musicalWork.registrationDetails().registeredAt().isToday() == true
    }
}
