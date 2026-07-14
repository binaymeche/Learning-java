# 📖 Java Overview

## 📌 Introduction

Java is a **high-level, object-oriented, class-based programming language** developed by **James Gosling** and his team at **Sun Microsystems**.

The Java project began in **June 1991**, and the first official version (**Java 1.0**) was released in **1995**.

Today, Java is maintained by **Oracle Corporation** and is one of the most widely used programming languages for building desktop, web, enterprise, mobile, and cloud applications.

One of Java's biggest strengths is its **Write Once, Run Anywhere (WORA)** philosophy.

---

# 🕰 History of Java

### 1991

- James Gosling started the Java project.
- The language was originally named **Oak** after an oak tree outside his office.

### Later

- Oak was renamed **Green** for a short time.

### 1995

- Officially released as **Java 1.0**
- Final name became **Java**

### 2006

- Sun Microsystems released most of Java as **Open Source** under the GNU GPL License.

### 2010

- Oracle Corporation acquired Sun Microsystems and became the owner of Java.

---

# ☕ Why Java Became Popular

Java became one of the world's most popular languages because it provides:

- Platform Independence
- Object-Oriented Programming
- Strong Security
- Automatic Memory Management
- Large Community Support
- High Performance with JIT Compiler

---

# 🚀 Main Characteristics of Java

## Object-Oriented

Everything in Java revolves around **Classes** and **Objects**.

Supports:

- Encapsulation
- Inheritance
- Polymorphism
- Abstraction

---

## Platform Independent

Java source code is compiled into **Bytecode**, not machine code.

The **Java Virtual Machine (JVM)** executes the bytecode on any operating system.

```
Source Code
     ↓
Compiler
     ↓
Bytecode
     ↓
JVM
     ↓
Operating System
```

---

## Simple

Java has:

- Easy syntax
- Automatic Garbage Collection
- Rich Standard Library

making it beginner friendly.

---

## Secure

Java provides security through:

- Bytecode Verification
- JVM Sandbox
- No direct memory manipulation
- Automatic Garbage Collection

---

## Architecture Neutral

Java bytecode runs on different processor architectures such as:

- Intel
- AMD
- ARM

without recompilation.

---

## Portable

Programs written on one operating system can run on another without modifying the source code.

---

## Robust

Java minimizes errors through:

- Strong Type Checking
- Exception Handling
- Garbage Collection
- Compile-time Checking

---

## Multithreading

Java allows multiple threads to run simultaneously.

Example:

A browser can

- load a webpage,
- play music,
- download files

all at the same time.

---

## Interpreted + Compiled

Java uses both compilation and interpretation.

1. Java source code is compiled into Bytecode.
2. JVM interprets and executes Bytecode.
3. JIT Compiler converts frequently used code into Machine Code for faster execution.

---

## High Performance

Java uses the **Just-In-Time (JIT) Compiler** to improve execution speed.

---

## Distributed

Java is ideal for distributed systems where multiple computers communicate over a network.

Examples:

- Banking Systems
- Cloud Services
- Online Shopping Platforms

---

## Dynamic

Java loads classes during runtime and supports dynamic memory allocation, making applications flexible and extensible.

---

# 💻 Hello World Program

```java
public class MyFirstJavaProgram {

    public static void main(String[] args) {

        System.out.println("Hello World");

    }

}
```

### Output

```text
Hello World
```

---

# 🧩 Understanding the Program

```java
public class MyFirstJavaProgram
```

Creates a class named **MyFirstJavaProgram**.

---

```java
public static void main(String[] args)
```

This is the **main method**, where the execution of every Java program begins.

---

```java
System.out.println("Hello World");
```

Prints the text **Hello World** to the console.

---

# 🛠 Tools Required for Java Development

To start learning Java, you only need:

- Java Development Kit (JDK)
- A Code Editor or IDE
    - VS Code
    - IntelliJ IDEA
    - Eclipse
- Terminal / Command Prompt

---

# 📌 What You'll Learn Next

After understanding Java Overview, the next topics are usually:

1. JDK, JRE and JVM
2. Installing Java
3. Setting Environment Variables
4. First Java Program
5. Java Program Structure
6. Variables
7. Data Types

---

# 📝 Summary

- Java project started in **1991**.
- Created by **James Gosling**.
- Released in **1995**.
- Originally named **Oak**.
- Owned today by **Oracle Corporation**.
- Java follows the **Write Once, Run Anywhere (WORA)** principle.
- Java is object-oriented, secure, portable, robust, and platform-independent.
- Every Java program starts execution from the **main()** method.

---

# 🎯 Viva / Interview Questions

### 1. Who invented Java?

**Answer:** James Gosling.

---

### 2. What was Java originally called?

**Answer:** Oak.

---

### 3. When was Java officially released?

**Answer:** 1995.

---

### 4. Who owns Java today?

**Answer:** Oracle Corporation.

---

### 5. What is WORA?

**Answer:** Write Once, Run Anywhere.

---

### 6. Which method is the starting point of every Java program?

**Answer:** `public static void main(String[] args)`

---

### 7. Which statement prints output in Java?

**Answer:**

```java
System.out.println();
```

---

### 8. Why is Java called both compiled and interpreted?

**Answer:** Because Java source code is compiled into bytecode, and the JVM interprets (and JIT-compiles) that bytecode during execution.

---

# 🧠 Practice Questions

## Basic

1. Who developed Java?
2. Why was Java originally called Oak?
3. Explain WORA.
4. What is bytecode?
5. What is JVM?

---

## Intermediate

1. Explain the execution process of a Java program.
2. Explain any six features of Java.
3. Why is Java considered platform independent?
4. Explain the structure of a Hello World program.

---

## Challenge

1. Draw the Java execution process from source code to output.
2. Explain why Java is both compiled and interpreted.

---

# 📚 MCQs

### 1. Java was originally named:

A. Green

B. Oak

C. Coffee

D. JVM

**Answer:** B

---

### 2. Java project started in:

A. 1989

B. 1990

C. 1991

D. 1995

**Answer:** C

---

### 3. The first public release of Java was in:

A. 1991

B. 1993

C. 1995

D. 1998

**Answer:** C

---

### 4. Every Java program starts execution from:

A. run()

B. execute()

C. start()

D. main()

**Answer:** D

---

### 5. Which statement prints text to the console?

A. `Console.print()`

B. `System.print()`

C. `System.out.println()`

D. `print()`

**Answer:** C

---

# ✍️ Coding Exercises

1. Write a Java program to print your name.
2. Write a Java program to print your college name.
3. Print three lines using three `System.out.println()` statements.
4. Modify the Hello World program to print:
   - Your name
   - Your age
   - Your favorite programming language
5. Create a class named `StudentInfo` and display your details.

---

# ✅ Revision Checklist

- [ ] History of Java
- [ ] James Gosling
- [ ] Oak → Java
- [ ] WORA
- [ ] Features of Java
- [ ] Java Execution Process
- [ ] Hello World Program
- [ ] `main()` Method
- [ ] `System.out.println()`
- [ ] Practice Questions Completed