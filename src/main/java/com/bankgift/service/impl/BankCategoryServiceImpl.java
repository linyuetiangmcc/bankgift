package com.bankgift.service.impl;

import com.bankgift.dataobject.BankCategory;
import com.bankgift.repository.BankCategoryRepository;
import com.bankgift.service.BankCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BankCategoryServiceImpl implements BankCategoryService {
    @Autowired
    private BankCategoryRepository repository;

    @Override
    public BankCategory findOne(Integer bankId) {
        return repository.findOne(bankId);
    }

    @Override
    public List<BankCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<BankCategory> findByBankNameIn(List<String> bankNameList) {
        return repository.findByBankNameIn(bankNameList);
    }

    @Override
    public BankCategory save(BankCategory bankCategory) {
        return repository.save(bankCategory);
    }
}
