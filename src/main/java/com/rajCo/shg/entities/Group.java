package com.rajCo.shg.entities;

import java.math.BigDecimal;
import javax.annotation.Generated;

public class Group {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.group_id")
    private Integer groupId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.group_name")
    private String groupName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.savings_total")
    private BigDecimal savingsTotal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.loans_pending")
    private Integer loansPending;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.total_loans")
    private Integer totalLoans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.no_of_members")
    private Integer noOfMembers;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.min_savings")
    private BigDecimal minSavings;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.max_loan_allowed")
    private BigDecimal maxLoanAllowed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.savings_pay_ammount")
    private BigDecimal savingsPayAmmount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.loan_interest")
    private BigDecimal loanInterest;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.min_individual_savings")
    private BigDecimal minIndividualSavings;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.group_id")
    public Integer getGroupId() {
        return groupId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.group_id")
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.group_name")
    public String getGroupName() {
        return groupName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.group_name")
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.savings_total")
    public BigDecimal getSavingsTotal() {
        return savingsTotal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.savings_total")
    public void setSavingsTotal(BigDecimal savingsTotal) {
        this.savingsTotal = savingsTotal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.loans_pending")
    public Integer getLoansPending() {
        return loansPending;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.loans_pending")
    public void setLoansPending(Integer loansPending) {
        this.loansPending = loansPending;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.total_loans")
    public Integer getTotalLoans() {
        return totalLoans;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.total_loans")
    public void setTotalLoans(Integer totalLoans) {
        this.totalLoans = totalLoans;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.no_of_members")
    public Integer getNoOfMembers() {
        return noOfMembers;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.no_of_members")
    public void setNoOfMembers(Integer noOfMembers) {
        this.noOfMembers = noOfMembers;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.min_savings")
    public BigDecimal getMinSavings() {
        return minSavings;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.min_savings")
    public void setMinSavings(BigDecimal minSavings) {
        this.minSavings = minSavings;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.max_loan_allowed")
    public BigDecimal getMaxLoanAllowed() {
        return maxLoanAllowed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.max_loan_allowed")
    public void setMaxLoanAllowed(BigDecimal maxLoanAllowed) {
        this.maxLoanAllowed = maxLoanAllowed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.savings_pay_ammount")
    public BigDecimal getSavingsPayAmmount() {
        return savingsPayAmmount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.savings_pay_ammount")
    public void setSavingsPayAmmount(BigDecimal savingsPayAmmount) {
        this.savingsPayAmmount = savingsPayAmmount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.loan_interest")
    public BigDecimal getLoanInterest() {
        return loanInterest;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.loan_interest")
    public void setLoanInterest(BigDecimal loanInterest) {
        this.loanInterest = loanInterest;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.min_individual_savings")
    public BigDecimal getMinIndividualSavings() {
        return minIndividualSavings;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.min_individual_savings")
    public void setMinIndividualSavings(BigDecimal minIndividualSavings) {
        this.minIndividualSavings = minIndividualSavings;
    }
}