public class SortColor {
    public static void main(String[] args){

        int arr[]={0,2,1,2,0,2,0,1};
        int temp=0; 
        // for(int i = arr.length-1 ; i >(arr.length/2) ; i--){
        //     for(int j=0 ; j < arr.length-1 ; j++ ){
        //         if(arr[i] < arr[j]){
        //             temp=arr[i];
        //             arr[i]=arr[j];
        //             arr[j]=temp;
        //         }
        //     }
        // }
        for (int i = 0; i < arr.length; i++){  
           for (int j = i + 1; j < arr.length; j++){  
                int tmp = 0;  
                    if (arr[i] > arr[j])   
                    {  
                        tmp = arr[i];  
                        arr[i] = arr[j];  
                        arr[j] = tmp;  
                    }  
        }  
    }
        for(int k : arr){
            System.out.print(k +" ");
        }
    }
}
