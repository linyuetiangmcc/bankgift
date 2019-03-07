package com.bankgift.repository;

import com.bankgift.dataobject.BankCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BankCategoryRepository extends JpaRepository<BankCategory,Integer>{
    List<BankCategory> findByBankNameIn(List<String> bankNameList);
}
