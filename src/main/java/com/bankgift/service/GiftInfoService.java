package com.bankgift.service;

import com.bankgift.dataobject.GiftInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface GiftInfoService {

    GiftInfo fineOne(String giftId);
    List<GiftInfo> findUpAll();
    Page<GiftInfo> findAll(Pageable pageable);
    GiftInfo save(GiftInfo giftInfo);

}
