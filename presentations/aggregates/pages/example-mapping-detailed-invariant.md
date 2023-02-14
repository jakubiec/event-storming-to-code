---
class: 'text-white'
layout: two-cols
hideInToc: true
---

::default::

# Example Mapping
#### Already Registered exploration


<div v-click="1">

<div style="color:#f26d83">1. What should happen if work is registered for the second time?</div>

</div>

<div v-click="2">

> It should not be allowed and may lead to ambiguity. We would like to be informed about such situation - J.

</div>


<div v-click="3">

<div style="color:#f26d83">2. About what details you would like to be informed?</div>

</div>

<div v-click="4">

> Musical work id and creator how tried it should be enough - J.

</div>

::right::

<div v-click="5">

```mermaid{scale: 0.7}
flowchart TB 

subgraph Given[Given]
direction LR

MusicalWorkRegistered[MusicalWorkRegistered:\n- musicalWorkId: UUID\n- registeredBy: 'bob-marley-1234'\n- workTitle: 'ONE LOVE'\n- musicGenre: Reggae\n- registeredAt: '1984-04-16' ]:::event

end


subgraph When[When]
direction LR

RegisterMusicalWork[RegisterMusicalWork:\n- creatorId: 'ziggy-marley-543'\n- workTitle: 'ONE LOVE'\n- musicGenre: Reggae]:::command

end


subgraph Then[Then]
direction LR

MusicalWorkAlreadyRegistered[MusicalWorkAlreadyRegistered:\n- musicalWorkId: UUID\n- registrationRequestedBy: 'ziggy-marley-543']:::error

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