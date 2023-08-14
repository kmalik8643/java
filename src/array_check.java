import java.util.Arrays;
public class array_check {
    public static void main(String[] args){
        int[] first_arr={1,2,3,4,7};
        int i,j= first_arr.length;
        int value;
        int[] a =new int[5];

        for(i=0;i<first_arr.length/2;i++){
            value=first_arr[i];
            first_arr[i]=first_arr[j-i-1];
            first_arr[j-i-1]=value;
        }
        System.out.println("reverse:"+Arrays.toString(first_arr));
    }
}
