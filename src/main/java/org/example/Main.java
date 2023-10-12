package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Example of division by zero

                try{
                    int number = 10;
                    int divider = 0;
                    int result = divideNumber(number, divider);
                    System.out.println("Result of dividing: " + result );
                } catch (ArithmeticException e) {
                    System.out.println("Error: Division by zero is not valid");
                    e.printStackTrace();
                }

//        Example of root extraction from a negative number

                try {
                    double negativeNumber = -9;
                    double squareRoot = calculateSquareRoot(negativeNumber);
                    System.out.println("Root of the number of: " + squareRoot);
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: Unable to extract root from negative number");
                    e.printStackTrace();
                }

//        Example of reference to a nonexistent array element

                try{
                    int[] array = {1,2,3};
                    int index = 4;
                    int element = array[index];
                    System.out.println("Element of array: " + element);
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Error: Reference to a non-existent element of an array");
                    e.printStackTrace();
                }

//        Example of entering letters instead of numbers

                Scanner scanner = new Scanner(System.in);
                try{
                    System.out.println("Print the number: ");
                    int number = scanner.nextInt();
                    System.out.println("You print: " + number);
                }catch (InputMismatchException e){
                    System.out.println("Error: Enter the correct number");
                    e.printStackTrace();
                }

//        Example of calling object method with zero reference

                String str = null;
                try{
                    int length = str.length();
                    System.out.println("String length: " + length);
                }catch (NullPointerException e){
                    System.out.println("Error: Null object reference");
                    e.printStackTrace();
                }

            }

            public static int divideNumber(int number, int divider){
                if (divider == 0) {
                    throw new ArithmeticException("Zero division is not allowed");
                }
                return number / divider;
            }

            public static double calculateSquareRoot(double number) {
                if (number < 0) {
                    throw new IllegalArgumentException("Root cannot be extracted from negative number");
                }
                return Math.sqrt(number);
            }
        }
    }
}