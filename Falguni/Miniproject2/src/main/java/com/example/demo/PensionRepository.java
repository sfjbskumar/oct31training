package com.example.demo;

import com.example.demo.Pension;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//import java.lang.ref.Reference;

@Repository
public interface PensionRepository extends CrudRepository<Pension, Integer> {
        }
