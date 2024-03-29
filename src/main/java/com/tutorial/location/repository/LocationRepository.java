package com.tutorial.location.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tutorial.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {
	
	@Query("select type, count(type) from Location group by type")
	public List<Object[]> findTypeAndTypeCount();

}
