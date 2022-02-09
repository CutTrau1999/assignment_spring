package com.example.assignment.service;

import com.example.assignment.entity.Street;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface StreetService {
    Street save(Street street);

    Street update(Street street);

    List<Street> findAll();

    Optional<Street> findById(int id);

    boolean delete(Street street);

    List<Street> search(Street street);
}
