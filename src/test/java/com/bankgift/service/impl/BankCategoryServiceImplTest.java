package com.bankgift.service.impl;

import com.bankgift.dataobject.BankCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BankCategoryServiceImplTest {

    @Autowired
    private BankCategoryServiceImpl bankCategoryService;

    @Test
    public void findOne() {
        BankCategory bankCategory = bankCategoryService.findOne(3);
        Assert.assertEquals(new Integer(3),bankCategory.getBankId());
    }

    @Test
    public void findAll() {
        List<BankCategory> bankCategoryList = bankCategoryService.findAll();
        Assert.assertNotEquals(0,bankCategoryList.size());
    }

    @Test
    public void findByBankNameIn() {
        List<BankCategory> bankNameList = bankCategoryService.findByBankNameIn(Arrays.asList("中行","工行"));
        Assert.assertNotEquals(0,bankNameList.size());
    }

    @Test
    public void save() {
        BankCategory bankCategory = new BankCategory("test456");
        BankCategory result = bankCategoryService.save(bankCategory);
        Assert.assertNotNull(result);
    }
}