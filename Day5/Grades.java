package Day5;

import java.util.Scanner;

public class Grades {
    static Scanner scanner = new Scanner(System.in);
    static int[]grades;
    public static void getGrades(int[]grades) {


        for(int i = 0; i < grades.length; i++){
            System.out.println("Enter grades "+(i+1));
            grades[i] = scanner.nextInt();

        }
    }
    public static void PrintGrades (){
        for(int i = 0; i < grades.length; i++){
            for(int grade : grades){
                System.out.println(grade);
            }
        }

    }
    public static int CalculateSum(){
        int sum = 0;
        for(int grade : grades){
            sum += grade;

        }
        return sum;
    }
    public static void main(String[] args) {


        System.out.println("Enter number of grades: ");
        int numberOfGrades = scanner.nextInt();
        grades =new int[numberOfGrades];
        getGrades(grades);
        PrintGrades ();
        System.out.println("the average grade is "+CalculateAvg());
        System.out.println("The Highest grade is "+getHighestGrade());
        System.out.println("The Lowest grade is "+getLowestGrade());
    }
    public static double CalculateAvg(){
        return CalculateSum()/grades.length;
    }
    public static int getHighestGrade(){
        int highestGrade = grades[0];
        for(int grade : grades){
            if(grade > highestGrade){
                highestGrade = grade;
            }
        }
        return highestGrade;
    }
    public static int getLowestGrade(){
        int lowestGrade = grades[0];
        for(int grade : grades){
            if(grade < lowestGrade){
                lowestGrade = grade;
            }
        }
        return lowestGrade;
    }
}