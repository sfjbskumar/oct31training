package com.example.pensionmanagement.repository;


import com.example.pensionmanagement.model.Pension;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PensionRepository extends CrudRepository<Pension, Integer> {
}