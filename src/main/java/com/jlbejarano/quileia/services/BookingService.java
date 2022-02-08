package com.jlbejarano.quileia.services;

import java.util.List;
import com.jlbejarano.quileia.entities.Booking;

public interface BookingService {

    /**
     * Se encarga de obtener todas las reservas.
     * 
     * @return Una lista de todas las reservas realizadas. En caso de no encontrar
     *         ninguna reserva se retornará una lista vacía.
     */
    List<Booking> findAll();

    /**
     * Se encarga de obtener las reservas de un turista.
     * 
     * @param idTourist Corresponde al id del turista a partir del cual se hará la búsqueda.
     * @return Una lista de reservas del turista con el id suministrado. En caso de no encontrar
     *         ninguna reserva se retornará una lista vacía.
     */
    List<Booking> findByIdTourist(Long idTourist);

    /**
     * Se encarga de obtener las reservas de una ciudad.
     * 
     * @param idCity Corresponde al id de la ciudad a partir de la cual se hará la búsqueda.
     * @return Una lista de reservas del ciudad con el id suministrado. En caso de no encontrar
     *         ninguna reserva se retornará una lista vacía.
     */
    List<Booking> findByIdCity(Long idCity);

    /**
     * Se encarga de contar la cantidad de reservas realizadas para una determinada fecha y ciudad, 
     * exectuando a la reserva que tenga por id el suministrado en este método.
     * 
     * @param idCity Corresponde al id de la ciudad a partir de la cual se va a contar las reservas.
     * @param date Corresponde a la fecha a partir de la cual se van a contar las reservas.
     * @param id Corresponde al id de la reserva que va a ser excluida de la consulta. En caso de no
     *           suministrarse ningun id, este por defecto será cero. 
     * @return Un número entero que correponde a la cantidad de reservas encontradas con los parámetros 
     *         descritos. 
     */
    int count(Long idCity,String date, Long id);

    /**
     * Permite guardar una reserva.
     * 
     * @param booking Corresponde a un objeto de la clase Booking que va a ser guardado.
     * @return Objeto de la clase Booking que ha sido guardado. En caso de no guardar el objeto 
     *         se retornará un null. 
     */
    Booking save(Booking booking);

    /**
     * Permite modificar los datos de una reserva. 
     * 
     * @param booking Corresponde a un objeto de la clase Booking que ha sido modificado.
     * @return Objeto de la clase Booking que ha sido modificado. En caso de no guardar los cambios se 
     *         retornará un valor null.
     */
    Booking update(Booking booking);

    /**
     * Permite eliminar una reserva.
     * 
     * @param id Correponde al id de la reserva que va a ser eliminada.
     * @return Un Booleano true cuando se ha eliminado la reserva exítosamente o false en caso contrario. 
     */
    Boolean delete(Long id);

}
