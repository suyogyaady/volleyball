package com.system.volleyball.Service;

import com.system.volleyball.Pojo.BookingPojo;
import com.system.volleyball.entity.Booking;

import java.sql.Date;
import java.util.List;

public interface BookingService {
    BookingPojo saveOrder(BookingPojo bookingPojo);
    List<Booking> fetchAll();

    void deleteById(Integer id);

    Booking fetchById(Integer id);

    List findBookingById(Integer id);
    List<String> bookedTime(Date date, Integer id);


    void processPasswordResetRequest(String email);

    void sendEmail();
}
