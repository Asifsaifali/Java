public class MoveZeros {
    public static void main(String[] args){
        int arr[] ={0,1};
       int result = moveZeroes(arr);
       System.out.println(result);
       for(int k : arr)
          System.out.print(k+" ");
    }
            private static int moveZeroes(int[] nums) {
                // int zeroCount = 0, j = 0;
                // for(int i = 0; i<nums.length; i++){
                //     if(nums[i] != 0){
                //         nums[j] = nums[i];
                //         j++;
                //     }else{
                //         zeroCount++;
                //     }
                // }
                // j = nums.length - 1;
                // while(j >= zeroCount){
                //     nums[j] = 0;
                //     j--;
                // }
                int zeroCount = 0;
                int j = 0;
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] != 0) {
                        nums[j] = nums[i];
                        if (i != j) {
                            nums[i] = 0;
                        }
                        j++;
                    } else {
                        zeroCount++;
                    }
                }

                return zeroCount;
    }
}
