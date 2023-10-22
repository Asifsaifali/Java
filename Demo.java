class Demo{
    public static void main(String[] args){
        int[] arr={7,5,9,7,5,8,10,4,3,3,2,5,9,10};
        int n = 7;
        int temp=0,j=n;
        for(int i=1; i<arr.length-2;i++){
            if((arr.length/2)<=i){
                j++;
            }
            
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for(int k:arr){
        System.out.print(k  + " ");
            // System.out.println(arr.length);
}
        }

}
    