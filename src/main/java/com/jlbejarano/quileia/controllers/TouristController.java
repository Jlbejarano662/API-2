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
    
    @Autowired
    TouristService touristService;

    @GetMapping("/findAll")
    public List<Tourist> findAll() {
        return touristService.findAll();
    }

    @GetMapping("/findById/{id}")
    public Optional<Tourist> findById(@PathVariable("id") Long id) {
        return touristService.findById(id);
    }

    @PostMapping
    public Tourist save(@RequestBody Tourist tourist) {
        return touristService.save(tourist);
    }

    @PutMapping
    public Tourist update(@RequestBody Tourist tourist) {
        return touristService.update(tourist);
    }

    @DeleteMapping("delete/{id}")
    public String delete( @PathVariable("id") Long id) {
        return touristService.delete(id) ? "The tourist "+id+" has been deleted"
                                                : "The tourist "+id+"  has not been deleted";
    }

}
