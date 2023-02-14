---
class: 'text-white'
layout: two-cols
hideInToc: true
---

::default::

# Example Mapping
#### Musical Work Registered


<div v-click="1">

<div style="color:#f26d83">1. What does it mean that musical work is registered?</div>

</div>

<div v-click="2">

<div style="color:#f26d83">2. How can we reference a registered musical work?</div>

</div>

<div v-click="3">

<div style="color:#f26d83">3. What is changing after registration?</div>

</div>

<div v-click="4">

> After successful musical work registration, work status changes to registered, and we are able to locate work to see registration details like: title, genre, who and when registered it - Jakub (Copyright Officer)

</div>

::right::

<div v-click="5">

```mermaid{scale: 0.8}
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

MusicalWorkRegistered[MusicalWorkRegistered:\n- musicalWorkId: UUID\n- registeredBy: 'bob-marley-1234'\n- workTitle: 'ONE LOVE'\n- musicGenre: Reggae\n- registeredAt: '1984-04-16' ]:::event

end

Given-.-When
When-.-Then

linkStyle 0 stroke:#2b3846,color:red;
linkStyle 1 stroke:#2b3846,color:red;

classDef event fill:#f58318;
classDef command fill:#48a1f0;
```
</div>

<CurrentPage />