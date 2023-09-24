package strategyDesignPattern.withStrategy.strategy;

public class OffRoadDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Off road drive capability!");
    }
}
