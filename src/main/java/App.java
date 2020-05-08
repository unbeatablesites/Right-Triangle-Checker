import java.util.Scanner;

public class App {


    public static void main(String[] args) {

        logic();

    }

    static void logic(){

        System.out.println("Enter three integers:\n");

        Scanner side1 = new Scanner(System.in);
        Scanner side2 = new Scanner(System.in);
        Scanner side3 = new Scanner(System.in);

        System.out.print("Side 1:");
        int int1 = side1.nextInt();

        System.out.print("Side 2:");
        int int2 = side2.nextInt();

        while (int1 > int2) {
            System.out.println(int2 + " is smaller than " + int1 + ".  Try again.\n");
            System.out.println("Side 2");
            int2 = side2.nextInt();

        }

    }

}
