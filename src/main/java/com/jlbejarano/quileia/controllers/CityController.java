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
    
    @Autowired
    CityService cityService;

    @GetMapping("/findAll")
    public List<City> findAll() {
        return cityService.findAll();
    }

    @GetMapping("findById/{id}")
    public Optional<City> findById(@PathVariable("id") Long id) {
        return cityService.findById(id);
    }

    @PostMapping
    public City save(@RequestBody City city) {
        return cityService.save(city);
    }

    @PutMapping
    public City update(@RequestBody City city) {
        return cityService.update(city);
    }

    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        return cityService.delete(id) ? "The city "+id+" has been deleted"
                                          : "The city "+id+"  has not been deleted";
    }

}
