import java.util.Scanner;

public class method_overloading {

    public static void main(String[] args) {
        int num1, num2;
        Scanner myobj = new Scanner(System.in);

        System.out.println("Age");
        num1 = myobj.nextInt();

        System.out.println("name");
        String str_val = myobj.next();

        System.out.println("name is :"+Name_age(str_val));
        System.out.println("Age is :"+Name_age(num1));
    }

    public static int Name_age(int a){
        return a;
    }
    public static String Name_age(String abc){

        return abc;
    }



}


