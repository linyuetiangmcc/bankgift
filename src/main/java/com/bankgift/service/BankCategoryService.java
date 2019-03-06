package com.bankgift.service;

import com.bankgift.dataobject.BankCategory;

import java.util.List;

public interface BankCategoryService {
    BankCategory findOne(Integer bankId);
    List<BankCategory> findAll();
    List<BankCategory> findByBankNameIn(List<String> bankNameList);
    BankCategory save(BankCategory bankCategory);
}
