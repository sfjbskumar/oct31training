package com.example.PensionManagmentLalitha.Repository;
import com.example.PensionManagmentLalitha.Model.Pension;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PensionRepository extends CrudRepository<Pension, Integer> {
}


