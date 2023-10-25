public class TwoSum {
    public static void main(String[] args){
        int nums[]={5,25,75};
            int i,j;
        for(i=1,j=0;i<nums.length;i++){
            if((nums[i]+nums[j])==100){
                System.out.println("Pair found: "+ (j+1) +" and "+ (i+1) +" indexes");
            }else if(i>=nums.length && nums[i]+nums[j]!=100){
                j++;
            }
        }
    }
}
