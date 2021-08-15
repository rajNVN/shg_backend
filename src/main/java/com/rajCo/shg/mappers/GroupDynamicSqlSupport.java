package com.rajCo.shg.mappers;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class GroupDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group")
    public static final Group group = new Group();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.group_id")
    public static final SqlColumn<Integer> groupId = group.groupId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.group_name")
    public static final SqlColumn<String> groupName = group.groupName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.savings_total")
    public static final SqlColumn<BigDecimal> savingsTotal = group.savingsTotal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.loans_pending")
    public static final SqlColumn<Integer> loansPending = group.loansPending;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.total_loans")
    public static final SqlColumn<Integer> totalLoans = group.totalLoans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.no_of_members")
    public static final SqlColumn<Integer> noOfMembers = group.noOfMembers;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.min_savings")
    public static final SqlColumn<BigDecimal> minSavings = group.minSavings;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.max_loan_allowed")
    public static final SqlColumn<BigDecimal> maxLoanAllowed = group.maxLoanAllowed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.savings_pay_ammount")
    public static final SqlColumn<BigDecimal> savingsPayAmmount = group.savingsPayAmmount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.loan_interest")
    public static final SqlColumn<BigDecimal> loanInterest = group.loanInterest;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group.min_individual_savings")
    public static final SqlColumn<BigDecimal> minIndividualSavings = group.minIndividualSavings;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group")
    public static final class Group extends SqlTable {
        public final SqlColumn<Integer> groupId = column("group_id", JDBCType.INTEGER);

        public final SqlColumn<String> groupName = column("group_name", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> savingsTotal = column("savings_total", JDBCType.DECIMAL);

        public final SqlColumn<Integer> loansPending = column("loans_pending", JDBCType.INTEGER);

        public final SqlColumn<Integer> totalLoans = column("total_loans", JDBCType.INTEGER);

        public final SqlColumn<Integer> noOfMembers = column("no_of_members", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> minSavings = column("min_savings", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> maxLoanAllowed = column("max_loan_allowed", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> savingsPayAmmount = column("savings_pay_ammount", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> loanInterest = column("loan_interest", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> minIndividualSavings = column("min_individual_savings", JDBCType.DECIMAL);

        public Group() {
            super("group");
        }
    }
}