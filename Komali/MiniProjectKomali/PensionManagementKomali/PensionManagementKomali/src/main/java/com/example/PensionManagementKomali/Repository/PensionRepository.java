package com.example.PensionManagementKomali.Repository;

import com.example.PensionManagementKomali.model.Pension;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PensionRepository extends CrudRepository<Pension, Integer> {
}