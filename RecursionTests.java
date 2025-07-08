import static org.junit.Assert.assertEquals; 
import org.junit.Test; 

public class RecursionTests{
    @Test // Tests the count8 function 
    public void test1(){
        assertEquals(Main.count8(4), 0);
        assertEquals(Main.count8(12345), 0);
        assertEquals(Main.count8(8), 1);
        assertEquals(Main.count8(818), 2);
        assertEquals(Main.count8(88188), 6);
    }


    @Test // Tests countHi function
    public void test2(){
        assertEquals(Main.countHi("xxhixx"), 1); 
        assertEquals(Main.countHi("xhixhix"), 2); 
        assertEquals(Main.countHi("hi"), 1); 
        assertEquals(Main.countHi("a"), 0); 
        assertEquals(Main.countHi("ajlskd"), 0); 

    }
}