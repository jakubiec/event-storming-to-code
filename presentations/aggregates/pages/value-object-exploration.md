---
class: 'text-white'
layout: two-cols
title: Coding rules
lineNumbers: true
highlighter: shiki
hideInToc: true
---

::right::

<div v-click="7">

# Value object


```mermaid
flowchart LR 

CreatorId[CreatorId:\n- uniquely identifies Creator\n- external id from copyright system\n- doesn't change once assigned]:::vo
WorkTitle[WorkTitle:\n- text provided by Creator\n- always upper case]:::vo
MusicGenre[MusicGenre:\n- a list of pre-defined values by industry\n- changes very rarely]:::vo

classDef vo fill:#bd9d40;
```

</div>

::default::

# Exploration


<div v-click="1">

<div style="color:#f26d83">1. What is the source of creator id? How frequent are changes?</div>

</div>

<div v-click="2">

> It comes from external system. Once assigned it doesn't change - J.

</div>

<div v-click="3">

<div style="color:#f26d83">2. Is work title any text?</div>

</div>

<div v-click="4">

> No, it's text provided by creator, and it's always represented in copyright in upper-case - J.

</div>


<div v-click="5">

<div style="color:#f26d83">3. Where do we can find possible values for music genre?</div>

</div>

<div v-click="6">

> That's easy - it's a standardised list of values- J.

</div>


<CurrentPage />

