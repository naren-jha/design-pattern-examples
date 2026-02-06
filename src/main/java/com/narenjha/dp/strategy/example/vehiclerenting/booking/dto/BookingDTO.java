package com.narenjha.dp.strategy.example.vehiclerenting.booking.dto;

import com.narenjha.dp.strategy.example.vehiclerenting.vehicle.VehicleType;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class BookingDTO {
    private VehicleType vehicleType;
    private LocalDateTime from;
    private LocalDateTime to;
}
