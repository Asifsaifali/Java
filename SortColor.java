public class SortColor {
    public static void main(String[] args){

        int arr[]={0,2,1,2,0,2,0,1};
        int tmp=0; 
        for( int i = 0; i < arr.length; i++){  
           for (int j = i + 1; j < arr.length; j++){  
                 tmp = 0;  
                    if (arr[i] > arr[j]){  
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
