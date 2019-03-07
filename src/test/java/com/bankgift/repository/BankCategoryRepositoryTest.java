package com.bankgift.repository;

import com.bankgift.dataobject.BankCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

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

    @Test
    @Transactional
    public void saveTest(){
        BankCategory bankCategory = new BankCategory("test11");
        BankCategory result = repository.save(bankCategory);
        Assert.assertNotNull(result);

    }

    @Test
    public void findByBankNameInTest(){
        List<String> list = Arrays.asList("中行","工行");
        List<BankCategory> result = repository.findByBankNameIn(list);
        System.out.println(result.size());
        Assert.assertNotEquals(0,result.size());

    }
}