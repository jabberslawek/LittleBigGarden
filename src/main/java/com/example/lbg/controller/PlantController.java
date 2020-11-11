package com.example.lbg.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

public class PlantController {
    @GetMapping(value = "/api/plants/{plantId}")
    public String getPlants(@PathVariable int plantId){
        return "plants " + plantId;
    }

}
