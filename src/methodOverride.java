public class methodOverride {

    public static void main(String args[]){

        CSStudent student = new CSStudent();

        student.show();
        student.display();

    }

}

class StudentMain {

    private int StudentId = 10;
    public String name = "Something";

    public void show() {

        System.out.println(this.StudentId);

    }

    public String returnName() {

        return this.name;

    }

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
        System.out.println(returnName());

    }

}
