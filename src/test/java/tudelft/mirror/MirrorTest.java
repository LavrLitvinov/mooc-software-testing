package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    private Mirror mir;

    @BeforeEach
    public void initialize() {
        this.mir = new Mirror();
    }


    @Test
    public void Test1() {

        String rez = mir.mirrorEnds("tyyyt");

        Assertions.assertEquals("tyy", rez);
    }

    @Test
    public void Test11() {

        String rez = mir.mirrorEnds("tyyyyyt");

        Assertions.assertEquals("tyyy", rez);
    }

    @Test
    public void Test111() {

        String rez = mir.mirrorEnds("tyqynyqyt");

        Assertions.assertEquals("tyqyn", rez);
    }



    @Test
    public void Test2() {

        String rez = mir.mirrorEnds("tyyyyt");

        Assertions.assertEquals("tyy", rez);
    }







    @Test
    public void Test3() {

        String rez = mir.mirrorEnds("aba");

        Assertions.assertEquals("aba", rez);
    }
}
