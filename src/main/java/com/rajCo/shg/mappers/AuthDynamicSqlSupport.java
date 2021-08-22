package com.rajCo.shg.mappers;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AuthDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: auth")
    public static final Auth auth = new Auth();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: auth.user_id")
    public static final SqlColumn<Integer> userId = auth.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: auth.username")
    public static final SqlColumn<String> username = auth.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: auth.password")
    public static final SqlColumn<String> password = auth.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: auth.is_admin")
    public static final SqlColumn<Boolean> isAdmin = auth.isAdmin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: auth.question1")
    public static final SqlColumn<String> question1 = auth.question1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: auth.question2")
    public static final SqlColumn<String> question2 = auth.question2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: auth.question3")
    public static final SqlColumn<String> question3 = auth.question3;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: auth.answer1")
    public static final SqlColumn<String> answer1 = auth.answer1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: auth.answer2")
    public static final SqlColumn<String> answer2 = auth.answer2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: auth.answer3")
    public static final SqlColumn<String> answer3 = auth.answer3;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: auth")
    public static final class Auth extends SqlTable {
        public final SqlColumn<Integer> userId = column("user_id", JDBCType.INTEGER);

        public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> isAdmin = column("is_admin", JDBCType.TINYINT);

        public final SqlColumn<String> question1 = column("question1", JDBCType.VARCHAR);

        public final SqlColumn<String> question2 = column("question2", JDBCType.VARCHAR);

        public final SqlColumn<String> question3 = column("question3", JDBCType.VARCHAR);

        public final SqlColumn<String> answer1 = column("answer1", JDBCType.VARCHAR);

        public final SqlColumn<String> answer2 = column("answer2", JDBCType.VARCHAR);

        public final SqlColumn<String> answer3 = column("answer3", JDBCType.VARCHAR);

        public Auth() {
            super("auth");
        }
    }
}