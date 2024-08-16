import java.Location;
import java.Reservation.Reservation;
import java.Product.Vehicle;
import java.util.List;
import java.util.ArrayList;


public class Store {

    int storeID;
    VehicleInventoryManagement vehicleInventory;
    Location storeLocation;
    List<Reservation> reservation = new ArrayList<>();

    public List<Vehicle> getVehicles() {
        return vehicleInventory.getVehicles();
    }

    public void addVehicle(Vehicle vehicle){
        vehicleInventory.addVehicle(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        vehicleInventory.removeVehicle(vehicle);
    }


}
