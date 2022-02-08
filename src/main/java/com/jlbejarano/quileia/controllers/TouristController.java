package com.jlbejarano.quileia.controllers;

import java.util.List;
import java.util.Optional;
import com.jlbejarano.quileia.entities.Tourist;
import com.jlbejarano.quileia.services.TouristService;
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
@RequestMapping("/tourist")
public class TouristController {
    
    private final TouristService touristService;

    @Autowired
    public TouristController(TouristService touristService) {
        this.touristService = touristService;
    }

    /**
     * Realiza una petición de tipo Get para obetener todos los turistas.
     * 
     * @return Una lista de todos los turistas registrados. En caso de no encontrar
     *         ningún turista, se retornará una lista vacía.
     */
    @GetMapping("/findAll")
    public List<Tourist> findAll() {
        return touristService.findAll();
    }

    /**
     * Realiza un petición de tipo Get para obtener un turista.
     * 
     * @param id  Corresponde al id del turista a partir del cual se hará la búsqueda.
     * @return Un objeto de la clase Tourist con el id suministrado. En caso de no encontrar 
     *         ningún turista, se retornará un valor null.
     */
    @GetMapping("/findById/{id}")
    public Optional<Tourist> findById(@PathVariable("id") Long id) {
        return touristService.findById(id);
    }

    /**
     * Realiza un petición de tipo Post para guardar un turista.
     * 
     * @param tourist Corresponde a un objeto de la clase Tourist que va a ser guardado.
     * @return Objeto de la clase Tourist que ha sido guardado. En caso de no guardar 
     *         el objeto se retornará un valor null.
     */
    @PostMapping
    public Tourist save(@RequestBody Tourist tourist) {
        return touristService.save(tourist);
    }

    /**
     * Realiza un petición de tipo Put para modificar un turista.
     * 
     * @param tourist Corresponde a un objeto de la clase Tourist que ha sido modificado.
     * @return  Objeto de la clase Tourist modificado. En caso de no guardar los cambios se 
     *         retornará un valor null.
     */
    @PutMapping
    public Tourist update(@RequestBody Tourist tourist) {
        return touristService.update(tourist);
    }

    /**
     * Realiza un petición de tipo Delete para eliminar un turista.
     * 
     * @param id Corresponde al id del turista que a eliminar.
     * @return Un String que informa si se ha eliminado o nó el turista indicado.
     */
    @DeleteMapping("delete/{id}")
    public String delete( @PathVariable("id") Long id) {
        if (Boolean.TRUE.equals(touristService.delete(id))) {
            return "The tourist "+id+" has been deleted";
        } else {
            return "The tourist "+id+"  has not been deleted";
        }
    }

}
