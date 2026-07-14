package code.Variables;



// Program 1. Local Variable
//
// code:
/* 
public class Variable {
    public static void main(String[] args) {
        
    //local variable declared and initialized
    int age = 18;
    
    //Printing the local variable
    System.out.println("Age = " + age);
    }
}
*/




// Program 2. Local Variable scope
//
// code:
/* 
public class LocalScope {

    public static void main(String[] args) {
        int number = 100; // local variable
        System.out.println(number);
        // number exist only inside main ()
    }    
}
*/




// Program 3. Local Variable Must be Initialized
//
// code:
/* 
public class LocalInitialization {
    public static void main(String[] args) {
        
        // local variable declaration
        int marks;

        // Uncommenting will cause the compilation error
        // System.out.println(marks);

        // Initialize first
        marks = 80;

        System.out.println("Marks = " + marks);
    }
}
*/




// Program 4. Instance Variable
//
// code:
/* 
public class Student{

    // instance variables
    String name = "Meche";
    int age = 18;

    public static void main(String[] args) {

        // Creating object
        Student s1 = new Student();

        // Accessing instance variables
        System.out.println("Name : " + s1.name);
        System.out.println("Age : " + s1.age);
    }
}
*/




// Program 5. Default Values of instance Variables
//
// code:
/*
public class DefaultValues {

    // Instance variable
    int number;
    double salary;
    boolean passed;
    String name;
    
    public static void main(String[] args) {
        DefaultValues obj = new DefaultValues ();

        // Printing default values
        System.out.println("Integer : " + obj.number);
        System.out.println("Double : " + obj.salary);
        System.out.println("Boolean : " + obj.passed);
        System.out.println("String : " + obj.name);
    }
}
*/




// Program 6: Static Variable
//
// code:
/* 
public class StaticVar {

    // Static variable
    static String college = "Lincoln University";

    public static void main(String[] args) {
        
        // Accessing static variable using class name
        System.out.println("College: "+ StaticVar.college);
    }
}
*/




// Program 7: Static Variable Shared by Object
//
// code
/* 
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
        Employee e1 = new Employee("Meche");
        Employee e2 = new Employee("Sapan");

        e1.display();
        e2.display();
    }
}
*/




// Program 8: Constant Varible (static final)
//
// code:
/* 
public class ConstantDemo {

    // constant variable
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        
        System.out.println("Value of PI : " + PI);

        // PI = 5; // Error: Cannot modify a final variable
    }
}
*/




// Program 9: Declaring Multiple Variables
//
// code:
/* 
public class MultipleVariables  {

    public static void main(String[] args) {
        
        // Declaring multiple variables
        int a = 10, b = 20, c = 30;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
*/




// Program 10: Comparing Local, Instance and Static Variables
//
// code:
/*
public class VariableComparison {

    // Instance variable
    int age = 19;

    // Static variable
    static String surname = "Meche";

    public void display () {

        // local variable
        String name = "Binay";

        System.out.println(name);       // local
        System.out.println(age);        // Instance
        System.out.println(surname);    // Static
    }
    public static void main(String[] args) {
        
        VariableComparison obj = new VariableComparison();

        obj.display();
    }
}
*/




// Program 11: Accessing Static variable using Class Name
//
// code:
/* 
public class School {

    static String collegeName = "Balmiki";

    public static void main(String[] args) {
        
        // Recommended way
        System.out.println("College: " + School.collegeName);
    }
}
*/