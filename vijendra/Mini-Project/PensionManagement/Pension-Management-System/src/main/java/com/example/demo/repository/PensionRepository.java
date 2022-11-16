package com.example.demo.repository;

import com.example.demo.service.Pension;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PensionRepository extends CrudRepository<Pension,Integer> {
}
