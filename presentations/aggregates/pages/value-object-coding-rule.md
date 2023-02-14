---
class: 'text-white'
layout: two-cols
title: Coding rules
lineNumbers: true
highlighter: shiki
hideInToc: true
---

::default::

# Value object


```mermaid
flowchart LR 

CreatorId[CreatorId:\n- uniquely identifies Creator\n- external id from copyright system\n- doesn't change once assigned]:::vo
WorkTitle[WorkTitle:\n- text provided by Creator\n- always upper case]:::vo
MusicGenre[MusicGenre:\n- a list of pre-defined values by industry\n- changes very rarely]:::vo

classDef vo fill:#bd9d40;
```


::right::

<div v-click="1">

# Immutable Class

```java {all}
public record CreatorId(String value) { }
```
<br/>
<br/>

```java {all}
public record WorkTitle(String value) {

    public WorkTitle {
        value = value.toUpperCase();
    }
}
```
<br />

```java {all}
public enum MusicGenre {
    Pop, Reggae, Rock, Metal, 
    Jazz, Rap, Classic
}
```

</div>


<CurrentPage />

