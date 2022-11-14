package com.example.PensionManagementNaveen.repository;

import com.example.PensionManagementNaveen.model.Pension;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PensionRepository extends CrudRepository<Pension,Integer> {
}
