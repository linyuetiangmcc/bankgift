package com.bankgift.service.impl;

import com.bankgift.dataobject.GiftInfo;
import com.bankgift.enums.GiftInfoStausEnum;
import com.bankgift.repository.GiftInfoRepository;
import com.bankgift.service.GiftInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GiftInfoServiceImpl implements GiftInfoService {
    @Autowired
    private GiftInfoRepository repository;

    @Override
    public GiftInfo fineOne(String giftId) {
        return repository.findOne(giftId);
    }

    @Override
    public List<GiftInfo> findUpAll() {
        return repository.findByGiftStatus(GiftInfoStausEnum.UP.getCode());
    }

    @Override
    public Page<GiftInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public GiftInfo save(GiftInfo giftInfo) {
        return repository.save(giftInfo);
    }
}
