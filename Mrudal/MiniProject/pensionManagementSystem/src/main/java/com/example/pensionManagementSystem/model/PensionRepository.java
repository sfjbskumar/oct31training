package com.example.pensionManagementSystem.model;
import com.example.pensionManagementSystem.model.Pension;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PensionRepository extends CrudRepository <Pension,Integer>{
}
