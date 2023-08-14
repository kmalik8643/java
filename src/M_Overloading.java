public class M_Overloading {
     static  int a;
     int b,c;
    public M_Overloading(int a, int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;

    }
    public static void main(String[] args){



        M_Overloading obj=new M_Overloading(10,20,30);
        System.out.println("Static Inside");
        obj.addition(a,10);
        obj.addition(a,20,30);

    }
    public static void addition(int a,int b){

        System.out.println(a+b);
    }
    static{
        System.out.println("Static outside Complete");
        System.out.println("this"+""+a+40);
    }
      public static void addition(int a,int b, int c){
        System.out.println(a+b+c);
    }
}
