---
class: 'text-white'
layout: full
title: Coding rules
lineNumbers: true
highlighter: shiki
hideInToc: true
---

# Command on Aggregate

```mermaid
flowchart LR 

MusicalWork[MusicalWork\n\n\n\n]:::aggregate
RegisterMusicalWork[RegisterMusicalWork:\n- creatorId: 'bob-marley-1234'\n- workTitle: 'ONE LOVE'\n- musicGenre: Reggae]:::command

RegisterMusicalWork-.-MusicalWork

classDef aggregate fill:#bd9d40;
classDef command fill:#48a1f0;
```




<v-click>

# Method in Class

```java{all}
public class MusicalWork() {
   
    public void register(CreatorId creatorId, WorkTitle title, MusicGenre genre) {


    }
}

```
</v-click>


<CurrentPage />

