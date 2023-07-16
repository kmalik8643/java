import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        int num1, num2;
        Scanner myobj = new Scanner(System.in);

        System.out.println("enter value 1");
        num1 = myobj.nextInt();
        System.out.println("enter value 2");
        num2 = myobj.nextInt();
        System.out.println("enter value 3");
        int num3 = myobj.nextInt();
        System.out.println("enter value 4");
        int num4 = myobj.nextInt();
        System.out.println("any string ");
        char str_val = myobj.next().charAt(0);

        System.out.println("Sum is :"+Sum(num1,num2,num3,num4,str_val));
        System.out.println("Sum is :"+Sum(num1,num2,num3));
    }

        public static int Sum(int a,int b, int c){
        return a+b+c;
        }
        public static int Sum(int a,int b, int c,int d,char abc){

        return a*b*c*d;
        }



}

