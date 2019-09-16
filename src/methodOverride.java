public class methodOverride {

    public static void main(String args[]){

//        CSStudent student = new CSStudent();

        // if we want to call all the methods and vars in parent class , but also want to print the
        // overrided methods ( if any ), we print the smae in the following way.
        StudentMain student = new CSStudent();

        student.show();
        //student.display(); // this would not work, since this method is not present in superclass.

    }

}

class StudentMain {

    private int StudentId = 10;
    public String name = "Something";

    public void show() {

        System.out.println(this.StudentId);

    }

//    public String returnName() {
//
//        return this.name;
//
//    }

}

class CSStudent  extends StudentMain {

    private int StudentId = 20;
    public String name = "Just Like this.";

    @Override
    public void show() {

        System.out.println(this.StudentId);

    }

    public void display() {

        System.out.println(this.name);
        System.out.println(super.name);

    }

}
