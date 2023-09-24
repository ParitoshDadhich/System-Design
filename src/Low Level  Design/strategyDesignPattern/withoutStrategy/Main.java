package strategyDesignPattern.withoutStrategy;

public class Main {
    public static void main(String[] args) {
        // PROBLEM IN  THIS CODE IS
        /*
        * Both offRoadVehicle and sprotsVehicle have the same logic
        * there should be a way, so that we can reuse the same code in both the classes
        * but not with this logic, we are not able to achieve our target
        * */

        /*
            ANOTHER PROBLEM
        * There is a tight coupling btw all the classes;
        *  */

        /*
            For resolving both above issues, we will use STRATEGY DESIGN PATTERN
         */

        Vehicle nor = new NormalVehicle();
        nor.drive();


    }
}