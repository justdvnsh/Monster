public class abstractClass {

    // abstract classses are the classes which cannot be instantiated.

    public static void main(String args[]){

        CSStudentAbstract student = new CSStudentAbstract();
        student.show();
        student.display();

    }

}

abstract class StudentMainAbstract {

    private int StudentId = 10;
    public String name = "Something";

    abstract void show();

}

class CSStudentAbstract  extends StudentMainAbstract {

    private int StudentId = 20;
    public String name = "Just Like this.";

//    @Override
    public void show() {

        System.out.println(this.StudentId);

    }

    public void display() {

        System.out.println(this.name);
        System.out.println(super.name);

    }

}
