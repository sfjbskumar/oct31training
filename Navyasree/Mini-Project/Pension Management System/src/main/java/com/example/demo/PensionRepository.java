package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("pensionRepo")
public interface PensionRepository extends JpaRepository<PensionManagemetSys,Integer> {
    @Query("select empstatus from pension_managemet_sys where id=?1")
    String getEmpStatus(int id);

    @Query("select pensionstatus from pension_managemet_sys where id=?1")
    String getPensionStatus(int id);

    @Query("select balanceamount from pension_managemet_sys where id=?1")
    String getBalance(int id);

    @Query("select installment from pension_managemet_sys where id=?1")
    String getInstallment(int id);

    @Query("select pensionmmyy from pension_managemet_sys where id=?1")
    String getPensionMMYY(int id);

    @Modifying
    @Query("update pension_managemet_sys pd set pd.balanceamount=pd.balanceamount-pd.installment, pensionmmyy=?3 where pd.empstatus=?1 and pd.pensionstatus=?2 and pd.pensionmmyy LIKE ?4")
    void issuePension(String empstatus, String pensionstatus, String currentMMYY, String prevMMYY);

    @Modifying
    @Query("update  pension_managemet_sys pd set pd.balanceamount=pd.balanceamount+pd.installment, pensionmmyy=?3 where pd.empstatus=?1 and pd.pensionstatus=?2 and pd.pensionmmyy LIKE ?4")
    void loadPension(String empstatus, String pensionstatus, String currentMMYY, String prevMMYY);

}
