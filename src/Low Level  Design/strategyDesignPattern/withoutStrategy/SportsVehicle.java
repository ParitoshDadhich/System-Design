package strategyDesignPattern.withoutStrategy;

public class SportsVehicle extends Vehicle{
    @Override
    public void drive(){
        // different drive logic
        // both sportsVehicle and OffRoadVehicle have same logic
        System.out.println("Off road drive capability");

    }
}
