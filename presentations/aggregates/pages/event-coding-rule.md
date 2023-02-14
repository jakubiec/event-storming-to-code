---
class: 'text-white'
layout: full
title: Coding rules
lineNumbers: true
highlighter: shiki
hideInToc: true
---

# Event from Aggregate

```mermaid{scale: 0.8}
flowchart LR 

MusicalWork[MusicalWork:\n- id: UUID\n- status: 'Unregistered'\n- registrationDetails: RegistrationDetails]:::aggregate
RegisterMusicalWork[RegisterMusicalWork:\n- creatorId: 'bob-marley-1234'\n- workTitle: 'ONE LOVE'\n- musicGenre: Reggae]:::command
MusicalWorkRegistered[MusicalWorkRegistered:\n- musicalWorkId: UUID\n- registeredBy: 'bob-marley-1234'\n- workTitle: 'ONE LOVE'\n- musicGenre: Reggae\n- registeredAt: '1984-04-16' ]:::event


RegisterMusicalWork-.-MusicalWork
MusicalWork-.-MusicalWorkRegistered

classDef aggregate fill:#bd9d40;
classDef command fill:#48a1f0;
classDef event fill:#f58318;
```




<v-click>

# State changes

```java{all}{maxHeight:'200px'}
public class MusicalWork {
    private MusicalWorkId id;
    private Status status = Status.Unregistered;
    private RegistrationDetails registrationDetails;
    
    public void register(CreatorId creatorId, WorkTitle title, MusicGenre musicGenre) {
        this.id = MusicalWorkId.next();
        this.registrationDetails = new RegistrationDetails(creatorId, title, musicGenre, RegistrationDate.now());
        this.status = Status.Registered;
    }
    
    static enum Status {
        Unregistered, Registered
    } 
}
```
</v-click>


<CurrentPage />

