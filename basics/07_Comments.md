# 💬 Java Comments

## 📌 Introduction

Comments are **text notes** written inside a Java program to explain the code.

They make programs easier to:

- Read
- Understand
- Maintain
- Debug

> **Important:** Comments are **ignored by the Java compiler**. They do **not** affect the execution of the program.

---

# 🎯 Why Do We Use Comments?

Comments are useful for:

- Explaining complex logic
- Describing variables or methods
- Temporarily disabling code
- Generating documentation
- Making code easier for others to understand

---

# 📚 Types of Comments in Java

Java supports **three types of comments**:

1. Single-line Comments
2. Multi-line Comments
3. Documentation (Javadoc) Comments

---

# 1️⃣ Single-line Comment (`//`)

A single-line comment is used to write a comment on **one line only**.

### Syntax

```java
// This is a single-line comment
```

### Example

```java
public class Main {

    public static void main(String[] args) {

        // Print a welcome message
        System.out.println("Welcome to Java");

    }

}
```

### Output

```text
Welcome to Java
```

### When to Use

- Explain a single line of code.
- Add short notes.
- Temporarily disable one line of code.

Example:

```java
// System.out.println("Debugging...");
```

---

# 2️⃣ Multi-line Comment (`/* ... */`)

A multi-line comment is used when the explanation spans **multiple lines**.

### Syntax

```java
/*
This is
a multi-line
comment.
*/
```

### Example

```java
public class Main {

    public static void main(String[] args) {

        /*
        This program
        prints a message
        on the console.
        */

        System.out.println("Hello World");

    }

}
```

### Output

```text
Hello World
```

### When to Use

- Explain complex code.
- Write long descriptions.
- Temporarily comment out multiple lines of code.

Example:

```java
/*
System.out.println("One");
System.out.println("Two");
System.out.println("Three");
*/
```

---

# 3️⃣ Documentation Comment (`/** ... */`)

Documentation comments are used to create **API documentation** using the **Javadoc** tool.

They begin with:

```java
/**
```

and end with:

```java
*/
```

Every line usually starts with `*`.

---

### Syntax

```java
/**
 * Documentation comment
 */
```

---

### Example

```java
/**
 * This class prints a welcome message.
 */

public class Main {

    /**
     * Main method of the program.
     * @param args Command-line arguments
     */

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

# 🏷 Common Javadoc Tags

| Tag | Purpose |
|------|---------|
| `@author` | Author of the class |
| `@version` | Version number |
| `@param` | Describes a method parameter |
| `@return` | Describes the return value |
| `@throws` | Describes an exception thrown |
| `@deprecated` | Indicates outdated code |
| `@see` | References another class or method |

### Example

```java
/**
 * Divides two numbers.
 *
 * @param a First number
 * @param b Second number
 * @return Division result
 * @throws ArithmeticException if b is zero
 */
```

---

# 📊 Comparison of Comment Types

| Feature | Single-line | Multi-line | Documentation |
|---------|-------------|------------|---------------|
| Symbol | `//` | `/* */` | `/** */` |
| Lines | One | Multiple | Multiple |
| Used For | Short notes | Long explanations | API Documentation |
| Ignored by Compiler | ✅ | ✅ | ✅ |
| Used by Javadoc | ❌ | ❌ | ✅ |

---

# ⚠️ Common Mistakes

### ❌ Forgetting to close a multi-line comment

Wrong:

```java
/* This comment never ends
```

Correct:

```java
/* This comment ends properly */
```

---

### ❌ Nesting multi-line comments

Wrong:

```java
/*
This is a comment

/*
Another comment
*/

*/
```

Java does **not** support nested multi-line comments.

---

### ❌ Using comments instead of meaningful code

Bad:

```java
// Increment i
i++;
```

The code is already obvious. Use comments only when they add value.

---

# ✅ Best Practices

- Write comments only when necessary.
- Keep comments short and meaningful.
- Update comments if the code changes.
- Avoid commenting every single line.
- Use Javadoc for public classes and methods.

---

# 📝 Summary

- Comments improve code readability.
- Comments are ignored by the compiler.
- Java has **three types of comments**.
- Single-line comments use `//`.
- Multi-line comments use `/* ... */`.
- Documentation comments use `/** ... */`.
- Javadoc generates HTML documentation from documentation comments.

---

# 🎯 Viva / Interview Questions

### 1. What are comments in Java?

**Answer:** Comments are notes in the source code that explain the program and are ignored by the compiler.

---

### 2. How many types of comments are available in Java?

**Answer:** Three.

- Single-line
- Multi-line
- Documentation (Javadoc)

---

### 3. Which symbol starts a single-line comment?

**Answer:**

```java
//
```

---

### 4. Which comment is used by the Javadoc tool?

**Answer:** Documentation comments (`/** ... */`).

---

### 5. Can comments affect program execution?

**Answer:** No. Comments are ignored by the compiler.

---

### 6. What is the purpose of the `@param` tag?

**Answer:** It describes a method parameter in Javadoc.

---

### 7. What is the purpose of the `@return` tag?

**Answer:** It describes the value returned by a method.

---

# 🧠 Practice Questions

## Basic

1. What are comments?
2. Why are comments used?
3. List the three types of Java comments.
4. Write a single-line comment.
5. Write a multi-line comment.

---

## Intermediate

1. Differentiate between single-line and multi-line comments.
2. Explain documentation comments with an example.
3. What is Javadoc?
4. Explain the purpose of `@param` and `@return`.

---

## Challenge

1. Write a Java program using all three types of comments.
2. Create a method and document it using Javadoc tags.

---

# 📚 MCQs

### 1. Which symbol is used for a single-line comment?

A. `/* */`

B. `//`

C. `/** */`

D. `##`

**Answer:** B

---

### 2. Which comment type is used to generate documentation?

A. Single-line

B. Multi-line

C. Documentation

D. Inline

**Answer:** C

---

### 3. Which Javadoc tag describes a method parameter?

A. `@throws`

B. `@version`

C. `@param`

D. `@return`

**Answer:** C

---

### 4. Which statement is true?

A. Comments are executed by the JVM.

B. Comments are ignored by the compiler.

C. Comments increase program speed.

D. Comments create objects.

**Answer:** B

---

### 5. Which comment is best for temporarily disabling multiple lines of code?

A. `//`

B. `/* ... */`

C. `/** ... */`

D. `#`

**Answer:** B

---

# 💻 Coding Exercises

1. Write a Java program using a **single-line comment**.
2. Add a **multi-line comment** explaining your program.
3. Create a class with a **Javadoc comment**.
4. Write a method with `@param` and `@return` tags.
5. Comment out two lines of code using a multi-line comment.

---

# 💡 Memory Trick

Remember the symbols:

```text
//     → One Line

/* */ → Many Lines

/** */ → Documentation (Javadoc)
```

Think of it like this:

- **1 slash pair (`//`)** → One line
- **1 star (`/* */`)** → Many lines
- **2 stars (`/** */`)** → Professional documentation

---

# ✅ Revision Checklist

- [ ] Purpose of Comments
- [ ] Single-line Comments
- [ ] Multi-line Comments
- [ ] Documentation Comments
- [ ] Javadoc
- [ ] `@param`
- [ ] `@return`
- [ ] `@throws`
- [ ] Best Practices