package JavaCode.Payment;

import JavaCode.VehicleReservation.Reservation;

public class Bill {
    Reservation reservation;
    int amount;
    boolean isBillPaid;

    public Bill(Reservation reservation) {
        this.reservation = reservation;
        this.amount = computeBillAgainstReservation(this.reservation);
        this.isBillPaid = false;
    }

    public int computeBillAgainstReservation(Reservation reservation){
        // logic for amount calculation using reservation object
        return 100;
    }

}
