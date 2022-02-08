package com.jlbejarano.quileia.controllers;

import java.util.List;
import java.util.Optional;
import com.jlbejarano.quileia.entities.City;
import com.jlbejarano.quileia.services.CityService;
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
@RequestMapping("/city")
public class CityController {

    private final CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }
    
    /**
     * Realiza un petición de tipo Get para obtener todas las ciudades.
     * 
     * @return Una lista de todas las ciudades registradas. En caso de no encontrar
     *         ninguna ciudad, se retornará una lista vacía.
     */
    @GetMapping("/findAll")
    public List<City> findAll() {
        return cityService.findAll();
    }

    /**
     * Realiza un petición de tipo Get para obtener una ciudad.
     * 
     * @param id corresponde al id de la ciudad a partir de la cual se realizará la búsqueda.
     * @return Un objeto de la clase City con el id suministrado. En caso de no encontrar
     *         ninguna ciudad, se retornará un valor null.
     */
    @GetMapping("findById/{id}")
    public Optional<City> findById(@PathVariable("id") Long id) {
        return cityService.findById(id);
    }

    /**
     * Realiza una petición de tipo Post para guardar una ciudad.
     * 
     * @param city Corresponde al objeto de la clase City que va ser guardado.
     * @return Objeto de la clase City que ha sido guardado. En caso de no guardar 
     *         el objeto se retornará un valor null.
     */
    @PostMapping
    public City save(@RequestBody City city) {
        return cityService.save(city);
    }

    /**
     * Realiza una petición de tipo Put para modificar una ciudad.
     * 
     * @param city Corresponde a un objeto de la clase City que ha sido modificado.
     * @return Objeto de la calse City modificado. En caso de no guardar los cambios se
     *         retornará un valor null.
     */
    @PutMapping
    public City update(@RequestBody City city) {
        return cityService.update(city);
    }

    /**
     * Realiza una petición de tipo Delete para eliminar una ciudad.
     * 
     * @param id Corresponde al id de la ciudad a eliminar.
     * @return Un String que informa si se ha eliminado o nó la ciudad indicada.
     */
    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        if (Boolean.TRUE.equals(cityService.delete(id))) {
            return "The city "+id+" has been deleted";
        } else {
            return "The city "+id+"  has not been deleted";
        }
    }

}
