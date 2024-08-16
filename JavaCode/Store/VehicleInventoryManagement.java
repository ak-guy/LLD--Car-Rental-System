package JavaCode.Store;

import java.util.List;
import JavaCode.Product.Vehicle;
import JavaCode.Product.VehicleType;

public class VehicleInventoryManagement {
    List<Vehicle> vehicles;

    // Basic Crud operation //

    // constructor
    VehicleInventoryManagement(List<Vehicle> vehicles){
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehicles(VehicleType vehicleType){
        // return list of vehicles based on vehicle Type
        return this.vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        this.vehicles.remove(vehicle);
    }
}
