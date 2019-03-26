package com.barber.web.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PeWallet {
    private Integer id;

    private Integer customerId;

    private Integer companiesId;

    private String opreationType;

    private BigDecimal currentAmt;

    private BigDecimal payAmt;

    private String bankCode;

    private String bankName;

    private String bankWaterNo;

    private String remark;

    private Date createtime;

    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCompaniesId() {
        return companiesId;
    }

    public void setCompaniesId(Integer companiesId) {
        this.companiesId = companiesId;
    }

    public String getOpreationType() {
        return opreationType;
    }

    public void setOpreationType(String opreationType) {
        this.opreationType = opreationType == null ? null : opreationType.trim();
    }

    public BigDecimal getCurrentAmt() {
        return currentAmt;
    }

    public void setCurrentAmt(BigDecimal currentAmt) {
        this.currentAmt = currentAmt;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankWaterNo() {
        return bankWaterNo;
    }

    public void setBankWaterNo(String bankWaterNo) {
        this.bankWaterNo = bankWaterNo == null ? null : bankWaterNo.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public BigDecimal getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(BigDecimal payAmt) {
        this.payAmt = payAmt;
    }
}