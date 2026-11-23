# Learning Notes: Katalon Diagnostics Analyzer

My log of what I learn while building this project. Written in my own words, not copied.

**How to use this file**

- Add a new **Day** entry at the top of the *Daily log* each session.
- When a concept "clicks", add it to *Concepts* with a one-line explanation and an example.
- Every error I hit goes into the *Error log*. These are my future RCA patterns.
- Keep *Interview questions* updated: if I can answer it out loud without notes, tick it.

---

## Daily log

### Day 1 · Mon 23 Nov 2026: Project setup and first class

**Goal:**

**What I built:**

**What I learned:**

- JDK vs JVM vs Maven:
- Maven lifecycle:
- Dependency scope:
- TDD (red → green → refactor):
- Class, fields, constructor, getters:
- `private final` and immutability:
- Git: working directory, index, history:

**What confused me / still unclear:**

**Link to Katalon (where I've seen this in tickets or the product):**

**Commits:**

---

<!-- Copy this block for each new day -->
### Day N · <date>: <topic>

**Goal:**

**What I built:**

**What I learned:**

-

**What confused me / still unclear:**

**Link to Katalon:**

**Commits:**

---

## Concepts

Short definitions in my own words, grouped by area. One line + one example each.

### Java

| Concept | My explanation | Example |
| --- | --- | --- |
| Class | | |
| Constructor | | |
| `private` | | |
| `final` | | |
| Immutability | | |

### Maven

| Concept | My explanation | Example |
| --- | --- | --- |
| `pom.xml` | | |
| groupId / artifactId / version | | |
| `-SNAPSHOT` | | |
| Lifecycle phases | | |
| Dependency scope | | |
| `~/.m2` local repository | | |

### Testing

| Concept | My explanation | Example |
| --- | --- | --- |
| JUnit `@Test` | | |
| Arrange / Act / Assert | | |
| TDD | | |
| Refactoring under tests | | |

### Git

| Concept | My explanation | Example |
| --- | --- | --- |
| Working directory / index / history | | |
| `.gitignore` | | |
| `git rm --cached` | | |
| `git reset` | | |
| Remote / `origin` | | |

### Katalon internals

| Concept | My explanation | Where I saw it |
| --- | --- | --- |
| Eclipse `.metadata/.log` format | | |
| Eclipse severity (1 / 2 / 4) | | |
| "Last good → first failing hop" | | |

---

## Error log

Every error I hit, how I read it, and the fix. This is how I train my debugging.

| Date | Error (first line) | What it actually meant | Fix | Lesson |
| --- | --- | --- | --- | --- |
| 23 Nov | `Unknown lifecycle phase "run"` | | | |
| 23 Nov | `invalid method declaration; return type required` | | | |
| 23 Nov | `incompatible types: int cannot be converted to String` | | | |
| 23 Nov | `missing return statement` | | | |
| 23 Nov | `cannot find symbol: class LogEntry` | | | |
| 23 Nov | `git rm` un-tracked every file | | | |

---

## Design decisions

Why I built things the way I did. Interviewers ask "why?" more than "what?".

| Date | Decision | Options I considered | Why I chose this |
| --- | --- | --- | --- |
| | | | |

---

## Interview questions I can answer

- [ ] What's the difference between the JDK and the JVM?
- [ ] What happens when you run `mvn test`?
- [ ] Why would a library have `test` scope?
- [ ] Explain TDD and when you'd use it.
- [ ] Why make fields `private final`?
- [ ] What's the difference between `git reset` and `git rm --cached`?
- [ ] Walk me through how you'd debug a failing KRE run in CI.

---

## Questions to ask a mentor

-

---

## Resources I found useful

-
