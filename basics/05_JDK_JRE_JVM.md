# ☕ JDK, JRE, and JVM

## 📌 Introduction

When learning Java, you will often hear three terms:

- **JDK (Java Development Kit)**
- **JRE (Java Runtime Environment)**
- **JVM (Java Virtual Machine)**

Although they are closely related, each has a different purpose.

Think of them like this:

```
JDK
 ├── JRE
 │     ├── JVM
 │     └── Java Libraries
 └── Development Tools
```

> **Simple Rule:**
>
> **JDK contains JRE, and JRE contains JVM.**

---

# 📚 Relationship Between JDK, JRE, and JVM

```
               JDK
      --------------------
      |                  |
 Development Tools      JRE
                           |
             -------------------------
             |                       |
            JVM            Java Libraries
```

- **JDK** is used to **develop** Java applications.
- **JRE** is used to **run** Java applications.
- **JVM** is responsible for **executing Java bytecode**.

---

# 🔹 What is JDK?

## Definition

**JDK (Java Development Kit)** is a software package that provides everything required to **develop, compile, debug, and run Java programs**.

It is mainly used by **Java developers**.

---

## Components of JDK

JDK contains:

- JRE
- Java Compiler (`javac`)
- Debugger
- JavaDoc Tool
- Jar Tool
- Development Utilities

---

## Main Functions

- Write Java programs
- Compile Java source code
- Debug applications
- Generate documentation
- Package applications

---

## Common JDK Commands

| Command | Purpose |
|---------|----------|
| `javac` | Compiles Java source code |
| `java` | Runs Java programs |
| `javadoc` | Generates documentation |
| `jar` | Creates JAR files |
| `jdb` | Java Debugger |

---

# 🔹 What is JRE?

## Definition

**JRE (Java Runtime Environment)** provides everything needed to **run Java programs**.

It is mainly used by users who only want to execute Java applications.

---

## Components of JRE

JRE contains:

- JVM
- Core Java Libraries
- Supporting Files
- Runtime Classes

---

## Main Functions

- Loads Java classes
- Provides runtime environment
- Uses JVM to execute bytecode
- Provides required libraries

---

# 🔹 What is JVM?

## Definition

**JVM (Java Virtual Machine)** is the engine that executes Java Bytecode.

It converts platform-independent Bytecode into machine code that the operating system understands.

---

## Responsibilities of JVM

- Loads Classes
- Verifies Bytecode
- Executes Bytecode
- Manages Memory
- Performs Garbage Collection
- Handles Runtime Environment

---

## Java Execution Process

```
Java Source Code (.java)
          │
          ▼
      javac Compiler
          │
          ▼
   Bytecode (.class)
          │
          ▼
         JVM
          │
          ▼
    Machine Code
          │
          ▼
      Operating System
```

---

# 🧠 Why Do We Need JVM?

Different operating systems understand different machine code.

Instead of compiling Java separately for every operating system, Java compiles only once into **Bytecode**.

The JVM on each platform converts that Bytecode into native machine code.

This is the reason Java follows:

> **Write Once, Run Anywhere (WORA)**

---

# 🔄 Relationship Between JDK, JRE, and JVM

```
Developer
    │
    ▼
Writes Java Code
    │
    ▼
JDK Compiles Code
    │
    ▼
Bytecode (.class)
    │
    ▼
JRE Provides Runtime
    │
    ▼
JVM Executes Bytecode
    │
    ▼
Program Output
```

---

# 📊 Difference Between JDK, JRE, and JVM

| Feature | JDK | JRE | JVM |
|---------|-----|-----|-----|
| Full Form | Java Development Kit | Java Runtime Environment | Java Virtual Machine |
| Purpose | Develop Java programs | Run Java programs | Execute Bytecode |
| Used By | Developers | End Users | JRE |
| Contains | JRE + Development Tools | JVM + Libraries | Runtime Engine |
| Compiler | ✅ Yes | ❌ No | ❌ No |
| Debugger | ✅ Yes | ❌ No | ❌ No |
| JVM Included | ✅ Yes | ✅ Yes | — |
| Development Tools | ✅ Yes | ❌ No | ❌ No |
| Runs Java Program | ✅ Yes | ✅ Yes | ✅ Yes |
| Compiles Code | ✅ Yes | ❌ No | ❌ No |

---

# 💡 Easy Analogy

Imagine building and watching a movie.

🎬 **JDK** = Movie Studio

- Creates the movie
- Edits the movie
- Packages the movie

🎥 **JRE** = Cinema

- Plays the movie

📽 **JVM** = Projector

- Actually displays the movie on the screen

Without the projector (JVM), the cinema (JRE) cannot show the movie.

Without the cinema (JRE), the movie studio (JDK) cannot present the movie.

---

# 📝 Summary

- **JDK** is used to develop Java applications.
- **JRE** is used to run Java applications.
- **JVM** executes Java Bytecode.
- JDK contains JRE.
- JRE contains JVM.
- JVM converts Bytecode into Machine Code.
- JVM makes Java platform independent.

---

# 🎯 Viva / Interview Questions

### 1. What is JDK?

**Answer:** JDK (Java Development Kit) is a software package used to develop, compile, debug, and run Java programs.

---

### 2. What is JRE?

**Answer:** JRE (Java Runtime Environment) provides the environment required to execute Java programs.

---

### 3. What is JVM?

**Answer:** JVM (Java Virtual Machine) executes Java bytecode and converts it into machine code.

---

### 4. Which component compiles Java code?

**Answer:** `javac` compiler in the JDK.

---

### 5. Which component executes Bytecode?

**Answer:** JVM.

---

### 6. Can a Java program run without JRE?

**Answer:** No.

---

### 7. Can you develop Java applications using only JRE?

**Answer:** No. Development requires the JDK because it includes the compiler and other tools.

---

### 8. Does JDK contain JVM?

**Answer:** Yes.

---

### 9. Which is larger: JDK or JRE?

**Answer:** JDK, because it contains both JRE and development tools.

---

### 10. Why is JVM important?

**Answer:** JVM makes Java platform independent by converting bytecode into machine code for the underlying operating system.

---

# 🧠 Practice Questions

## Basic

1. Define JDK.
2. Define JRE.
3. Define JVM.
4. Which one contains the compiler?
5. Which one executes bytecode?

---

## Intermediate

1. Explain the relationship between JDK, JRE, and JVM.
2. Draw the architecture of Java execution.
3. Differentiate JDK and JRE.
4. Explain why Java is platform independent.

---

## Challenge

1. Explain the complete execution process of a Java program from source code to output.
2. Why can Java programs run on Windows, Linux, and macOS without recompiling?

---

# 📚 MCQs

### 1. Which component contains the Java compiler?

A. JVM

B. JRE

C. JDK

D. JIT

**Answer:** C

---

### 2. Which component actually executes Java Bytecode?

A. JDK

B. JVM

C. Compiler

D. IDE

**Answer:** B

---

### 3. JRE contains:

A. Compiler

B. Debugger

C. JVM and Libraries

D. Java Source Code

**Answer:** C

---

### 4. Which command compiles Java source code?

A. `java`

B. `javac`

C. `jvm`

D. `jar`

**Answer:** B

---

### 5. Which statement is correct?

A. JVM contains JDK

B. JRE contains JDK

C. JDK contains JRE

D. JDK contains JVM only

**Answer:** C

---

# 💻 Coding Exercises

1. Install the latest JDK on your computer.
2. Verify the installation using:

```bash
java -version
```

3. Check the compiler version using:

```bash
javac -version
```

4. Write a `HelloWorld.java` program and compile it manually:

```bash
javac HelloWorld.java
java HelloWorld
```

5. Draw the Java execution process in your notebook.

---

# 💡 Memory Trick

Remember the hierarchy:

```
JDK
└── JRE
    └── JVM
```

Or simply:

> **Develop → Run → Execute**

- **JDK** → Develop
- **JRE** → Run
- **JVM** → Execute

---

# ✅ Revision Checklist

- [ ] JDK Definition
- [ ] JRE Definition
- [ ] JVM Definition
- [ ] JDK Components
- [ ] JRE Components
- [ ] JVM Responsibilities
- [ ] Java Execution Process
- [ ] JDK vs JRE vs JVM
- [ ] WORA