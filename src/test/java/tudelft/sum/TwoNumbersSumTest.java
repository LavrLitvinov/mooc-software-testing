package tudelft.sum;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoNumbersSumTest {


    private  TwoNumbersSum suma;
    @BeforeEach
    public void inite(){
        this.suma = new TwoNumbersSum();
    }

    @Test
    public void twoNumber1(){
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(9,0));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1,1));
        ArrayList<Integer> expectedRezult = new ArrayList<>(Arrays.asList(1,0,1));
        ArrayList<Integer> rezult = suma.addTwoNumbers(first, second);
        Assertions.assertEquals(expectedRezult, rezult);

    }
//
    @Test
    public void twoNumber(){
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(5,6));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1,1));
        ArrayList<Integer> expectedRezult = new ArrayList<>(Arrays.asList(6,7));
        ArrayList<Integer> rezult = suma.addTwoNumbers(first, second);
        Assertions.assertEquals(expectedRezult, rezult);

    }
    @Test
    public void oneNumber(){
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(9));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> expectedRezult = new ArrayList<>(Arrays.asList(1,0));
        ArrayList<Integer> rezult = suma.addTwoNumbers(first, second);
        Assertions.assertEquals(expectedRezult, rezult);
    }

    @Test
    public void threeNumber1() {
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(9, 0, 5));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1, 1, 1));
        ArrayList<Integer> expectedRezult = new ArrayList<>(Arrays.asList(1,0, 1, 6));
        ArrayList<Integer> rezult = suma.addTwoNumbers(first, second);
        Assertions.assertEquals(expectedRezult, rezult);
    }
}
