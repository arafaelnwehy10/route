package Day3;

import java.util.Scanner;

public class Lettersearch {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter text ");
        String text=scanner.nextLine();
        boolean letterfound=false;
        int pos=0;
        for(int i=0;i<text.length();i++){
        char currentletter=text.charAt(i);
        if(currentletter=='a'||currentletter=='A'){
            letterfound=true;
            pos=+1;
         break;
        }
        }
if (letterfound){
    System.out.println("letter found at "+pos);
}
else System.out.println("letter not found");
    }
}
