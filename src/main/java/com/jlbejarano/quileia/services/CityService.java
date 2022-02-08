package com.jlbejarano.quileia.services;

import java.util.List;
import java.util.Optional;
import com.jlbejarano.quileia.entities.City;

public interface CityService {
    
    /**
     * Se encarga de obtener todas las ciudades.
     * 
     * @return Una lista de todas la ciudades registradas. En caso de no encontrar
     *         ninguna ciudad, se retornará una lista vacía.
     */
    List<City> findAll();

    /**
     * Se encarga de obtener una ciudad.
     * 
     * @param id Correponde al id de la ciudad a partir de la cual se hará la búsqueda.
     * @return Un objeto de la clase City con el id suministrado. En caso de no encontrar
     *         ninguna ciudad, se retornará un valor null.
     */
    Optional<City> findById(Long id);

    /**
     * Permite guardar una ciuadad.
     * 
     * @param city correponde al objeto de la clase City que va a ser guardado.
     * @return Objeto de la clase City que ha sido guardado. En caso de no guardar 
     *         el objeto se retornará un valor null.
     */
    City save(City city);

    /**
     * Permite modificar los datos de una ciudad.
     * 
     * @param city Corresponde a un objeto de la clase City que ha sido modificado.
     * @return Objeto de la calse City modificado. En caso de no guardar los cambios se
     *         retornará un valor null.
     *         
     */
    City update(City city);

    /**
     * Permite eliminar una ciudad.
     * 
     * @param id Corresponde al id de la ciudad que va a ser eliminada.
     * @return Un Boolean true cuando se ha eliminado la ciudad exítosamente o false en caso contrario.
     */
    Boolean delete(Long id);

}
