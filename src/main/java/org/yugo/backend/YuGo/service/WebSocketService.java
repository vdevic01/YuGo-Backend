package org.yugo.backend.YuGo.service;

public interface WebSocketService {
    void sendRideRequestToDriver(Integer driverID, Integer rideID);

    void notifyPassengerAboutRide(Integer rideID, Integer passengerID);
}
