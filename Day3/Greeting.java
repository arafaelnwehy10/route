package Day3;

import java.util.Scanner;

public class Greeting {
    static void main() {
String name=getname();
greeting_user(name);
    }
    static String getname(){
        System.out.println("enter your name ");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        return name;
    }
   static void greeting_user(String name){
        System.out.println("hello "+name);
    }
}
