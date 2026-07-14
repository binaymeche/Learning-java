# Java Variables

## What is a Java Variable?

A **variable** is a named memory location used to store data that can be changed during program execution.

Each variable in Java has:
- A **name**
- A **data type**
- A **value**

The data type determines:
- Memory size
- Range of values
- Operations that can be performed

---

# Variable Declaration & Initialization

Before using a variable, it must be declared.

## Syntax

```java
dataType variableName;
```

Example:

```java
int age;
```

To initialize a variable:

```java
int age = 18;
```

You can also declare multiple variables:

```java
int a, b, c;
int x = 10, y = 20;
```

---

## Examples

```java
int a, b, c;
int a = 10, b = 10;

byte B = 22;

double pi = 3.14159;

char letter = 'A';
```

---

# Types of Variables in Java

Java has **3 types of variables**:

1. Local Variables
2. Instance Variables
3. Static (Class) Variables

---

# 1. Local Variables

Local variables are declared **inside methods, constructors, or blocks**.

## Characteristics

- Declared inside methods/constructors/blocks.
- Created when the method starts.
- Destroyed when the method ends.
- Stored in **Stack Memory**.
- Accessible only inside the method/block.
- Cannot use access modifiers (`public`, `private`, etc.).
- No default value.
- Must be initialized before use.

---

## Example

```java
public class Test {

    public void pupAge() {
        int age = 0;

        age = age + 7;

        System.out.println("Puppy age is: " + age);
    }

    public static void main(String[] args) {

        Test test = new Test();
        test.pupAge();

    }
}
```

### Output

```
Puppy age is: 7
```

---

## Incorrect Example

```java
public class Test {

    public void pupAge() {

        int age;

        age = age + 7;

        System.out.println(age);

    }

}
```

### Compilation Error

```
Variable age might not have been initialized
```

---

# 2. Instance Variables

Instance variables are declared **inside a class but outside methods, constructors, and blocks.**

Each object gets its **own copy** of an instance variable.

---

## Characteristics

- Declared inside a class.
- Outside all methods.
- Stored in **Heap Memory**.
- Created when an object is created using `new`.
- Destroyed when the object is destroyed.
- Can use access modifiers.
- Accessible by all methods of the class.
- Receive default values automatically.

Default values:

| Data Type | Default Value |
|-----------|---------------|
| int | 0 |
| double | 0.0 |
| boolean | false |
| Object | null |

---

## Example

```java
public class Employee {

    public String name;

    private double salary;

    public Employee(String empName) {
        name = empName;
    }

    public void setSalary(double empSalary) {
        salary = empSalary;
    }

    public void printEmp() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        Employee emp = new Employee("Ransika");

        emp.setSalary(1000);

        emp.printEmp();

    }
}
```

### Output

```
Name: Ransika
Salary: 1000.0
```

---

# 3. Static (Class) Variables

Static variables belong to the **class**, not the object.

Only **one copy** exists regardless of how many objects are created.

---

## Characteristics

- Declared using the `static` keyword.
- Shared among all objects.
- Stored in Static Memory.
- Created when the program starts.
- Destroyed when the program ends.
- Can be accessed using:

```java
ClassName.variableName
```

- Often used for constants.

---

## Example

```java
public class Employee {

    private static double salary;

    public static final String DEPARTMENT = "Development";

    public static void main(String[] args) {

        salary = 1000;

        System.out.println(DEPARTMENT + " average salary: " + salary);

    }
}
```

### Output

```
Development average salary: 1000
```

---

# Accessing Variables

### Local Variable

```java
int age = 20;

System.out.println(age);
```

---

### Instance Variable

```java
Employee emp = new Employee();

System.out.println(emp.name);
```

---

### Static Variable

```java
System.out.println(Employee.DEPARTMENT);
```

---

# Local vs Instance vs Static Variables

| Feature | Local | Instance | Static |
|----------|--------|----------|---------|
| Declared Inside | Method | Class | Class |
| Memory | Stack | Heap | Static Memory |
| Created | Method call | Object creation | Program start |
| Destroyed | Method ends | Object destroyed | Program ends |
| Default Value | ❌ No | ✅ Yes | ✅ Yes |
| Shared | ❌ No | ❌ No | ✅ Yes |
| Access Modifier Allowed | ❌ No | ✅ Yes | ✅ Yes |

---

# Important Notes

### Local Variables

- Must be initialized before use.
- Exist only inside their method.
- Stored in Stack Memory.

---

### Instance Variables

- Belong to objects.
- Every object has its own copy.
- Stored in Heap Memory.
- Have default values.

---

### Static Variables

- Belong to the class.
- Shared by all objects.
- Usually used for constants.
- Access using:

```java
ClassName.variableName
```

Example:

```java
Math.PI
Employee.DEPARTMENT
```

---

# Memory Representation

```
                Java Memory

        ┌──────────────────────┐
        │      Stack Memory    │
        │----------------------│
        │ Local Variables      │
        │ Method Calls         │
        └──────────────────────┘

                 │

        ┌──────────────────────┐
        │      Heap Memory     │
        │----------------------│
        │ Objects              │
        │ Instance Variables   │
        └──────────────────────┘

                 │

        ┌──────────────────────┐
        │    Static Memory     │
        │----------------------│
        │ Static Variables     │
        │ Constants            │
        └──────────────────────┘
```

---

# Exam Tips ⭐

### Local Variable

- Inside method
- Stack memory
- No default value
- Must initialize

---

### Instance Variable

- Inside class
- Outside method
- Heap memory
- One copy per object
- Default values available

---

### Static Variable

- Declared using `static`
- One copy for entire class
- Shared by all objects
- Access using class name

---

# Quick Revision

- Variable = Named memory location.
- Declare before use.
- Initialize local variables before using them.
- Local → Stack Memory.
- Instance → Heap Memory.
- Static → Static Memory.
- Static variables are shared.
- Instance variables belong to objects.
- Local variables exist only inside methods.