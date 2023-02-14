---
class: 'text-white'
layout: two-cols
title: Coding rules
lineNumbers: true
highlighter: shiki
hideInToc: true
---

::default::

# Aggregate Root

```mermaid
flowchart TB 

MusicalWork[MusicalWork\n\n\n]:::aggregate

classDef aggregate fill:#bd9d40;
```

<div v-click="1">

# Command

```mermaid
flowchart TB 

RegisterMusicalWork:::command

classDef event fill:#f58318;
classDef command fill:#48a1f0;
classDef error fill:#f44336;
```

</div>


<div v-click="3" class="animate-pulse" style="color:#f26d83">

1. What about parameters?

</div>

::right::

# Class

```java {all}
public class MusicalWork() {
    
      
}

```

<div v-click="2">

# Method in Class

```java{all}
public class MusicalWork() {
   
    public void register(...) {


    }
}

```

</div>


<CurrentPage />

