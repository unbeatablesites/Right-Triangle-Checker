import java.util.Scanner;

public class App {


    public static void main(String[] args) {

        logic();

    }

    static void logic(){

        System.out.println("Enter three integers:");

        Scanner side1 = new Scanner(System.in);
        Scanner side2 = new Scanner(System.in);
        Scanner side3 = new Scanner(System.in);

        System.out.print("Side 1: ");
        int int1 = side1.nextInt();

        System.out.print("Side 2: ");
        int int2 = side2.nextInt();

        while (int1 > int2) {
            System.out.println(int2 + " is smaller than " + int1 + ".  Try again.");
            System.out.print("Side 2: ");
            int2 = side2.nextInt();

        }

        System.out.print("Side 3 :");
        int int3 = side3.nextInt();

        while (int2 > int3) {
            System.out.println(int3 + " is smaller than " + int2 + ".  Try again.");
            System.out.print("Side 3: ");
            int3 = side3.nextInt();

        }

        System.out.println("Your three sides are "+int1+" "+int2+" "+ int3+"\n");

    }

}
