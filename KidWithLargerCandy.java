import java.util.*;
class kidWithLargerCandy{
    public static void main(String[] args){
        int [] candy = {12,1,12};
        int extraCandy = 10;
        System.out.println(findLargestNumber(candy,extraCandy));
        }
        /**
         * @param arr
         * @param extraCandy
         * @return
         */
        public static List<Boolean> findLargestNumber(int[] arr, int extraCandy) {
            int maxCandy = 0;
            int count = 0;
            List<Boolean> value = new ArrayList<Boolean>();
            for(int i = 0; i < arr.length; i++){
                maxCandy = arr[i] + extraCandy;
                    for( int j = 0; j < arr.length; j++){
                if(maxCandy >= arr[j]  ){
                    count++;
                  }else{
                    count = 0;
                  }
                }
                if(count == arr.length) {
                    value.add(true);
                    count = 0;
                }else{
                    value.add(false); 
                    count = 0;
                } 
                
            }
            return value;
        }
}