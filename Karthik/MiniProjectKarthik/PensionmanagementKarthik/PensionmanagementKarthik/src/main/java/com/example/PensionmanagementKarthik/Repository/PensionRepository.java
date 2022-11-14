package com.example.PensionManagementSystem.Repository;
import com.example.PensionManagementSystem.Model.Pension;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PensionRepository extends CrudRepository<Pension, Integer> {
}



