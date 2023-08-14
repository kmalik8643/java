import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        System.out.println(MyClass.count); // Output: 2


        System.out.println("Enter the operator");
        Scanner myobj=new Scanner(System.in);
        char value = myobj.next().charAt(0);

        System.out.println("Enter the 1st");
        float no1 = myobj.nextInt();

        System.out.println("Enter the 2nd");
        float no2= myobj.nextInt();
        float answer;

        if (value=='+'){
            answer=no1+no2;
            System.out.println("Result: of addition " + no1 +"and" +no2+"=" + answer);
        } else if (value=='-') {
            if (no1>no2) answer=no1-no2;
            else answer=no2-no1;
            System.out.println("Result: of substraction" + no1 +"and" +no2+"=" + answer);
        } else if (value=='*') {
            answer=no1*no2;
            System.out.println("Result: of multiplicatio" + no1 +"and" +no2+"=" + answer);
        }
        else if(value=='/') {
            if (no1>no2) answer=no1/no2;
            else answer=no2/no1;
            System.out.println("Result: of division " + no1 +"and" +no2+"=" + answer);
        }
        else System.out.println("Incorrect input");




    }
}