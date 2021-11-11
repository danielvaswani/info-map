package com.infomap.mapservice.map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MapRepository extends JpaRepository<Map, Long> {

    Optional<Map> findMapByName(String name);
}
