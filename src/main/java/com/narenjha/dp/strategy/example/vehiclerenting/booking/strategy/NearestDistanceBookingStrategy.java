package com.narenjha.dp.strategy.example.vehiclerenting.booking.strategy;

import com.narenjha.dp.strategy.example.vehiclerenting.vehicle.Vehicle;
import com.narenjha.dp.strategy.example.vehiclerenting.booking.dto.BookingDTO;
import com.narenjha.dp.strategy.example.vehiclerenting.exception.NotImplementedBookingStrategyException;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Data
public class NearestDistanceBookingStrategy implements BookingStrategy {

    @Override
    public Vehicle selectVehicle(BookingDTO bookingDTO) {
        // TODO: to be implemented when needed
        throw new NotImplementedBookingStrategyException("NearestDistanceRentalStrategy is not yet supported.");
    }

    @Override
    public BookingStrategyType bookingStrategyType() {
        return BookingStrategyType.NEAREST_DISTANCE;
    }
}
