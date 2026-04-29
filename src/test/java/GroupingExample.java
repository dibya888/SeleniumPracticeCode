import org.testng.annotations.Test;

public class GroupingExample {
    @Test (groups = {"sanity"})
    public void test1(){
        System.out.println("This is Test 1...");
    }
    @Test (groups = {"sanity"})
    public void test2(){
        System.out.println("This is Test 2...");
    }
    @Test (groups = {"regression"})
    public void test3(){
        System.out.println("This is Test 3...");
    }
    @Test (groups = {"regression"})
    public void test4(){
        System.out.println("This is Test 4...");
    }
    @Test (groups = {"sanity","regression","unit"})
    public void test5(){
        System.out.println("This is Test 5...");
    }
    @Test (groups = {"unit"})
    public void test6(){
        System.out.println("This is Test 6...");
    }
    @Test (groups = {"unit"})
    public void test7(){
        System.out.println("This is Test 7...");
    }
}
