package strategyDesignPattern.withStrategy;

import strategyDesignPattern.withStrategy.strategy.DriveStrategy;
import strategyDesignPattern.withStrategy.strategy.NormalDrive;

public class NormalVehicle extends Vehicle{
    public NormalVehicle() {
        super(new NormalDrive());
    }
}
