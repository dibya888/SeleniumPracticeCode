import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {
    @Test (priority = 0)
    public void startCar(){
        System.out.println("Car started");
        Assert.fail();
    }

    @Test (priority = 1, dependsOnMethods = {"startCar"})
    public void driveCar(){
        System.out.println("Car driving");
    }

    @Test (priority = 2, dependsOnMethods = {"driveCar"})
    public void stopCar(){
        System.out.println("Car stopped");
    }

    @Test (priority = 3, dependsOnMethods = {"driveCar", "stopCar"})
    public void parkCar(){
        System.out.println("Car parked");
    }
    @Test (priority = 4, dependsOnMethods = {"driveCar"}, alwaysRun = true)
    public void breakCar(){
        System.out.println("Car brokedown");
    }
}
