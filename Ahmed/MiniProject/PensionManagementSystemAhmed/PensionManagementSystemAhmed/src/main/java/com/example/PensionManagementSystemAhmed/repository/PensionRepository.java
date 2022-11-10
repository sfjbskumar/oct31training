package com.example.PensionManagementSystemAhmed.repository;

import com.example.PensionManagementSystemAhmed.model.Pension;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PensionRepository extends CrudRepository<Pension, Integer> {
}
