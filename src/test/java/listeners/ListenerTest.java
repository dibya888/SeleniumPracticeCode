package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.CustomListener.class)
public class ListenerTest {
    @Test
    public void test1(){
        System.out.println("This is Test 1...");
        Assert.assertEquals("A","A");
    }
    @Test
    public void test2(){
        System.out.println("This is Test 2...");
        Assert.assertEquals("A","B");
    }
    @Test
    public void test3(){
        System.out.println("This is Test 3...");
        throw new SkipException("This is skip exception...");
    }
}
