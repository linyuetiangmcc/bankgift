package com.bankgift.controller;

import com.bankgift.dataobject.BankCategory;
import com.bankgift.dataobject.GiftInfo;
import com.bankgift.service.impl.BankCategoryServiceImpl;
import com.bankgift.service.impl.GiftInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/giftinfo")
public class GiftInfoController {
    @Autowired
    private BankCategoryServiceImpl bankCategoryService;
    @Autowired
    private GiftInfoServiceImpl giftInfoService;

    @GetMapping("/list")
    public ModelAndView list(@RequestParam(value = "bankId", defaultValue = "0") Integer bankId,
                             @RequestParam(value = "isRecommend", defaultValue = "1") Integer isRecommend,
                             Map<String, Object> map) {
        //1. list all bank
        List<BankCategory> bankCategoryList = bankCategoryService.findAll();
        map.put("bankCategoryList", bankCategoryList);

        List<GiftInfo> giftInfoList;

        //2.列表为推荐
        if (bankId == 0) {
            giftInfoList = giftInfoService.findByIsRecommend(1);
        } else
            giftInfoList = giftInfoService.findByBankId(bankId);

        map.put("giftInfoList", giftInfoList);

        return new ModelAndView("giftinfo/list");
    }

    @GetMapping("/test")
    public ModelAndView test() {
        return new ModelAndView("giftinfo/test");
    }
}
