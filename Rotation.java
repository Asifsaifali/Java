class Rotation{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int n=-1,l=0;
        int temp=0;
                System.out.println("Befor Rotation");
                for(int k:arr)        
                System.out.println(k);

        for(int i=0;i<Math.abs(n); i++){
            temp=arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                if(n<0){
                    arr[j-1]=arr[j];
                }else{
                    arr[j]=arr[j-1];
                }
    }
             arr[l]=temp;
}
     System.out.println("After Rotation");
                for(int k:arr)        
                System.out.println(k);
}
}