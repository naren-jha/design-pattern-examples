package com.narenjha.dp.strategy.example.vehiclerenting.booking;

import com.narenjha.dp.strategy.example.vehiclerenting.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookingRepository {

    @Autowired
    private Database db;

    public void addBooking(Booking booking) {
        db.addBooking(booking);
    }
}
