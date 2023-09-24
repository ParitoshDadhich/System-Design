package strategyDesignPattern.withStrategy;

import strategyDesignPattern.withStrategy.strategy.DriveStrategy;
import strategyDesignPattern.withStrategy.strategy.OffRoadDrive;

public class OffRoadVehicle extends Vehicle{

    public OffRoadVehicle() {
        super(new OffRoadDrive());
    }
}
