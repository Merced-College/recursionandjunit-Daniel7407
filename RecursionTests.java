import static org.junit.Assert.assertEquals; 
import org.junit.Test; 

public class RecursionTests{
    @Test 
    public void count8Test(){
        assertEquals(Main.count8(4), 0);
        assertEquals(Main.count8(12345), 0);
        assertEquals(Main.count8(8), 1);
        assertEquals(Main.count8(818), 2);
        assertEquals(Main.count8(88188), 6);
    }


    @Test 
    public void countHiTest(){
        assertEquals(Main.countHi("xxhixx"), 1); 
        assertEquals(Main.countHi("xhixhix"), 2); 
        assertEquals(Main.countHi("hi"), 1); 
        assertEquals(Main.countHi("a"), 0); 
        assertEquals(Main.countHi("ajlskd"), 0); 

    }

    @Test 
    public void countHi2Test(){
        assertEquals(Main.countHi2("ahixhi"), 1); 
        assertEquals(Main.countHi2("ahibhi"), 2); 
        assertEquals(Main.countHi2("xhixhi"), 0); 
        assertEquals(Main.countHi2("xxhijqkehi;k"), 1); 
        assertEquals(Main.countHi2("qweoiutpqw"), 0);
        assertEquals(Main.countHi2("a"), 0); 
    }

    @Test
    public void strCountTest(){
        assertEquals(Main.strCount("catcowcat", "cat"), 2); 
        assertEquals(Main.strCount("catcowcat", "cow"), 1); 
        assertEquals(Main.strCount("catcowcat", "dog"), 0); 
        assertEquals(Main.strCount("tatat", "tat"), 1);
        assertEquals(Main.strCount("dog", "alligator"), 0); 
    }

    @Test 
    public void stringCleanTest(){
        assertEquals(Main.stringClean("yyzzza"), "yza");
        assertEquals(Main.stringClean("abbbcdd"), "abcd"); 
        assertEquals(Main.stringClean("Hello"), "Helo"); 
        assertEquals(Main.stringClean("qwerty"), "qwerty");
        assertEquals(Main.stringClean("woooooooooooooooooo"), "wo"); 
    }
}