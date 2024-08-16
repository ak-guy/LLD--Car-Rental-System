import java.util.List;
import java.Product.Vehicle;

public class VehicleInventoryManagement {
    List<Vehicle> vehicles;

    // Basic Crud operation //

    // constructor
    VehicleInventoryManagement(List<Vehicle> vehicles){
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehicles(){
        return this.vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        this.vehicles.remove(vehicle);
    }
}
