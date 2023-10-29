public class CountPair {
    public static void main(String[] args){

        int[] arr = {-1,1,2,3,1};
        System.out.println("Count of pairs with sum 0 is: " + countPairsWithSumZero(arr));
    }

    public static int countPairsWithSumZero(int[] arr){
        int count = 0;
        int target = 2;
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] < target){
                    count++;
                }
            }
        } 
        return count;
    }
}
