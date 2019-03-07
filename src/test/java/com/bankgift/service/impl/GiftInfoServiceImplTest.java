package com.bankgift.service.impl;

import com.bankgift.dataobject.GiftInfo;
import com.bankgift.enums.GiftInfoStausEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GiftInfoServiceImplTest {
    @Autowired
    private GiftInfoServiceImpl giftInfoService;

    @Test
    public void fineOne() {
        GiftInfo giftInfo = giftInfoService.fineOne("1111");
        Assert.assertNotNull(giftInfo);
    }

    @Test
    public void findUpAll() {
        List<GiftInfo> giftInfoList = giftInfoService.findUpAll();
        Assert.assertNotEquals(0,giftInfoList.size());
    }

    @Test
    public void findAll() {
        PageRequest request = new PageRequest(0,2);
        Page<GiftInfo> giftInfoPage = giftInfoService.findAll(request);
        // System.out.println(giftInfoPage.getTotalElements());
        Assert.assertNotEquals(0,giftInfoPage.getTotalElements());
    }

    @Test
    public void save() {
        GiftInfo giftInfo = new GiftInfo();
        giftInfo.setGiftId("2222");
        giftInfo.setGiftName("锅");
        giftInfo.setActivityName("月月刷");
        giftInfo.setActivityDescription("每月刷10000");
        giftInfo.setActivityUrl("http://sina.com");
        giftInfo.setGiftIcon("sdfsdfsf");
        giftInfo.setBankId(0);
        giftInfo.setBankName("中行");
        Date now = new Date();
        giftInfo.setStartTime(now);
        giftInfo.setEndTime(now);
        giftInfo.setGiftStatus(GiftInfoStausEnum.DOWN.getCode());
        GiftInfo result  = giftInfoService.save(giftInfo);
        Assert.assertNotNull(result);
    }
}