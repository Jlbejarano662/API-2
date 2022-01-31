package com.jlbejarano.quileia.controllers;

import java.util.List;
import com.jlbejarano.quileia.entities.Booking;
import com.jlbejarano.quileia.services.BookingService;
//import com.jlbejarano.quileia.services.implementation.BookingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @GetMapping("/findAll")
    public List<Booking> findAll() {
        return bookingService.findAll();
    }

    @GetMapping("/findByTourist/{idTourist}")
    public List<Booking> findByIdTourist(@PathVariable("idTourist") Long idTourist) {
        return bookingService.findByIdTourist(idTourist);
    }

    @GetMapping("/findByCity/{idCity}")
    public List<Booking> findByIdCity(@PathVariable("idCity") Long idCity) {
        return bookingService.findByIdCity(idCity);
    }

    @PostMapping
    public Booking saveBooking( @RequestBody Booking booking) {
        return bookingService.save(booking);
    }

    @PutMapping
    public Booking update( @RequestBody Booking booking) {
        return bookingService.update(booking);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        return  bookingService.delete(id) ? "The booking "+id+" has been deleted"
                                                 : "The booking "+id+"  has not been deleted";
    }

}
