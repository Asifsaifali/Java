import java.util.*;
public class FindSmaller {
    public static void main(String[] args) { 
        int arr[] = {6,5,4,8};
        // Arrays.sort(arr);
        System.out.println(findSmallestElement(arr));
        
    }

    public static ArrayList<Integer> findSmallestElement(int[] arr){
        int count = 0;
        ArrayList<Integer> newarr = new ArrayList<Integer>(count);
        for(int i = 0; i < arr.length ; i++){
            count = 0;
            for(int j = 0; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    count++;
                }
            }
             newarr.add(count);
        }
        return newarr;
    }
}
