package com.rajCo.shg.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;

public class Loan {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: loan.loan_id")
    private Integer loanId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: loan.user_id")
    private Integer userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: loan.group_id")
    private Integer groupId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: loan.status")
    private String status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: loan.remaining_ammount")
    private BigDecimal remainingAmmount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: loan.last_paid_date")
    private Date lastPaidDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: loan.loan_id")
    public Integer getLoanId() {
        return loanId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: loan.loan_id")
    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: loan.user_id")
    public Integer getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: loan.user_id")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: loan.group_id")
    public Integer getGroupId() {
        return groupId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: loan.group_id")
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: loan.status")
    public String getStatus() {
        return status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: loan.status")
    public void setStatus(String status) {
        this.status = status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: loan.remaining_ammount")
    public BigDecimal getRemainingAmmount() {
        return remainingAmmount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: loan.remaining_ammount")
    public void setRemainingAmmount(BigDecimal remainingAmmount) {
        this.remainingAmmount = remainingAmmount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: loan.last_paid_date")
    public Date getLastPaidDate() {
        return lastPaidDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: loan.last_paid_date")
    public void setLastPaidDate(Date lastPaidDate) {
        this.lastPaidDate = lastPaidDate;
    }
}