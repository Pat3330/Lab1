//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(4, "Red", 1.5f, "Petrol");
        Car car = new Car(4, "Blue", 1.8f, "Petrol", "BMW");

        int vehicleNumberOfWheels = vehicle.getNumberOfWheels();
        String vehicleColor = vehicle.getColor();
        float vehicleEngineSize = vehicle.getEngineSize();
        String vehicleFuelType = vehicle.getFuelType();
        System.out.println(vehicleNumberOfWheels + " " + vehicleColor + " " + vehicleEngineSize + " " + vehicleFuelType);

        vehicle.setNumberOfWheels(5);
        vehicle.setColor("Black");
        vehicle.setEngineSize(2.0f);
        vehicle.setFuelType("Diesel");

        int newVehicleNumberOfWheels = vehicle.getNumberOfWheels();
        String newVehicleColor = vehicle.getColor();
        float newVehicleEngineSize = vehicle.getEngineSize();
        String newVehicleFuelType = vehicle.getFuelType();

        System.out.println(newVehicleNumberOfWheels + " " + newVehicleColor + " " + newVehicleEngineSize + " " + newVehicleFuelType);
        car.honk();
        car.displayInfo();
        car.setBrand("Ford");
        car.displayInfo();
    }
}