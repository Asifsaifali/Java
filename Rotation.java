class Rotation{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int n=5,l=0;
        int temp=0;
                System.out.println("Befor Rotation");
                for(int k:arr)        
                System.out.println(k);


        for(int i=0;i<n; i++){
            temp=arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
    }
             arr[l]=temp;
}
     System.out.println("After Rotation");
                for(int k:arr)        
                System.out.println(k);
}
}