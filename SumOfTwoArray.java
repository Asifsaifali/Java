import java.util.ArrayList;

// Sum of two array 

public class SumOfTwoArray {

    public static void main(String[] args) {

        int[] one = { 2, 4, 6, 7, 9 };
        int[] two = { 1, 8, 7, 2, 8 };
        System.out.println(Add(one, two));

    }

    public static ArrayList<Integer> Add(int[] one, int[] two) {
        int carry = 0;
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int result = 0;
        int i;
        int j ;

        for (i = one.length - 1, j = two.length - 1; i >= 0 || j >= 0; i--, j--) {
            sum = carry + one[i] + two[j];
            if (sum < 10) {
                carry = 0;
            }
            result = sum % 10;
            carry = sum / 10;
            list.add(0, result);
        }

        if (carry != 0) {
            list.add(0, carry);
        }
        return list;
    }
}
