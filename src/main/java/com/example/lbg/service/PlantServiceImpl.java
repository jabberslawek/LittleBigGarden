package com.example.lbg.service;

import com.example.lbg.repository.PlantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlantServiceImpl {
    
    private final PlantRepository repository;
}
