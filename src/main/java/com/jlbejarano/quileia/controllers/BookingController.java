package com.jlbejarano.quileia.controllers;

import java.util.List;
import com.jlbejarano.quileia.entities.Booking;
import com.jlbejarano.quileia.services.BookingService;
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

    private final BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    /**
     * Realiza una petición Get para obterner todas las reservas.
     * 
     * @return Una lista de todas las reservas realizadas. En caso de no encontrar
     *         ninguna reserva se retornará una lista vacía.
     */
    @GetMapping("/findAll")
    public List<Booking> findAll() {
        return bookingService.findAll();
    }

    /**
     * Realiza un petición de tipo Get para obtener las reservas de un turista.
     * 
     * @param idTourist Corresponde al id del turista a partir del cual se hará la búsqueda.
     * @return Una lista de reservas del turista con el id suministrado. En caso de no encontrar
     *         ninguna reserva se retornará una lista vacía.
     */
    @GetMapping("/findByTourist/{idTourist}")
    public List<Booking> findByIdTourist(@PathVariable("idTourist") Long idTourist) {
        return bookingService.findByIdTourist(idTourist);
    }

    /**
     * Realiza una peticion de tipo Get para obetener las reservas de una ciudad.
     * 
     * @param idCity Corresponde al id de la ciudad a partir de la cual se hará la búsqueda.
     * @return Una lista de reservas del ciudad con el id suministrado. En caso de no encontrar
     *         ninguna reserva se retornará una lista vacía.
     */
    @GetMapping("/findByCity/{idCity}")
    public List<Booking> findByIdCity(@PathVariable("idCity") Long idCity) {
        return bookingService.findByIdCity(idCity);
    }

    /**
     * Realiza una petición de tipo Post para guardar una reserva.
     * 
     * @param booking Corresponde a un objeto de la clase Booking que va a ser guardado.
     * @return Objeto de la clase Booking que ha sido guardado. En caso de no guardar el objeto 
     *         se retornará un null. 
     */
    @PostMapping
    public Booking saveBooking( @RequestBody Booking booking) {
        return bookingService.save(booking);
    }

    /**
     * Realiza un petición de tipo Put para realizar modificaciones a una reserva. 
     * 
     * @param booking Corresponde a un objeto de la clase Booking que ha sido modificado.
     * @return Objeto de la clase Booking modificado. En caso de no guardar los cambios se 
     *         retornará un valor null.
     */
    @PutMapping
    public Booking update( @RequestBody Booking booking) {
        return bookingService.update(booking);
    }

    /**
     * Realiza una petición de tipo Delete para eliminar una reserva.
     * 
     * @param id Correponde al id de la reserva que va a ser eliminada.
     * @return Un String que informa si se ha eliminado o nó la reserva indicada.
     */
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        if (Boolean.TRUE.equals(bookingService.delete(id))) {
            return "The booking "+id+" has been deleted";
        } else {
            return "The booking "+id+"  has not been deleted";
        }
    }

}
