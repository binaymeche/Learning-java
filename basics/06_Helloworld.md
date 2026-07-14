# 👋 Your First Java Program – Hello World

## 📌 Introduction

The **"Hello World"** program is traditionally the first program that every programmer writes when learning a new programming language.

It helps you understand:

- How to write Java code
- How to save a Java file
- How to compile a Java program
- How to run a Java program
- Basic structure of a Java program

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

# 📝 How to Write and Run a Java Program

### Step 1: Open a Code Editor

You can use:

- VS Code ⭐ (Recommended)
- IntelliJ IDEA
- Eclipse
- Notepad (for learning)

---

### Step 2: Write the Code

Copy the Hello World program into a new file.

---

### Step 3: Save the File

Save the file with the following name:

```text
MyFirstJavaProgram.java
```

> **Important:** The file name **must** match the public class name.

---

### Step 4: Open Terminal / Command Prompt

Navigate to the folder where your Java file is saved.

Example:

```bash
cd C:\JavaPrograms
```

---

### Step 5: Compile the Program

Use the Java compiler:

```bash
javac MyFirstJavaProgram.java
```

If there are no errors, a new file will be created:

```text
MyFirstJavaProgram.class
```

This `.class` file contains **Java Bytecode**.

---

### Step 6: Run the Program

Execute the compiled program using:

```bash
java MyFirstJavaProgram
```

### Output

```text
Hello World
```

> ❌ **Do not** write `.java` or `.class` while running the program.

Correct:

```bash
java MyFirstJavaProgram
```

Wrong:

```bash
java MyFirstJavaProgram.java
```

---

# 🔄 Java Program Execution Process

```text
MyFirstJavaProgram.java
           │
           ▼
        javac
           │
           ▼
MyFirstJavaProgram.class
           │
           ▼
          JVM
           │
           ▼
   Machine Code
           │
           ▼
     Console Output
```

---

# 🧩 Understanding the Program

## 1️⃣ Class Declaration

```java
public class MyFirstJavaProgram
```

This creates a **class** named `MyFirstJavaProgram`.

### Explanation

- `public` → Accessible from anywhere.
- `class` → Defines a class.
- `MyFirstJavaProgram` → Name of the class.

> The filename must be **MyFirstJavaProgram.java** because the class is public.

---

## 2️⃣ Main Method

```java
public static void main(String[] args)
```

This is the **entry point** of every Java application.

The JVM starts executing the program from this method.

---

### Understanding Each Keyword

### `public`

Makes the method accessible to the JVM.

---

### `static`

Allows the JVM to call the method **without creating an object**.

---

### `void`

Indicates that the method **does not return any value**.

---

### `main`

The special method name recognized by the JVM as the starting point.

---

### `String[] args`

Stores command-line arguments passed when running the program.

Example:

```bash
java MyFirstJavaProgram Hello Java
```

Then:

```java
args[0] → "Hello"
args[1] → "Java"
```

---

## 3️⃣ Printing Output

```java
System.out.println("Hello World");
```

This statement prints text to the console.

### Breakdown

| Part | Meaning |
|------|---------|
| `System` | Java's built-in class |
| `out` | Standard output stream (console) |
| `println()` | Prints text and moves to the next line |

---

### Difference Between `print()` and `println()`

```java
System.out.print("Hello");
System.out.print("World");
```

Output:

```text
HelloWorld
```

---

```java
System.out.println("Hello");
System.out.println("World");
```

Output:

```text
Hello
World
```

---

# 💬 Comments in Java

Comments help explain the code and are ignored by the compiler.

### Single-line Comment

```java
// This is a comment
```

---

### Multi-line Comment

```java
/*
This is
a multi-line
comment.
*/
```

---

# ⚠️ Common Beginner Mistakes

### ❌ File name doesn't match class name

```java
public class Hello
```

Saved as:

```text
Program.java
```

This causes a compilation error.

---

### ❌ Missing Semicolon

```java
System.out.println("Hello World")
```

Correct:

```java
System.out.println("Hello World");
```

---

### ❌ Incorrect Capitalization

```java
system.out.println();
```

Correct:

```java
System.out.println();
```

Java is **case-sensitive**.

---

### ❌ Running the `.java` file directly

Wrong:

```bash
java Hello.java
```

Correct:

```bash
java Hello
```

---

# 📝 Summary

- Every Java program starts from the `main()` method.
- The filename must match the public class name.
- `javac` compiles `.java` files into `.class` files.
- The JVM executes the `.class` file.
- `System.out.println()` prints output to the console.
- Java is case-sensitive.

---

# 🎯 Viva / Interview Questions

### 1. What is the first Java program called?

**Answer:** Hello World Program.

---

### 2. Which method is the entry point of a Java program?

**Answer:** `public static void main(String[] args)`

---

### 3. Why is the `main()` method declared `static`?

**Answer:** So the JVM can call it without creating an object of the class.

---

### 4. What is the purpose of `void` in the `main()` method?

**Answer:** It indicates that the method does not return any value.

---

### 5. What does `System.out.println()` do?

**Answer:** It prints the specified text to the console and moves the cursor to the next line.

---

### 6. What happens after compiling a Java file?

**Answer:** A `.class` file containing bytecode is generated.

---

### 7. Which command compiles a Java program?

**Answer:**

```bash
javac FileName.java
```

---

### 8. Which command runs a Java program?

**Answer:**

```bash
java FileName
```

---

# 🧠 Practice Questions

## Basic

1. Write a Java program to print `"Welcome to Java"`.
2. What is the purpose of the `main()` method?
3. Explain the role of `System.out.println()`.
4. Differentiate `print()` and `println()`.
5. Why should the filename match the public class name?

---

## Intermediate

1. Explain the execution process of a Java program.
2. Explain each keyword in `public static void main(String[] args)`.
3. What are command-line arguments? Give an example.

---

## Challenge

1. Write a program that prints your:
   - Name
   - Age
   - College
   - Favorite Programming Language

2. Modify the Hello World program to print each message on a separate line.

---

# 📚 MCQs

### 1. Which method is the starting point of every Java program?

A. `start()`

B. `run()`

C. `main()`

D. `execute()`

**Answer:** C

---

### 2. Which command compiles a Java source file?

A. `java`

B. `javac`

C. `compile`

D. `run`

**Answer:** B

---

### 3. What is the extension of a compiled Java file?

A. `.java`

B. `.exe`

C. `.class`

D. `.jar`

**Answer:** C

---

### 4. Which statement prints text and moves to a new line?

A. `System.out.print()`

B. `System.out.println()`

C. `print()`

D. `println()`

**Answer:** B

---

### 5. Java is:

A. Case-insensitive

B. Case-sensitive

C. Both

D. None

**Answer:** B

---

# 💻 Coding Exercises

1. Print your full name.
2. Print your college name.
3. Print your address on three separate lines.
4. Use both `print()` and `println()` and compare their outputs.
5. Add both single-line and multi-line comments to your program.
6. Accept command-line arguments and print them using `args`.

---

# 💡 Memory Trick

Remember the Java execution flow:

```text
Write → Save → Compile → Run
```

Or:

```text
.java
   ↓
javac
   ↓
.class
   ↓
JVM
   ↓
Output
```

---

# ✅ Revision Checklist

- [ ] Hello World Program
- [ ] Class Declaration
- [ ] `main()` Method
- [ ] `public`
- [ ] `static`
- [ ] `void`
- [ ] `String[] args`
- [ ] `System.out.println()`
- [ ] `print()` vs `println()`
- [ ] Comments
- [ ] Compilation (`javac`)
- [ ] Execution (`java`)