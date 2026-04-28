import org.testng.annotations.Test;

public class TestNG {
    @Test
    public void openBrowser(){
        System.out.println("Let's open the browser.");
    }
    @Test
    public void signUp(){
        System.out.println("Signing Up");
    }
    @Test
    public void logIn(){
        System.out.println("Logging In");
    }
    @Test
    public void addToCart(){
        System.out.println("Add items to the cart");
    }
    @Test
    public void logOut(){
        System.out.println("Logging Out");
    }
    @Test
    public void closeTheBrowser(){
        System.out.println("Closing Browser");
    }
}
