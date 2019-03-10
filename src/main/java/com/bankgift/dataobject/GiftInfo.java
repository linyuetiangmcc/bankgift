package com.bankgift.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@DynamicUpdate
@Table(name = "gift_info")
public class GiftInfo {
    @Id
    private String giftId;

    private String giftName;

    private String activityName;

    private String activityDescription;

    private Date startTime;

    private Date endTime;

    private Integer bankId;

    private String bankName;

    private String activityUrl;

    private String giftIcon;

    private Integer giftStatus;

    private Integer isRecommend;
}
