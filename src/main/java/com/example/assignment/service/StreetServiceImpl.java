package com.example.assignment.service;

import com.example.assignment.entity.Street;
import com.example.assignment.repository.StreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StreetServiceImpl implements StreetService {
    @Autowired
    StreetRepository streetRepository;

    @Override
    public Street save(Street street) {
        return streetRepository.save(street);
    }

    @Override
    public Street update(Street street) {
        return streetRepository.save(street);
    }

    @Override
    public List<Street> findAll() {
        return streetRepository.findAll();
    }

    @Override
    public Optional<Street> findById(int id) {
        return streetRepository.findById(id);
    }

    @Override
    public boolean delete(Street street) {
        streetRepository.delete(street);
        return true;
    }

    @Override
    public List<Street> search(Street street) {
        return streetRepository.searchStreetByName(street.getName());
    }
}
