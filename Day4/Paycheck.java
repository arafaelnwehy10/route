package Day4;

import java.util.Scanner;

public class Paycheck {
   static double req_sal = 20000;
    static double req_credit_score = 500;
    static void main() {
     double credit=   get_employee_credit();
     double salary =get_employee_salary();
     isqualified(salary,credit);
    }
    static double get_employee_credit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your credit score ");
        double credit_score = scanner.nextDouble();
        return credit_score;
    }
    static double get_employee_salary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your salary ");
        double salary = scanner.nextDouble();
        return salary;
    }

   static boolean isqualified(double salary,double credit_score) {
        if (salary >= req_sal && credit_score >= req_credit_score) {
            System.out.println("congrats");
            return true;
        }
        else {
            System.out.println("sorry");
            return false;
        }
    }
}
