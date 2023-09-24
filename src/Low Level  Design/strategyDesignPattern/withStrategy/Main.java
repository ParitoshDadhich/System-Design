package strategyDesignPattern.withStrategy;

public class Main {
    /* *
    With Strategy design pattern, we can reuse the same logic in multiple classes;
    In this example we implemented same logic for PassengerVehicle and OffRoadVehicle classes;
     */

    public static void main(String[] args) {
        Vehicle normalVehicle = new NormalVehicle();
        normalVehicle.drive();

        Vehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.drive();

        Vehicle passengerVehicle = new PassengerVehicle();
        passengerVehicle.drive();

        Vehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();
    }
}
