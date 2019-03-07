package com.bankgift.dataobject;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@DynamicUpdate
@Data
@Table(name = "bank_category")
public class BankCategory {
    @Id
    @GeneratedValue
    private Integer bankId;
    private String bankName;
    public BankCategory(String bankName) {
        this.bankName = bankName;
    }

    public BankCategory() {
    }
}
