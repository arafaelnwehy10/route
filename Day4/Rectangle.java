package Day4;
 public   class Rectangle {
   private double lenght;
    private double widht;
    public Rectangle(){
        System.out.println("hi mohamed");
    }
     public Rectangle(double lenght,double widht){
         System.out.println("hi arafa  ");
//         lenght=8;
//         widht=8;
         setWidht(widht);
         setLenght(lenght);

     }
   public void setLenght(double lenght){
        this.lenght=lenght;
    }
     public void setWidht(double widht){
         this.widht=widht;
     }
     public double getLenght(){
       return lenght;
     }
     public double getWidht(){
         return widht;
     }
  public   double calculate_area(){
        return lenght*widht;
    }
    public double calculate_perimeter(){
        return lenght*2+widht*2;
    }
}
