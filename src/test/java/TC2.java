import org.testng.annotations.*;

public class TC2 {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This will execute before every method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This will execute after every method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("This will execute before the class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("This will execute after the class");
    }


    @Test
    public void test3() {
        System.out.println("This is Test3");
    }

    @Test
    public void test4() {
        System.out.println("This is Test4");
    }

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("This will execute before the test suit");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("This will execute after the test suit");
    }
}

