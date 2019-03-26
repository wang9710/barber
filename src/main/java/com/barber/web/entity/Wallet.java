package com.barber.web.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 客户钱包信息实体
 */
@Data
public class Wallet extends BaseEntity implements Serializable {
    private Integer id;
    //客户Id
    private Integer customerId;

    private BigDecimal currentAmt;
    //备注
    private String remark;

}
