class Demo{
    public static void main(String[] args){
        int[] arr={1,2,1};
        int n= arr.length;
        int[] sums=new int[2 * n];

        for(int i=0;i<arr.length;i++){
            sums[i]=arr[i];
            sums[i+n]=arr[i] ;
        }
        for(int k:sums)
        System.out.println(k);
    }
}
    