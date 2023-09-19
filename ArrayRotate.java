public class ArrayRotate {
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        int temp=0;
        int k=1;
       
        System.out.println(arr.length);
        // for(int l:arr){
        //     System.out.println(l);
        // }
        for(int i=0;i<k;i++){
            //  temp=arr[arr.length-1 ];
            for(int j=0;j<arr.length-1;j++){
                // arr[j+1]=arr[j];
                System.out.println(j);

            }
            // arr[i]=temp; 
        }
        // System.out.println("After rotation:");
        // for(int l:arr){
        //     System.out.println(l);
        // }
    }
}
