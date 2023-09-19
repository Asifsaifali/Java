import java.util.ArrayList;

public class IntersectionOfArray {
    public static void main(String[] args){
        int[] one = {10,20,33,50,56,67};
        int[] two = {5,10,30,33,50,67};
        
      
        System.out.println(myfun(one,two));
    }

     public static ArrayList<Integer> myfun(int[] first ,  int[] second){
            int i=0;
            int j=0;
            ArrayList<Integer> list = new ArrayList<>();

            while(i<first.length && j<second.length){
                if(first[i]>second[j]){
                    j++;
                }else if(second[j]>first[i]){
                    i++;
                }else{
                    list.add(first[i]);
                    i++;
                    j++;
                }
            }
            return list;
        }
}
