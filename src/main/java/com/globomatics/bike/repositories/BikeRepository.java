package com.globomatics.bike.repositories;

import com.globomatics.bike.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author M. Bunea
 */
public interface BikeRepository extends JpaRepository<Bike, Long> {
}
