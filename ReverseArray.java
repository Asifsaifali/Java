class ReverseArray{
    public static void main(String[] args) {

         int[] arr = {1,2,3,4,5};
        
                System.out.println("Before reverse");    
        int temp;
        // System.out.println("------Before Update------");
        for(int k:arr){
            System.out.println(k);
        }
        for (int i=0,j=arr.length-1;i<arr.length;i++,j--) {
            if(i<=j){
               temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
            }   
        }   
        System.out.println("------After Update------");
        for(int l:arr){
            System.out.println(l);
        }

    
    }
}
