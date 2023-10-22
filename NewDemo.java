public class NewDemo {
    public static void main(String[] args){

        int nums[]={3,1,2,10,1};
        for(int i=0,j=i+1;j<nums.length;i++,j++){
            nums[j]=nums[i]+nums[j];
        }

        for(int k:nums){
            System.out.print(k +" ");
        }
    }
}
