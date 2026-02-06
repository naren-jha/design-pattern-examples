package com.narenjha.dp.strategy.example.vehiclerenting.booking.dto;

import com.narenjha.dp.strategy.example.vehiclerenting.branch.Branch;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookingResponse {
    private String vehicleNumber;
    private Branch branch;
    private String message;
}
