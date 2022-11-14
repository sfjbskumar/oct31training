package com.example.Pension.Managment.System;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PensionRepository extends CrudRepository<Pension, Integer> {
  /*  @Modifying
    @Query("update pensiondetails pd set pd.balance=pd.balance-pd.installment, pensionMMYY=?3 where pd.empStatus=?1 and pd.pensionStatus=?2 and pd.pensionMMYY LIKE ?4")
    void issuePension(String empStatus, String pensionStatus, String currentMMYY, String prevMMYY);
    @Modifying
    @Query("update pensiondetails pd set pd.balance=pd.balance+pd.installment, pensionMMYY=?3 where pd.empStatus=?1 and pd.pensionStatus=?2 and pd.pensionMMYY LIKE ?4")
    void loadPension(String empStatus, String pensionStatus, String currentMMYY, String prevMMYY);
*/
}

