package com.mmwakio.springbasics.web;

import com.mmwakio.springbasics.entity.Guest;
import com.mmwakio.springbasics.service.ReservationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/guests")
public class GuestController {
    private final ReservationService reservationService;

    public GuestController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getGuests(Model model) {
        List<Guest> guestList = this.reservationService.getHotelGuests();
        model.addAttribute("guests", guestList);
        return "hotel-guests";
    }
}
