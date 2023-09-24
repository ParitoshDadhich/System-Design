package strategyDesignPattern.withStrategy;

import strategyDesignPattern.withStrategy.strategy.DriveStrategy;
import strategyDesignPattern.withStrategy.strategy.OffRoadDrive;

public class SportsVehicle extends Vehicle{

    public SportsVehicle() {
        super(new OffRoadDrive());
    }
}
