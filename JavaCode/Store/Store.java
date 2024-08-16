package JavaCode.Store;

import JavaCode.Location;
import JavaCode.VehicleReservation.Reservation;
import JavaCode.Product.Vehicle;
import JavaCode.Product.VehicleType;

import java.util.List;
import java.util.ArrayList;
import JavaCode.User.User;


public class Store {

    int storeID;
    VehicleInventoryManagement vehicleInventory;
    Location storeLocation;
    List<Reservation> reservation = new ArrayList<>();

    public void setVehicles(List<Vehicle> vehicles) {
        vehicleInventory = new VehicleInventoryManagement(vehicles); 
    }

    public List<Vehicle> getVehicles(VehicleType vehicleType) {
        return vehicleInventory.getVehicles(vehicleType);
    }

    public void addVehicle(Vehicle vehicle){
        vehicleInventory.addVehicle(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        vehicleInventory.removeVehicle(vehicle);
    }

    public Reservation createReservation(Vehicle vehicle, User user) {
        Reservation reservation_obj = new Reservation();
        reservation_obj.setReservationID(123);
        reservation_obj.setVehicle(vehicle);
        reservation_obj.setUser(user);
        reservation.add(reservation_obj);
        return reservation_obj;
    }

    public boolean completeReservation(int reservationID) {
        // flow to handle once vehicle is returned to Rental System
        return true;
    }
}
