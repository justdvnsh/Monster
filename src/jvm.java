import java.lang.reflect.Field;
import java.lang.reflect.Method;

// JVM is Java virtual machine , a part of the JRE , java runtime environment. Responsible for
// executing the main() function. // each time a program is compiled , a .class file is compiled
// off of the main .java file, which generates the bytecode for the computer to understand .
// Steps ---
// JVM first creates a .class file. Then when running , class loader reads the .class file, loads
// it and reads it. After reading it , the file generates the binary data and saves it in the
// method area. Then , it loads it , and after loading it, JVM creates an object of type Class, which
// is predefined in the java.lang package. and represent this file in the heap memory. This class
// object tells the programmer the class level info , like methods , fields , parent class etc.

public class jvm {

    public static void main(String args[]) {
        Student s1 = new Student();

        Class c1 = s1.getClass(); // gets the class object , which was created the JVM, when this code
        // compiles.

        System.out.println(c1.getName()); // gets the name of the class .

        Method m1[] = c1.getDeclaredMethods(); // for getting all the methods in the class

        for ( Method m: m1 ) {
            System.out.print(m.getName());
        }

        System.out.println();

        Field f1[] = c1.getDeclaredFields(); // getting the fields.

        for ( Field f: f1 ) {
            System.out.print(f.getName());
        }
    }

}


// Just a sample class . Nothing special
class Student {
    private String name;
    private int roll_no;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no( int roll_no) {
        this.roll_no = roll_no;
    }
}

// Then Linking happens . When the main function runs , linking happens. Here the JVM performs
// verification - checks the correctness of the program. Then Preparation happens - JVM allocates
// memory for all the vars and initializing the memory to default values. And finally but optional ,
// Resolution happens - where it checks , if any referenced identity is present , it changes it with
// original value. Then initialization happens , where the code is executed from top to bottom.
