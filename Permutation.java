public class Permutation {
    public static void main(String[] args){
        int arr[]={1,3,2};
        int j=arr.length-1;
        int i = 0;
        int temp=0;
        
            if(arr[j]>arr[i]){
                temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }else if(arr[j]<arr[j-1]){
                temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=arr[i];
                arr[i]=temp;
            }
            else{
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        for(int k : arr){
            System.out.print(k +" ");
        }
    }
}
