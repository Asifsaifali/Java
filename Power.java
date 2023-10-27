import java.lang.Math;
public class Power {
    public static boolean p;
    public static void main(String[] arg){
    int c = 2;
     int sum = 0;
    for(int i=1; i<c ; i++){
      int myvar =  (int) Math.pow(i,i);
     if(sum == c){
         p = true;
     }else if(myvar==c){
        p = true;
     }
     else{
         sum = sum + (int) Math.pow(i,i);
         p = false;
     }   
    }
    System.out.println(p);
  }
}
