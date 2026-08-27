package Day3;

import java.util.Scanner;

public class Students {
    static void main() {
        int num_of_stu=3;
        int num_of_corses=3;
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<num_of_stu;i++){
            double total=0;
            for(int j=0;j<num_of_corses;j++){
                System.out.println("enter grade of course "+(j+1)+" for student "+(i+1));
                double score =scanner.nextDouble();
                total+=score;
            }
            System.out.println("the avrage score for student "+(i+1)+" is "+total/num_of_corses);

        }
    }
}
