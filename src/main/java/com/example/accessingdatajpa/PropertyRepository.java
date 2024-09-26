package com.example.accessingdatajpa;


import com.example.accessingdatajpa.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Long> {
}
