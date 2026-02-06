package com.narenjha.dp.strategy.example.vehiclerenting.branch;

import com.narenjha.dp.strategy.example.vehiclerenting.vehicle.VehicleType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BranchPriceMapper {
    private Long id;
    private Branch branch;
    private VehicleType vehicleType;
    private Double price;
}
