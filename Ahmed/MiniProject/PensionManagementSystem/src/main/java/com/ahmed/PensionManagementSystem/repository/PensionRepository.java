package com.ahmed.PensionManagementSystem.repository;

import com.ahmed.PensionManagementSystem.model.Pension;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PensionRepository extends CrudRepository<Pension, Integer> {
}