---
class: 'text-white'
layout: full
title: Coding rules
lineNumbers: true
highlighter: shiki
hideInToc: true
---
# Example Mapping == Test Case


```groovy{all}{maxHeight:'400px'}
    
    def "should register new musical work"() {
        given:
        noEvents()
        
        when:
        registerMusicalWork("bob-marley-1234", "One Love", MusicGenre.Reggae)
        
        then:
        expectsThatMusicalWorkRegistered(new CreatorId("bob-marley-1234"), new WorkTitle("ONE LOVE"), MusicGenre.Reggae)
    }
   
```


<CurrentPage />

