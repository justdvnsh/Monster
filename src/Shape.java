import java.util.Scanner;

public class Shape {

    Scanner userInput = new Scanner(System.in);
    public static void main(String args[]) {

    }   
}

public class Numbers {

    int number;

    public Numbers(int number) {
        this.number = number;
    }

    public boolean getSquare() {
        
        // square numbers are those which are complete multiples of themselves
        // eg. 4x4 = 16, so 16 is sqaure number. Perfect square

        double sqrt = Math.sqrt(number);

        return (( srqt - Math.floor(sqrt) ) == 0)

    }

    public boolean getTriangular() {

        // triagnular numbers are those , which can be calculated as
        // n = m(m+1)/2 , where m is the position of the element.
        // so if we want to find the 3rd triangular number , it will be
        // 3(3+1)/2 = 6.  

        double sqrt = 8*number - 1;
    }

}