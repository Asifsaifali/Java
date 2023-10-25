public class Repeat {
    public static void main(String[] args){
        int nums[]={2};
        
        System.out.println("Not Repeated number is "+findDuplicate(nums));
    }
        public static int findDuplicate(int [] arr)
        {
            int k=0;
            for (int i = 1, j=0; i < arr.length; i++) {
                if (arr[j] != arr[i]) {
                     k=arr[i];
                    }else if(arr.length<=1){
                        return k=arr[j];
                    }
            }
            return k;
       }

    }
