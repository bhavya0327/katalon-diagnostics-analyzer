## Daily log

### Day 1 · Mon 23 Nov 2026: Project setup and first class

**Goal:**
 - Implementing Java code, setting up the pom.xml and running the tests through maven.

**What I built:**
 - Created LogEntry (models one Eclipse .log entry) and LogEntryTest, which checks its behavior. The test depends on the class, not the other way round.
 - Initially understood the variable declarations and constructor creation.

**What I learned:**
- Maven lifecycle: phases run in a fixed order (validate → compile → test → package); mvn test runs every phase up to and including test. There is no run phase.
- Constructor should have the same name as the class
- Constructor Should not have a return type
- this.severity = severity; means "my field (this.severity) gets the value passed in (severity)"
- final is a promise that the field is assigned exactly once, before the constructor finishes. The compiler checks every path through the constructor. When the constructor ends and message was never assigned, the promise is broken, so Java refuses to build.
- final turns a runtime bug into a compile error. Compile errors are the cheapest bugs to fix.


**What confused me / still unclear:**
 - Need to understand more on creating and the use of constructors.
 - Need to understand more on the variable declaration and the modifiers.

**Link to Katalon (where I've seen this in tickets or the product):**
 - Studio's .metadata/.log uses severity 4 for errors; I see these in customer startup tickets.

**Commits:**
 - 5887d29 (LogEntry + tests)

---

<!-- Copy this block for each new day -->
### Day 2 · Mon 23 Nov 2026: Turn normal error lines into Log Entry


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
