import java.util.Scanner;

public class switch_func {
    public static void main(String[] args) {
        System.out.println("Enter the operator\n1 for addition\n2 for subtraction\n3 for multiplication\n4 for dividion");
        Scanner myobj=new Scanner(System.in);
        int value = myobj.nextInt();

        System.out.println("Enter the 1st");
        float no1 = myobj.nextInt();

        System.out.println("Enter the 2nd");
        float no2= myobj.nextInt();
        switch(value){
            case 1:
                System.out.println("result of addition is :"+(no1+no2));
                break;
            case 2:
                System.out.println("result of Substraction is :"+(no1-no2));
                break;
            case 3:
                System.out.println("result of Multiplication is :"+(no1*no2));
                break;
            case 4:
                System.out.println("result of Division is :"+(no1/no2));
                break;
            case 5:
                System.out.println("result of Modulus is :"+(no1%no2));
                break;
            default:
                System.out.println("Wrong answer");


        }

    }
}
