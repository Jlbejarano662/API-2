package com.jlbejarano.quileia.services;

import java.util.List;
import java.util.Optional;
import com.jlbejarano.quileia.entities.Tourist;

public interface TouristService {
    
    /**
     * Se encarga de obtener todos los turistas.
     * 
     * @return Una lista de todos los turistas registrados. En caso de no encontrar
     *         ningún turista, se retornará una lista vacía.
     */
    List<Tourist> findAll();

    /**
     * Se encarga de obtener un turista.
     * 
     * @param id Corresponde al id del turista a partir del cual se hará la búsqueda.
     * @return Un objeto de la clase Tourist con el id suministrado. En caso de no encontrar 
     *         ningún turista, se retornará un valor null.
     */
    Optional<Tourist> findById(Long id);

    /**
     * Permite guardar un turista.
     * 
     * @param tourist Corresponde a un objeto de la clase Tourist que va a ser guardado.
     * @return Objeto de la clase Tourist que ha sido guardado. En caso de no guardar 
     *         el objeto se retornará un valor null.
     */
    Tourist save(Tourist tourist);

    /**
     * Permite cambiar los datos de turista.
     * 
     * @param tourist Corresponde a un objeto de la clase Tourist que ha sido modificado.
     * @return Objeto de la clase Tourist modificado. En caso de no guardar los cambios se 
     *         retornará un valor null.
     */
    Tourist update(Tourist tourist);

    /**
     * Permite eliminar un turista.
     * 
     * @param id Corresponde al id del turista que a eliminar.
     * @return Un Boolean true cuando se ha eliminado el turista exítosamente o false en caso contrario.
     */
    Boolean delete(Long id);

}
