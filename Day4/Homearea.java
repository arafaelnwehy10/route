package Day4;

public class Homearea {
    static void main() {
        Rectangle r1=new Rectangle();

        r1.setLenght(20 );
        r1.setWidht(10 );
        double area_1=r1.calculate_area();
       System.out.println("area_1  = "+area_1);
       Rectangle r2=new Rectangle(15,45);
//       r2.setLenght(20);
//       r2.setWidht(10);
       double area_2=r2.calculate_area();
       System.out.println("area_2  = "+area_2);
       System.out.println("total area = "+(area_1+area_2));

   }

}
