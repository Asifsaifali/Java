public class Duplicate {
    public static void main(String[] args){

        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int i,j;
        int l=arr.length;

        for(i=0,j=i+1;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                arr[i]=arr[j];
                // j++;
                l--;
            }else{
                j++ ;
            }
        }
        for(int k:arr){
            System.out.print(k +" ");
        }
         System.out.println();
        System.out.println("length of array is:" +l);
    }
}
