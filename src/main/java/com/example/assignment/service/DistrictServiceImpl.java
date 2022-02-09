package com.example.assignment.service;

import com.example.assignment.entity.District;
import com.example.assignment.entity.Street;
import com.example.assignment.repository.DistrictRepository;
import com.example.assignment.repository.StreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {

    @Autowired
    DistrictRepository districtRepository;

    @Override
    public List<District> findAll() {
        return districtRepository.findAll();
    }
}
