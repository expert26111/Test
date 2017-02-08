package testinghomework;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        int x, y, z;

        Scanner in = new Scanner(System.in);

        x = enterNumber(in);
        y = enterNumber(in);
        z = enterNumber(in);
        printTriagleType(x, y, z);

    }
    
    private static void printTriagleType(int x, int y, int z) {
        System.out.println("The x, y and z are: "+x+" "+y+" "+z);
        if (x != y) {
            if (x != z) {
                if (y != z) {
                    System.out.println("Scalene triangle");
                } else {
                    System.out.println("Isosceles triangle");
                }
            } else {
                System.out.println("Isosceles triangle");
            }
        } else if(x == y)
            {
               if(y == z)
               {
                    System.out.println("Equilateral triangle");
               }
             if(y != z)
             {
                 System.out.println("Isosceles triangle");
             }
                        
        } else {
            System.out.println("Scalene triangle");
        }
    }

    private static int enterNumber(Scanner in) {
        int number = -1;    
        do {
            System.out.println("Please enter a positive number!");
            while (!in.hasNextInt()) {
                System.out.println("That's not a number!");
                in.next(); // this is important!
            }
            number = in.nextInt();
        } while (number <= 0);
        System.out.println("Thank you! Got " + number);
        return number; 
    }

}
