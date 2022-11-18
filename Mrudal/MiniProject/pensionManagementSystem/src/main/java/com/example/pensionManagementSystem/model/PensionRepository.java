package com.example.pensionManagementSystem.model;
import com.example.pensionManagementSystem.model.Pension;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository("pensionRepo")
public interface PensionRepository extends JpaRepository<Pension,Integer> {

    @Query("select empStatus from pension where id=?1")
    String getEmpStatus(int id);

    @Query("select pensionStatus from pension where id=?1")
    String getPensionStatus(int id);

    @Query("select balance from pension where id=?1")
    String getBalance(int id);

    @Query("select installment from pension where id=?1")
    String getInstallment(int id);

    @Query("select pensionMMYY from pension where id=?1")
    String getPensionMMYY(int id);

    @Modifying
    @Query("update pension pd set pd.balance=pd.balance-pd.installment, pensionMMYY=?3 where pd.empStatus=?1 and pd.pensionStatus=?2 and pd.pensionMMYY LIKE ?4")
    void issuePension(String empStatus, String pensionStatus, String currentMMYY, String prevMMYY);

    @Modifying
    @Query("update pension pd set pd.balance=pd.balance+pd.installment, pensionMMYY=?3 where pd.empStatus=?1 and pd.pensionStatus=?2 and pd.pensionMMYY LIKE ?4")
    void loadPension(String EmpStatus, String pensionStatus, String currentMMYY, String prevMMYY);
}
