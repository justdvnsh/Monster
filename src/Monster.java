// importing Arrays,
import java.util.Arrays;

public class Monster {

    static char[][] battleBoard = new char[10][10];

    public static void drawBattleBoard(){

        // using a for loop to to draw battleboard.
        for ( char[] row: battleBoard ) {

            // Filling the arrays with * , to draw the battleboard.
            // Filling the first dimention with [*,*]. [[*,*], [*,*], [*,*]]
            Arrays.fill(row, '*');
        }
    }

    public static void redrawBoard(){

        int k = 1;
        while(k <= 50) { System.out.print('-'); k++; }
        System.out.println();

        // looping for first dimention
        for ( int i = 0; i < battleBoard.length; i++ ) {

            // looping for second dimention.
            for ( int j = 0; j < battleBoard[i].length; j++ ) {
                System.out.print("| " + battleBoard[i][j] + " |");
            }

            System.out.println("");

        }

    }

    // to declare a constant.
    // A public field ( class variables are
    // called fields ) .
    public final String LOVESTONE = "Here lies a beautiful baby.";

    // private accessModifier is used to declare private
    // fields , which can be used only inside of the class
    // and not used by other classes , that means this the
    // methods inside of this main class can use these vars/
    // fields , but not classes out of this file.
    private int health = 100;
    private int attack = 20;
    private int movement = 2;
    private boolean alive = true;

    public String name = "Vidushe";
    public char nameChar1 = 'B';
    public int xPosition = 0;
    public int yPosition = 0;

    // static refers to a method or variable which can be
    // accessed even if the object is not instantiated of the
    // class, to which it belongs.
    public static int numOfMonsters = 0;

    // we need to define several methods , since, the outer
    // classes cannot access these private vars , so we need
    // several methods to return these values.
    public int getAttack(){
        return attack;
    }

    public int getMovement(){
        return movement;
    }

    public int getHealth(){
        return health;
    }

    public boolean getAlive(){
        return alive;
    }

    public void setHealth( int decreaseHealth ) {
        health = health - decreaseHealth;
        if ( health < 0 ) {
            alive = false;
        }
    }

    // This is called function/method overloading , since
    // one setHealth is already defined , we defined another
    // method of the same name, but with different attributes
    // We can define as many methods with the same name as we
    // want , to handle different attributes (arguments
    // of different data types )
    public void setHealth( double decreaseHealth ) {
        int intDecreaseHealth = ( int ) decreaseHealth;
        health = health - intDecreaseHealth;
        if ( health < 0 ) {
            alive = false;
        }
    }

    public static int findIndex(Monster[] monster, String name) {

        // Looping over the array.
        if ( monster == null ) {
            return -1;
        }

        int length = monster.length;
        int i = 0;

        while( i < length ){

            if ( monster[i].name == name ) {
                return i;
            } else {
                i++;
            }

        }
        return -1;
    } // ENDOF findIndex.

    static int moveMonster(Monster[] monster, int index) {
        
    }

    // NOw COMES THE CONSTRUCTOR.
    // this is the first function to be called whenever , a
    // new object based off of this class is created.
    // It needs to have the same name as the Monster public
    // class. And the constructors cannot have any return
    // type.
    public Monster(int health, int attack, int movement, String name){

        // this is used to reference the object currently
        // working with. SO this is pointing to the Monster class
        // fields. Similarly, if a new object is created based
        // off of this class , then the this would point to
        // that object.
        this.health = health;
        this.attack = attack;
        this.movement = movement;
        this.name = name;

        // this is done to find the max space , where the
        // monster could roam. X and Y Positions.
        int maxXBoardSpace = battleBoard.length - 1;
        int maxYBoardSpace = battleBoard[1].length - 1;

        int randNumX, randNumY;

        // we want to generate a monster every time.
        do {

            randNumX = ( int ) (Math.random() * maxXBoardSpace);
            randNumY = ( int ) (Math.random() * maxYBoardSpace);

        } while( battleBoard[randNumX][randNumY] != '*');

        this.xPosition = randNumX;
        this.yPosition = randNumY;

        this.nameChar1 = this.name.charAt(0);

        battleBoard[this.yPosition][this.xPosition] = this.nameChar1;

        numOfMonsters++;
    }

    // we overloaded the constructor here , to handle none
    // arguements passed . By default , if we do not create
    // any constructor , this empty constructor is created
    // default by the interpreter.
    public Monster() {}

    public static void main(String[] args) {

        // creating a new object based on that class
        // Monster Vidushe = new Monster();

        // The reason we can print out the private field , is
        //  because this Monster function is in the same class
        // If we try to access it by any other class , we would
        // need to use the helper methods.
        // System.out.println(Vidushe.attack);

        Monster.drawBattleBoard();

        char[][] tempBattleBoard = new char[10][10];

        // ObjectName[] ArrayName = new ObjectName[4];

        // we define the object data type, if we want to store the arrays of objects.
        // Since the Monster is a class, but we want to have an array to hold many monsters
        // so we need to instantiate an object of it for array.
        Monster[] Monsters = new Monster[4];

        Monsters[0] = new Monster(500, 20, 1, "Vidushe");
        Monsters[1] = new Monster(300, 40, 2, "Momo");
        Monsters[2] = new Monster(100, 20, 1, "Charu");
        Monsters[3] = new Monster(200, 20, 1, "Baby");

        Monster.redrawBoard();

        // System.out.println(Arrays.toString(Monsters));
        // moving the monsters.
        // looping over the baby monsters we have
        for ( Monster m: Monsters ) {

            // checking if the Monster is alive
            if ( m.getAlive() ) {

                // finding the index of the monster to move.
                int monsterIndex = findIndex(Monsters, m.name);
                // System.out.println("MOnster:" + m.name + " Index" + monsterIndex);
                m.moveMonster(Monsters, monsterIndex);
            }
        }
    }
}