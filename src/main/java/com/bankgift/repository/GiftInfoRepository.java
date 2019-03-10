package com.bankgift.repository;

import com.bankgift.dataobject.GiftInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GiftInfoRepository extends JpaRepository<GiftInfo,String> {
    List<GiftInfo> findByGiftStatus(Integer giftStatus);

    List<GiftInfo> findByIsRecommend(Integer isRecommend);

    List<GiftInfo> findByBankId(Integer bankId);
}
