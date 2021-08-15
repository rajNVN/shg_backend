package com.rajCo.shg.entities;

import java.math.BigDecimal;
import javax.annotation.Generated;

public class GroupUsers {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group_users.group_id")
    private Integer groupId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group_users.user_id")
    private Integer userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group_users.is_admin")
    private String isAdmin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group_users.savings_ammount")
    private BigDecimal savingsAmmount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group_users.group_id")
    public Integer getGroupId() {
        return groupId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group_users.group_id")
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group_users.user_id")
    public Integer getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group_users.user_id")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group_users.is_admin")
    public String getIsAdmin() {
        return isAdmin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group_users.is_admin")
    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group_users.savings_ammount")
    public BigDecimal getSavingsAmmount() {
        return savingsAmmount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group_users.savings_ammount")
    public void setSavingsAmmount(BigDecimal savingsAmmount) {
        this.savingsAmmount = savingsAmmount;
    }
}