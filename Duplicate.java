import java.util.*;
public class Duplicate {
    public static void main(String[] args){

        int[] arr = {2,2,3,2}; //{2,2,2,3}
        int p=0;
        int j = arr.length - 1;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; ) {
            if(arr[i] == arr[i-1] && arr.length>4){
                i = i+3;
            }else if(arr.length==4 && arr[i]==arr[i-1]){
                p=arr[i+2];
            }
            else{
                p = arr[i-1];
                break;
            }
            if(arr[i] != arr[i-1] && i==1){
                p=arr[i-1];
                break;
            }else if(arr[j]!=arr[j-1]){
                p=arr[j];
                break;
            }
        }

        
            System.out.print(p +" ");
        // System.out.println();
        // System.out.println("length of array is:" +l);
    }
}
