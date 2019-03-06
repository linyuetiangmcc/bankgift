package com.bankgift.repository;

import com.bankgift.dataobject.GiftInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class GiftInfoRepositoryTest {

    @Autowired
    private GiftInfoRepository repository;

    @Test
    public void saveTest(){
        GiftInfo giftInfo = new GiftInfo();
        giftInfo.setGiftId("1111");
        giftInfo.setGiftName("锅");
        giftInfo.setActivityName("月月刷");
        giftInfo.setActivityDescription("每月刷10000");
        giftInfo.setActivityUrl("http://sina.com");
        giftInfo.setGiftIcon("sdfsdfsf");
        giftInfo.setBankId(8);
        giftInfo.setBankName("中行");
        Date now = new Date();
        giftInfo.setStartTime(now);
        giftInfo.setEndTime(now);
        giftInfo.setGiftStatus(0);

        GiftInfo result =  repository.save(giftInfo);
        Assert.assertNotNull(result);
        System.out.println(result.toString());
    }

    @Test
    public void findByGiftInfo() throws Exception{
        List<GiftInfo> giftInfoList = repository.findByGiftStatus(0);

        Assert.assertNotEquals(0,giftInfoList.size());



    }

}