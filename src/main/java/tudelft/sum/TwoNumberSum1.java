package tudelft.sum;
// самопальный тест
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TwoNumberSum1 {

    public static void main(String[] args) {

        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(9,9));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1));
      //  Collections.addAll(first, 1, 8, 6);
     //   Collections.addAll(second, 1, 8, 8);
        ArrayList<Integer> result2 = addTwoNumbers1(first, second);
        for(int x: result2){
            System.out.print(x);

        }
        System.out.println();
        System.out.println( " " + result2.toString());

    }



    private static ArrayList<Integer> addTwoNumbers1(ArrayList<Integer> first, ArrayList<Integer> second) {
        Collections.reverse(first);
        Collections.reverse(second);
        int cnt = 0;
        int complement = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < Math.max(first.size(), second.size()); i++){
            cnt++;
            int firstVal = i < first.size() ? first.get(i) : 0;
            int secondVal = i < second.size() ? second.get(i) : 0;
            int total = firstVal + secondVal + complement;
           // complement = 0;
            if (total >= 10){
                complement = 1;
                total -= 10;

            }
            result.add(i, total);

        }
        if(complement != 0) result.add(cnt, complement);

        Collections.reverse(result);
        return result;
    }

}
