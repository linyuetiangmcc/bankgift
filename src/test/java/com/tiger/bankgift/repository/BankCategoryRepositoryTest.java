package com.tiger.bankgift.repository;

import com.tiger.bankgift.dataobject.BankCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class BankCategoryRepositoryTest {
    @Autowired
    private BankCategoryRepository repository;

    @Test
    public void findOneTest(){
        BankCategory bankCategory = repository.findOne(1);
        System.out.println(bankCategory.toString());
    }

}