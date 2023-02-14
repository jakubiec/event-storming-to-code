package com.github.music_registration.domain.iteration_1_cqs

import spock.lang.Specification

class WorkTitleSpec extends Specification {
    
    def "work title always should be upper cased"() {
        when:
        def workTitle = new WorkTitle(givenTitle)
        
        then:
        workTitle.value() == givenTitle.toUpperCase()
        
        where:
        givenTitle << ["one love", "oNe LoVe", "ONE LOVE", "one LOVE", "One Love"]

    }
}
