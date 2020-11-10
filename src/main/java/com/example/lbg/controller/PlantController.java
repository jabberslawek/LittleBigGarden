package com.example.lbg.controller;

import com.example.lbg.service.PlantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/plants")
public class PlantController {

    private final PlantService plantService;
}
