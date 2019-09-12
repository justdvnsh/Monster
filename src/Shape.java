import java.util.Scanner;

public class Shape {

    static Scanner userInput = new Scanner(System.in);
    public static void main(String args[]) {

        int number = userInput.nextInt();

        double numberDouble = (double) number;

        Numbers num = new Numbers();

        boolean isSquare = num.getSquare(numberDouble);
        boolean isTriangular = num.getTriangular(numberDouble);

        if ( isSquare & isTriangular ) {
            System.out.println(" The number is square and triangular. ");
        } else if ( isTriangular & !isSquare) {
            System.out.println(" The number is triangular only. ");
        } else if ( isSquare & !isTriangular ) {
            System.out.println(" The number is square only. ");
        } else {
            System.out.println(" The number is neither triangular nor square. ");
        }

    }   
}

class Numbers {

    public boolean getSquare(double number) {
        
        // square numbers are those which are complete multiples of themselves
        // eg. 4x4 = 16, so 16 is sqaure number. Perfect square

        return ( Math.sqrt( number ) == (int) Math.sqrt( number ) );

    }

    public boolean getTriangular(double number) {

        // triagnular numbers are those , which can be calculated as
        // n = m(m+1)/2 , where m is the position of the element.
        // so if we want to find the 3rd triangular number , it will be
        // 3(3+1)/2 = 6.  

        System.out.println(" Before the method-  " + number);

        double sqr = 8*number + 1;

        System.out.println(" After the method- " + number);

        return ( this.getSquare(sqr) );

    }

}