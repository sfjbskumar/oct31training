package com.example.Pension.Managment.System.config;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PensionRepository extends CrudRepository<Pension,Integer>{
}
