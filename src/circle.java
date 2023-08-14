public class circle {
    static double pi=3.14;
   
    public static void main (String[] args){
        circle c=new circle();
        System.out.println(c.area(10));
    }
    public double area(double radius) {
    return pi* radius;
    }
    }

