package com.jlbejarano.quileia.services;

import java.util.List;
import com.jlbejarano.quileia.entities.Booking;

public interface BookingService {

    /**
     * Se encarga de obstener todas las reservas.
     * 
     * @return Una lista de todas las reservas realizadas. En caso de no encontrar
     *         ninguna reserva se retornanrá una lista vacía.
     */
    List<Booking> findAll();

    /**
     * Se encarga de obtener las reservas de un turista.
     * 
     * @param idTourist Corresponde al id del turista a partir del cual se hará la búsqueda.
     * @return Una lista de reservas del turista con el id suministrado. En caso de no encontrar
     *         ninguna reserva se retornanrá una lista vacía.
     */
    List<Booking> findByIdTourist(Long idTourist);

    /**
     * Se encarga de obtener las reservas de una ciudad.
     * 
     * @param idCity Corresponde al id de la ciudad a partir de la cual se hará la búsqueda.
     * @return Una lista de reservas del ciudad con el id suministrado. En caso de no encontrar
     *         ninguna reserva se retornanrá una lista vacía.
     */
    List<Booking> findByIdCity(Long idCity);

    /**
     * 
     * @param idCity
     * @param date
     * @param id
     * @return
     */
    int count(Long idCity,String date, Long id);

    /**
     * 
     * @param booking
     * @return
     */
    Booking save(Booking booking);

    /**
     * 
     * @param booking
     * @return
     */
    Booking update(Booking booking);

    /**
     * 
     * @param id
     * @return
     */
    Boolean delete(Long id);

}
