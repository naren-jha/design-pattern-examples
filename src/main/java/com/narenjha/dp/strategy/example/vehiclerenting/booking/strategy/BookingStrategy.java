package com.narenjha.dp.strategy.example.vehiclerenting.booking.strategy;

import com.narenjha.dp.strategy.example.vehiclerenting.vehicle.Vehicle;
import com.narenjha.dp.strategy.example.vehiclerenting.booking.dto.BookingDTO;

public interface BookingStrategy {

    Vehicle selectVehicle(BookingDTO bookingDTO);
    BookingStrategyType bookingStrategyType();
}
