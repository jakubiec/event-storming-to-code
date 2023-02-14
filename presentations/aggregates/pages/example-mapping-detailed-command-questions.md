---
class: 'text-white'
layout: two-cols
hideInToc: true
---

::default::

# Example Mapping
#### Register Musical Work Exploration


<div v-click="1">

<div style="color:#f26d83">1. What is required to register musical work?</div>

</div>

<div v-click="2">

<div style="color:#f26d83">2. Could you provide some example values used for registration?</div>

</div>

<div v-click="3">

> We need to know who (the creator), under what title and genre is want to register musical work - Jakub (Copyright Officer)
> 
</div>

<div v-click="5">

<br/>
<br/>
<br/>
<div class="animate-pulse" style="color:#f26d83">How to model creatorId, workTitle, musicGenre?</div>

</div>

::right::

<div v-click="4">

```mermaid
flowchart TB 

subgraph Given[Given]
direction LR

NoEvents

end


subgraph When[When]
direction LR

RegisterMusicalWork[RegisterMusicalWork:\n- creatorId: 'bob-marley-1234'\n- workTitle: 'ONE LOVE'\n- musicGenre: Reggae]:::command

end


subgraph Then[Then]
direction LR

MusicalWorkRegistered:::event

end

Given-.-When
When-.-Then

linkStyle 0 stroke:#2b3846,color:red;
linkStyle 1 stroke:#2b3846,color:red;

classDef event fill:#f58318;
classDef command fill:#48a1f0;
classDef error fill:#f44336;
```
</div>

<CurrentPage />