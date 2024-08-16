package java.Reservation;

import java.Product.Vehicle;
import java.User.User;
import java.util.Date;
import java.Location;

public class Reservation {
    int reservationID;
    User user;
    Vehicle vehicle;
    Date bookingDate;
    Date dateBookedFrom;
    Date dateBookedTo;
    Long fromTimeStamp;
    Long toTimeStamp;
    Location pickLocation;
    Location dropLocation;
    ReservationType reservationType;
    ReservationStatus reservationStatus;

    public Reservation(int reservationID, User user, Vehicle vehicle, Date bookingDate, Date dateBookedFrom,
            Date dateBookedTo, Long fromTimeStamp, Long toTimeStamp, Location pickLocation, Location dropLocation,
            ReservationType reservationType, ReservationStatus reservationStatus) {
        this.reservationID = reservationID;
        this.user = user;
        this.vehicle = vehicle;
        this.bookingDate = bookingDate;
        this.dateBookedFrom = dateBookedFrom;
        this.dateBookedTo = dateBookedTo;
        this.fromTimeStamp = fromTimeStamp;
        this.toTimeStamp = toTimeStamp;
        this.pickLocation = pickLocation;
        this.dropLocation = dropLocation;
        this.reservationType = reservationType;
        this.reservationStatus = reservationStatus;
    }
    
    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Date getDateBookedFrom() {
        return dateBookedFrom;
    }

    public void setDateBookedFrom(Date dateBookedFrom) {
        this.dateBookedFrom = dateBookedFrom;
    }

    public Date getDateBookedTo() {
        return dateBookedTo;
    }

    public void setDateBookedTo(Date dateBookedTo) {
        this.dateBookedTo = dateBookedTo;
    }

    public Long getFromTimeStamp() {
        return fromTimeStamp;
    }

    public void setFromTimeStamp(Long fromTimeStamp) {
        this.fromTimeStamp = fromTimeStamp;
    }

    public Long getToTimeStamp() {
        return toTimeStamp;
    }

    public void setToTimeStamp(Long toTimeStamp) {
        this.toTimeStamp = toTimeStamp;
    }

    public Location getPickLocation() {
        return pickLocation;
    }

    public void setPickLocation(Location pickLocation) {
        this.pickLocation = pickLocation;
    }

    public Location getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(Location dropLocation) {
        this.dropLocation = dropLocation;
    }
}
