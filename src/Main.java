// importing libraries
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
// the scanner library for taking user input.

public class Main {

    // static to allow other classes and methods to use this variable or method.

    static int randomNumber;

    // public vars for other files to use it
    // just like public class
    public static String str = "something just like this";

    // final for constant values
    static final double PI = 3.1456789;

    // userInput is making use of Scaner class , which is instantiating new instance for taking user input.
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        // local variable inside of a method.
        int number = 22;

        System.out.println(str);
        System.out.println(number);

        // toString() method to convert other data type to  // String.
        String something = Integer.toString(number);

        String newStr = something + str;

        System.out.println(newStr);

        // print is different from println , in the way that  // it does // not return a character, thus we need to put in any value.
        //  also, println returns a new line always, whereas print ,
        // prints the next character just after that. Use both of them
        // in a loop to see the reults.
        System.out.print("Your favorite number: ");

        // userInput has instantiated a hasNext method for
        // different values. Float , double , String.
        // hasNextInt checks for the user input if, the value
        // is an integer.
        // hasNext is for Strings
        if ( userInput.hasNext() ) {

            // get the value of the userinput and save it in a // variable.
            // int numberEntered = userInput.nextInt();

            String numberEntered = userInput.nextLine();

            // for String we need nextLine().

            // parseInt for other data types to convert into
            // integers .
            int numberEnteredInt = Integer.parseInt(numberEntered);

            System.out.println("Entered number is : " + numberEnteredInt);

            // looping

            int m,n;

            for (m=1, n=2; n<=numberEnteredInt + 10; m+=2, n+=2) {
                System.out.println(m + '\n' + n);
            }

        }

        int a = 1;
        int b = 2;

        addNumbers(a,b);

        checkGuess();

        // ARRAYS ....
        // We can declare arrays in these ways
        // we need to define the array datatype , i.e. it can
        // store only particular type of values , ints in this case.
        // we also need to define the length of the array, i.e. we can
        // have 10 elements in this particular array
        int[] numberArray = new int[10];

        // we can also declare arrays in this way.
        String[] stringArray = { "First", "Second", "Third" };

        // we can put in values into the array in this type.
        int[] randomArray;
        randomArray = new int[10];
        randomArray[1] = 22; // the second element would be 22.

        // we iterate the arrays using loops.
        for ( int i = 0; i < numberArray.length; i++ ) {
            numberArray[i] = i; // ith element of the array would be i.
        }

        // toString method is used to print the complete array.
        System.out.println("Array: " + Arrays.toString(numberArray));

        // MultiDimentional Arrays.
        // SO we define the multi array using the 2 brackets, to show
        // its dimentions.
        String[][] multiArray = new String[10][10];

        // we run a double loop, to look inside the nested elements.
        // the first for loop is for the first bracket , i.e. first
        // element, and similarly second loop for the second element.
        // the first for loop is the row, and the second loop is the
        // column. So the array for 3 elements looks like this.
        // [[0,0],[0,1], [0,2], // i is the for the row
        //  [1,0],[1,1], [1,2], // j is for the column
        //  [2,0],[2,1], [2,2]]
        // or [[0,0],[0,1],[0,2],[1,0],[1,1],[1,2],[2,0],[2,1],[2,2]]
        // thus i = 0 represents the first array, i.e. [0,0]
        // then i.length gives 2 , which means j loops over this .
        // j = 0 gives 0 and j = 1 gives 0.
        for ( int i = 0; i < multiArray.length; i++ ) {
            for ( int j = 0; j < multiArray[i].length; j++ ) {
                multiArray[i][j] = i + " " + j;
            }
        }

        for ( int i = 0; i < multiArray.length; i++ ) {
            for ( int j = 0; j < multiArray[i].length; j++ ) {
                System.out.print("| " + multiArray[i][j] + " |");
            } // print to print all in one line
            System.out.println(""); // println to give a linebreak.

            // Similarly we can use Arrays.fill method to fill a
            // particular number in the array elements.
            // and use Arrays.sort for sorting the elements.
        }

        // we have enhanced for loops for iterating the arrays.
        // basically we define a variable to hold the values of numberArray
        // and then print them out . Much like python for in loop
        for ( int rows: numberArray ) {
            System.out.println(rows);
        }
        System.out.println("");

        // for multidim array
        // similarly here , since the first dimention is also an array
        // we define a var to hold an array, like [0,0], [0,1] etc.
        // then we define the next var to hold the values of inside the array
        // since the elemetns are strings and not arrays.
        for ( String[] row: multiArray) {
            for ( String col: row ) {
                System.out.print("| " + col + " |");
            }
            System.out.println("");
        }

        // copying an array
        // we tell the method , how many elements we want to copy from the
        // beginning of the array.
        int[] newCopy = Arrays.copyOf(numberArray, 5);

        // we can also specify the range of the array to copy
        int[] newCopyRange = Arrays.copyOfRange(numberArray, 4,8);

        for ( int row : newCopy ) {
            System.out.print(row);
        }

        System.out.println(""); // for a new line.

        for ( int row : newCopyRange ) {
            System.out.print(row);
        }
    }

    public static void addNumbers(int a, int b) throws ArithmeticException {

        // This is used to catch exceptions. Throws IOException means , that
        // this function will always look for IOException and throw the error, // if caught.

        try {
            System.out.println(a+b);
        }

        // The first catch is used to make the most obvious exception. Which is
        // most likely to occur .
        catch ( ArithmeticException e ) {
            System.out.println(e.toString());
        }

        // The second catch is the least likely exception. We can put multiple // exceptions using the pipe operator ( OR Operator )
        // catch ( IOException e ) {
        //   System.out.println("Error Occured");
        // }

        // We can ignore the catch cases, ie. if we find the error ,but dont want
        // to do anything.
        // catch ( IOException e ) {}

        // Finally this catch can be used , when we have no idea what error
        // occured.This is the general exception.
        catch (Exception e) {
            System.out.println("Unknown Error Occured");
        }

        // this block executes no matter exception was catched or not.
        finally {
            System.out.println("This block always executes, whether or not any exception is caught or not. This block is used to close the database connections or stuff like that.");
        }

    }

    public static int getRandomNum() {

        // to get a random number we use the Math
        // library, and then coerce it to integer
        // to get an integer value since it returns
        // a double. Then we multiply by the number + 1 upto
        // which we want random numbers .
        // Default it produces random numbers from 0 to 0.9999
        randomNumber = (int) (Math.random() * 3);

        return randomNumber;

    }

    public static void checkGuess() {

        boolean guess = false;

        while ( guess != true ) {

            System.out.print("Guess a number between 0 and 2: ");

            // this is done solely because , in the
            // above code , I was taking String inputs.

            String userNumber = userInput.nextLine();

            int userInteger = Integer.parseInt(userNumber);

            int correctGuess = getRandomNum();

            if ( userInteger == correctGuess ) {
                System.out.println(correctGuess);
                System.out.println("You guessed it ");
                guess = true;
            }
        }

    }
}