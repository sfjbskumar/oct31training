package com.example.projectMini.Mini;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface PensionRepository extends CrudRepository<Pension, Integer> {
    }

