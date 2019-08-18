package com.tutorial.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
