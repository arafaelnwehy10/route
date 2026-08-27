package javaAssignment;

import java.util.Scanner;

public class Operations {
   public static void main() {
       Scanner scanner=new Scanner(System.in);
       int choice;
       do {
           System.out.println("=========================");
           System.out.println("Number Analyzer Menu");
           System.out.println("=========================");
           System.out.println("1 - Print Numbers 10 to 1");
           System.out.println("2 - Print Even/Odd Report");
           System.out.println("3 - Check Number Type");
           System.out.println("4 - Calculate Sum Between Two Numbers");
           System.out.println("5 - Exit");
           System.out.println("=========================");
           System.out.println("Enter your choice:");

           choice = scanner.nextInt();

           if(choice == 1){
               printNumbersDescending();
           } else if(choice == 2){
               printEvenOrOdd();
           } else if(choice == 3){
               System.out.println("Enter a number:");
               int value = scanner.nextInt();
               String result = checkNumberType(value);
               System.out.println(result);
           } else if(choice == 4){
               System.out.println("Enter first number:");
               int number1 = scanner.nextInt();

               System.out.println("Enter second number:");
               int number2 = scanner.nextInt();

               int result = calculateSum(number1, number2);

               System.out.println("Sum = " + result);
           } else if(choice == 5){
               System.out.println("Thank you for using Number Analyzer.");
           } else {
               System.out.println("Invalid Choice");
           }
       } while (choice != 5);

    }
    //Prints the numbers from 10 down to 1.
    public static void printNumbersDescending(){
       for(int i=1;i<=10;i++){
           System.out.println(i);
       }
    }
    //Prints the numbers from 1 to 10 and shows whether each number is even or odd.
    public static void printEvenOrOdd(){
        for(int i=10;i>=1;i--){
           if(i%2==0)
               System.out.println(i+" -> even ");
           else System.out.println(i+" -> Odd ");
        }
    }
    //identifies the given number if  it is positive, negative, or zero
    public static String checkNumberType(int number){
        if(number>0) {
         //   System.out.println(" positive");
            return "positive";
        } else if (number<0) {
      //      System.out.println(" negative");
            return "negative";
        }
    //    else System.out.println(" zero");
            return "zero";
    }
    //Calculates the sum of two given numbers
    public static int calculateSum(int value_1, int value_2){
        int sum = value_1 + value_2;
        return sum;
    }

}
