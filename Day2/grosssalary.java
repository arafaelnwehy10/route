package Day2;
import java.util.Scanner;
public class grosssalary {
    static void main() {
        System.out.println("enter number of hour");
        Scanner scanner=new Scanner(System.in);
        double hours= scanner.nextDouble();
        int rate=15;
        int maxhours =40;
        while (hours>40){
            System.out.println("enter value between 1:40");
            hours=scanner.nextDouble();
        }
        scanner.close();
        double grosssal =hours*rate;
        System.out.println("grosssal = "+grosssal);
    }
}
