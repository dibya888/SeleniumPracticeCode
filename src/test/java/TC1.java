import org.testng.annotations.*;

public class TC1 {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This will execute before every method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("This will execute after every method");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("This will execute before the class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("This will execute after the class");
    }


    @Test
    public void test1() {
        System.out.println("This is Test1");
    }

    @Test
    public void test2(){
        System.out.println("This is Test2");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("This will execute before the test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("This will execute after the test");
    }
}

