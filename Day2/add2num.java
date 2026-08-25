package Day2;

import java.util.Scanner;

public class add2num {
    static void main() {
        boolean res;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("enter first num");
            int num1=scanner.nextInt();
            System.out.println("enter second num");
            int num2=scanner.nextInt();
            int sum=num1+num2;
            System.out.println("sum = "+sum);
            System.out.println("continue !");
            res=scanner.nextBoolean();
        }while (res);
        scanner.close();
    }
}
