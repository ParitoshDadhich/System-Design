package strategyDesignPattern.withStrategy.strategy;

public class SomeOtherDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Some other drive capability!");
    }
}
