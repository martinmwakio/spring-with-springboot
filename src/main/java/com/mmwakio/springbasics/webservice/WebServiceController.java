package com.mmwakio.springbasics.webservice;

import com.mmwakio.springbasics.dto.RoomReservation;
import com.mmwakio.springbasics.entity.Guest;
import com.mmwakio.springbasics.entity.Room;
import com.mmwakio.springbasics.service.ReservationService;
import com.mmwakio.springbasics.util.DateUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class WebServiceController {
    private final DateUtils dateUtils;
    private final ReservationService reservationService;

    public WebServiceController(DateUtils dateUtils, ReservationService reservationService) {
        this.dateUtils = dateUtils;
        this.reservationService = reservationService;
    }

    @RequestMapping(value = "/reservations", method = RequestMethod.GET)
    public List<RoomReservation> getRoomReservationsForDate(@RequestParam(value = "date", required = false) String dateString) {
        Date date = this.dateUtils.createDateFromDateString(dateString);
        return reservationService.getRoomReservationsForDate(date);
    }

    @GetMapping("/guests")
    public List<Guest> getGuests() {
        return this.reservationService.getHotelGuests();
    }

    @PostMapping("/guests")
    @ResponseStatus(HttpStatus.CREATED)/*http status code = 201*/
    public void addGuest(@RequestBody Guest guest) {
        this.reservationService.addGuest(guest);
    }

    @GetMapping(path = "/rooms")
    public List<Room> getRooms() {
        return this.reservationService.getRooms();
    }
}
