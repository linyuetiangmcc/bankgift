package com.tiger.bankgift.dataobject;



import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class BankCategory {
    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Id
    @GeneratedValue
    private Integer bankId;
    private String bankName;

    @Override
    public String toString() {
        return "BankCategory{" +
                "bankId=" + bankId +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}
