public class TwoDArray {
    
    public static void main(String[] args){

        int[][] arr = {

            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        
        int i,j;
        
        for(i=0;i<=arr.length;i++){
            if(i%2==0){
               for(j=0;j<arr.length;j++){
                 System.out.print(arr[j][i] +" ");
               }
            }else{
                for(j=arr.length-1;j>=0;j--){
                    System.out.print(arr[j][i] +" ");
                }
            }
            System.out.println();
    }
        // System.out.println(arr.length);
    }
}
