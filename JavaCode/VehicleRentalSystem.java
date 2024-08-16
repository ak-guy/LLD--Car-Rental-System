package JavaCode;

import JavaCode.Store.Store;
import JavaCode.User.User;
import java.util.List;


public class VehicleRentalSystem {
    List<Store> stores;
    List<User> users;

    VehicleRentalSystem(List<Store> stores, List<User> users) {
        this.stores = stores;
        this.users = users;
    }

    public Store searchStore(Location location){
        // logic to get store based on location
        return this.stores.get(0);
    }

    public List<Store> getStores() {
        return this.stores;
    }

}
