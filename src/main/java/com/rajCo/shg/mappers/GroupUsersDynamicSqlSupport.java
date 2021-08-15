package com.rajCo.shg.mappers;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class GroupUsersDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group_users")
    public static final GroupUsers groupUsers = new GroupUsers();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group_users.group_id")
    public static final SqlColumn<Integer> groupId = groupUsers.groupId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group_users.user_id")
    public static final SqlColumn<Integer> userId = groupUsers.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group_users.is_admin")
    public static final SqlColumn<String> isAdmin = groupUsers.isAdmin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: group_users.savings_ammount")
    public static final SqlColumn<BigDecimal> savingsAmmount = groupUsers.savingsAmmount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group_users")
    public static final class GroupUsers extends SqlTable {
        public final SqlColumn<Integer> groupId = column("group_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> userId = column("user_id", JDBCType.INTEGER);

        public final SqlColumn<String> isAdmin = column("is_admin", JDBCType.CHAR);

        public final SqlColumn<BigDecimal> savingsAmmount = column("savings_ammount", JDBCType.DECIMAL);

        public GroupUsers() {
            super("group_users");
        }
    }
}