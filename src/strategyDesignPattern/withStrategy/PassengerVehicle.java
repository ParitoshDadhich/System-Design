package strategyDesignPattern.withStrategy;

import strategyDesignPattern.withStrategy.strategy.DriveStrategy;
import strategyDesignPattern.withStrategy.strategy.NormalDrive;
import strategyDesignPattern.withStrategy.strategy.OffRoadDrive;

public class PassengerVehicle extends Vehicle{

    public PassengerVehicle() {
        super(new NormalDrive());
    }
}
