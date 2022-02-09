package com.example.assignment.service;

import com.example.assignment.entity.District;
import com.example.assignment.entity.Street;

import java.util.List;
import java.util.Optional;

public interface DistrictService {
    List<District> findAll();
}
