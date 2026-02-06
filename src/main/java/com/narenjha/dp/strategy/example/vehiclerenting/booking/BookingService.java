package com.narenjha.dp.strategy.example.vehiclerenting.booking;

import com.narenjha.dp.strategy.example.vehiclerenting.booking.dto.BookingDTO;
import com.narenjha.dp.strategy.example.vehiclerenting.booking.dto.BookingResponse;
import com.narenjha.dp.strategy.example.vehiclerenting.booking.strategy.BookingStrategy;
import com.narenjha.dp.strategy.example.vehiclerenting.booking.strategy.BookingStrategyType;
import com.narenjha.dp.strategy.example.vehiclerenting.booking.strategy.factory.BookingStrategyFactory;
import com.narenjha.dp.strategy.example.vehiclerenting.vehicle.Vehicle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Slf4j
@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private BookingStrategyFactory bookingStrategyFactory;

    public BookingResponse bookVehicle(BookingDTO bookingDTO) {
        BookingStrategy bookingStrategy = bookingStrategyFactory.getBookingStrategy(BookingStrategyType.LOWEST_PRICE);
        Vehicle selectedVehicle = bookingStrategy.selectVehicle(bookingDTO);

        BookingResponse bookingResponse = BookingResponse.builder().build();
        if (Objects.nonNull(selectedVehicle)) {
            bookingResponse.setVehicleNumber(selectedVehicle.getNumber());
            bookingResponse.setBranch(selectedVehicle.getBranch());
            bookingResponse.setMessage(String.format("%s from %s booked.",
                    bookingResponse.getVehicleNumber(), bookingResponse.getBranch().getName()));

            addBooking(bookingDTO, selectedVehicle);
        }
        else {
            bookingResponse.setMessage(String.format("NO %s AVAILABLE", bookingDTO.getVehicleType().toString()));
        }
        return bookingResponse;
    }

    public void addBooking(BookingDTO bookingDTO, Vehicle vehicle) {
        Booking booking = Booking
                .builder()
                .vehicle(vehicle)
                .from(bookingDTO.getFrom())
                .to(bookingDTO.getTo())
                .build();
        bookingRepository.addBooking(booking);
        vehicle.getBookings().add(booking);
    }
}
