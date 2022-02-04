// Exercise 1


public class Exercise1 { // begining of the class

    public static void main(String[] args) { // Begining of the method

        // Declare given variables

        int miles = 26, yards = 385;
        double kilometers;

        kilometers = (miles * 26) + (yards * 1.609 / 1760); // Calculation of Kilometers

        System.out.print("Kilometers :" + kilometers); // Display Kilometers

    } // End of the method

} // End of the class

**************************************************************************************************************
//Exercise 2


public class Exercise2 {

    public static void main(String args[]) {

        System.out.println("DitNo :" + args[1]);
        System.out.println("Name :" + args[0]);
        System.out.println("District :" + args[2]);

    }

}//End of class

****************************************************************************************************************

// Exercise 3

/* Write a program to calculate the volume of a cube when length, width and height are
given as keyboard inputs. */

import java.util.Scanner; // Use java Scanner package

public class Exercise3 { // Begining of the class

    public static void main(String[] args) { // Begining of the method

        int length, width, height, volume; // Declare variable

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length of Cube : ");
        length = sc.nextInt();

        System.out.print("Enter the Width of Cube :");
        width = sc.nextInt();

        System.out.print("Enter the Height of the Cube :");
        height = sc.nextInt();

        volume = length * width * height;

        System.out.print("The Volume of the Cube is :" + volume);

    } // End of the Method

} // End of the class

****************************************************************************************************************

//Exercise 4

import java.io.*;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        int length, width, height, volume;

        InputStreamReader isr = new InputStreamReader(System.in);

        // BufferedReader in = new BufferedReader(isr);

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the Length of the Cube :");
        length = Integer.parseInt(in.readLine());

        System.out.print("Enter the Width of the Cube :");
        width = Integer.parseInt(in.readLine());

        System.out.print("Enter the Height of the Cube :");
        height = Integer.parseInt(in.readLine());

        volume = length * width * height;

        System.out.print("The Volume is :" + volume);

    }

}