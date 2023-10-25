public class Duplicate {
    public static void main(String[] args){

        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int i,j;
        int l=arr.length;

        for(i=1,j=i;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[j]=arr[i];
                j++;
            }
        }
        System.out.println(j);
        for(int k:arr){
            System.out.print(k +" ");
        }
         System.out.println();
        System.out.println("length of array is:" +l);
    }
}
