import java.util.ArrayList;
public class ArrayListDemo {
    
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> str=new ArrayList<>();

        str.add("Java");
        str.add("C");
        str.add("C++");

        list.add(1);
        list.add(10);
        list.add(12);
        list.add(14);


        System.out.println(str);
        System.out.println(list.get(1));

}
}
