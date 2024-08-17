package JavaCode;

import JavaCode.Store.Store;
import JavaCode.User.User;
import JavaCode.VehicleReservation.Reservation;

import java.util.List;
import java.util.ArrayList;
import JavaCode.Payment.Bill;
import JavaCode.Payment.Payment;
import JavaCode.Payment.PaymentDetail;
import JavaCode.Payment.PaymentFactory;
import JavaCode.Payment.PaymentMode;
import JavaCode.Product.Vehicle;
import JavaCode.Product.VehicleType;

public class Main {
    public static void main(String[] args) {
        // initial setup
        List<User> users = getUsers();
        List<Vehicle> vehicles = getVehicles();
        List<Store> stores = getStores(vehicles);

        VehicleRentalSystem system = new VehicleRentalSystem(stores, users);
        
        // user comes and searches for a store based on location
        User user = users.get(0);
        Location location = new Location("k-1/106", 122017, "Gurgaon", "Haryana", "India");
        Store store = system.searchStore(location);
        
        // getting all vehicles based on vehicle type
        List<Vehicle> availableVehicles = store.getVehicles(VehicleType.CAR);
        
        // creating reservation
        Reservation reservation = store.createReservation(availableVehicles.get(0), user);
        
        // generating bill
        Bill bill = new Bill(reservation);
        
        // paying bill
        PaymentFactory paymentFactoryObj = new PaymentFactory();
        Payment payment = paymentFactoryObj.getPaymentObject(PaymentMode.CREDITCARD);
        PaymentDetail paymentDetails = payment.payBill(bill);
        System.out.println("Payment details " + paymentDetails.toString());
        
        // trip completed, return vehicle and close reservation 
        store.completeReservation(123);

    }

    private static List<Store> getStores(List<Vehicle> vehicles) {
        List<Store> storeList = new ArrayList<>();
        Store storeObj1 = new Store();
        storeObj1.setVehicles(vehicles);
        storeList.add(storeObj1);

        return storeList;
    }

    private static List<Vehicle> getVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        Vehicle vehicleObj1 = new Vehicle();
        vehicleObj1.setVehicleID(1);
        vehicles.add(vehicleObj1);

        return vehicles;
    }

    private static List<User> getUsers() {
        List<User> userList = new ArrayList<>();
        User user1 = new User();
        user1.setDrivingLicense("DL-123");
        user1.setUserID(123456);
        user1.setUsername("Arpit");
        userList.add(user1);

        return userList;
    }
}
