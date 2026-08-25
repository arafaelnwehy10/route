package Day2;

import java.util.Scanner;

public class cashier {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number of items");
        int numofitems=scanner.nextInt();
        double total=0;
        for(int i=1;i<=numofitems;i++){
            System.out.println("enter the priseof item " +i);
            double prise =scanner.nextDouble();
            total+=prise;
        }
        System.out.println("total="+total);
        scanner.close();
    }
}
