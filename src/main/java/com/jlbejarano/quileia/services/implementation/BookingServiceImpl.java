package com.jlbejarano.quileia.services.implementation;

import java.util.List;
import com.jlbejarano.quileia.entities.Booking;
import com.jlbejarano.quileia.repositories.BookingRepository;
import com.jlbejarano.quileia.services.BookingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {

    private static final int COUNT = 5;

    private static final Logger LOGGER = LoggerFactory.getLogger(BookingServiceImpl.class);

    private final BookingRepository bookingRepository;
    
    @Autowired
    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }
    
    @Override
    public List<Booking> findAll() {
        return bookingRepository.findAll();
    }

    @Override
    public List<Booking> findByIdTourist(Long idTourist) {
        return bookingRepository.findByIdTourist(idTourist);
    }

    @Override
    public List<Booking> findByIdCity(Long idCity) {
        return bookingRepository.findByIdCity(idCity);
    }

    @Override
    public int count(Long idCity, String date, Long id ) {
        return bookingRepository.count(idCity, date, id);
    }

    @Override
    public Booking save(Booking booking) {
        int count = count(booking.getIdCity(), booking.getDate(), (long) 0);
        if (count <COUNT) {
            return bookingRepository.save(booking);
        }
        return null;
    }

    @Override
    public Booking update(Booking booking) {
        int count = count(booking.getIdCity(), booking.getDate(), booking.getId());
        if (count <COUNT) {
            return bookingRepository.save(booking);
        }
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        try {
            bookingRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            LOGGER.error(e.getMessage(),e);
            return false;
        }
    }
    
}
