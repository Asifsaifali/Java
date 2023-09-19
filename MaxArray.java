public class MaxArray {
    public static void main(String[] args){
        int[] arr = {10,46,3,56,34};
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(temp< arr[i+1]){
                temp=arr[i+1];
            }
        }
        System.out.println("Greater value of Array is:"+temp);
    }
}
