package com.rajCo.shg.mappers;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class LoanDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: loan")
    public static final Loan loan = new Loan();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: loan.loan_id")
    public static final SqlColumn<Integer> loanId = loan.loanId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: loan.user_id")
    public static final SqlColumn<Integer> userId = loan.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: loan.group_id")
    public static final SqlColumn<Integer> groupId = loan.groupId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: loan.status")
    public static final SqlColumn<String> status = loan.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: loan.remaining_ammount")
    public static final SqlColumn<BigDecimal> remainingAmmount = loan.remainingAmmount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: loan.last_paid_date")
    public static final SqlColumn<Date> lastPaidDate = loan.lastPaidDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: loan")
    public static final class Loan extends SqlTable {
        public final SqlColumn<Integer> loanId = column("loan_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> userId = column("user_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> groupId = column("group_id", JDBCType.INTEGER);

        public final SqlColumn<String> status = column("status", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> remainingAmmount = column("remaining_ammount", JDBCType.DECIMAL);

        public final SqlColumn<Date> lastPaidDate = column("last_paid_date", JDBCType.TIMESTAMP);

        public Loan() {
            super("loan");
        }
    }
}