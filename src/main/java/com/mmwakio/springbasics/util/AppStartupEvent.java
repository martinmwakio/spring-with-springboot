package com.mmwakio.springbasics.util;

import com.mmwakio.springbasics.dto.RoomReservation;
import com.mmwakio.springbasics.entity.Reservation;
import com.mmwakio.springbasics.service.ReservationService;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Date;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent> {

    private final ReservationService reservationService;
    private final DateUtils dateUtils;

    public AppStartupEvent(ReservationService reservationService, DateUtils dateUtils) {
        this.reservationService = reservationService;
        this.dateUtils = dateUtils;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        Date date = this.dateUtils.createDateFromDateString("2022-01-01");
        List<RoomReservation> reservationList = reservationService.getRoomReservationsForDate(date);
        //reservationList.forEach(System.out::println);
    }
}
