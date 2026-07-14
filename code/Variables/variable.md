# Java Variable Programs

---

# Program 1: Local Variable

```java
public class LocalVariableDemo {

    public static void main(String[] args) {

        // Local variable declared and initialized
        int age = 19;

        // Printing local variable
        System.out.println("Age = " + age);

    }

}
```

### Output

```
Age = 19
```

---

# Program 2: Local Variable Scope

```java
public class LocalScope {

    public static void main(String[] args) {

        int number = 100;   // Local variable

        System.out.println(number);

        // number exists only inside main()

    }

}
```

---

# Program 3: Local Variable Must Be Initialized

```java
public class LocalInitialization {

    public static void main(String[] args) {

        // Local variable declaration
        int marks;

        // Uncommenting the line below will cause a compilation error
        // System.out.println(marks);

        // Initialize first
        marks = 80;

        System.out.println("Marks = " + marks);

    }

}
```

---

# Program 4: Instance Variable

```java
public class Student {

    // Instance variables
    String name = "Binay";
    int age = 19;

    public static void main(String[] args) {

        // Creating object
        Student s1 = new Student();

        // Accessing instance variables
        System.out.println("Name : " + s1.name);
        System.out.println("Age  : " + s1.age);

    }

}
```

### Output

```
Name : Binay
Age  : 19
```

---

# Program 5: Default Values of Instance Variables

```java
public class DefaultValues {

    // Instance variables
    int number;
    double salary;
    boolean passed;
    String name;

    public static void main(String[] args) {

        DefaultValues obj = new DefaultValues();

        // Printing default values
        System.out.println("Integer : " + obj.number);
        System.out.println("Double  : " + obj.salary);
        System.out.println("Boolean : " + obj.passed);
        System.out.println("String  : " + obj.name);

    }

}
```

### Output

```
Integer : 0
Double  : 0.0
Boolean : false
String  : null
```

---

# Program 6: Static Variable

```java
public class StaticVariableDemo {

    // Static variable
    static String college = "Lincoln University";

    public static void main(String[] args) {

        // Accessing static variable using class name
        System.out.println(StaticVariableDemo.college);

    }

}
```

### Output

```
Lincoln University
```

---

# Program 7: Static Variable Shared by Objects

```java
public class Employee {

    // Static variable shared by all objects
    static String company = "OpenAI";

    // Instance variable
    String name;

    Employee(String n) {
        name = n;
    }

    void display() {

        System.out.println(name + " works at " + company);

    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Binay");
        Employee e2 = new Employee("Alex");

        e1.display();
        e2.display();

    }

}
```

### Output

```
Binay works at OpenAI
Alex works at OpenAI
```

---

# Program 8: Constant Variable (static final)

```java
public class ConstantDemo {

    // Constant variable
    public static final double PI = 3.14159;

    public static void main(String[] args) {

        System.out.println("Value of PI = " + PI);

        // PI = 5; // Error: Cannot modify a final variable

    }

}
```

---

# Program 9: Declaring Multiple Variables

```java
public class MultipleVariables {

    public static void main(String[] args) {

        // Declaring multiple variables
        int a = 10, b = 20, c = 30;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

}
```

---

# Program 10: Different Data Types

```java
public class VariableTypes {

    public static void main(String[] args) {

        // Integer variable
        int age = 19;

        // Decimal number
        double cgpa = 3.75;

        // Character
        char grade = 'A';

        // Boolean
        boolean passed = true;

        // String
        String name = "Binay";

        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("CGPA   : " + cgpa);
        System.out.println("Grade  : " + grade);
        System.out.println("Passed : " + passed);

    }

}
```

---

# Program 11: Comparing Local, Instance and Static Variables

```java
public class VariableComparison {

    // Instance variable
    int age = 19;

    // Static variable
    static String college = "Lincoln";

    public void display() {

        // Local variable
        String name = "Binay";

        System.out.println(name);      // Local
        System.out.println(age);       // Instance
        System.out.println(college);   // Static

    }

    public static void main(String[] args) {

        VariableComparison obj = new VariableComparison();

        obj.display();

    }

}
```

### Output

```
Binay
19
Lincoln
```

---

# Program 12: Accessing Static Variable Using Class Name

```java
public class School {

    static String schoolName = "ABC School";

    public static void main(String[] args) {

        // Recommended way
        System.out.println(School.schoolName);

    }

}
```

---

# Summary

| Program | Concept Covered |
|---------|------------------|
| Program 1 | Local Variable |
| Program 2 | Local Variable Scope |
| Program 3 | Initialization Rule |
| Program 4 | Instance Variable |
| Program 5 | Default Values |
| Program 6 | Static Variable |
| Program 7 | Static Variable Sharing |
| Program 8 | Constant (`static final`) |
| Program 9 | Multiple Variable Declaration |
| Program 10 | Variables with Different Data Types |
| Program 11 | Local vs Instance vs Static |
| Program 12 | Access Static Variable |