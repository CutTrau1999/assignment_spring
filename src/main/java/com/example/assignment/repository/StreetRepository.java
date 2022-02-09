package com.example.assignment.repository;

import com.example.assignment.entity.Street;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface StreetRepository extends JpaRepository<Street , Integer> {
    @Query("SELECT s FROM Street s WHERE s.name LIKE %:name%")
    List<Street> searchStreetByName(String name);

}
