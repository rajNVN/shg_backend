package com.rajCo.shg.mappers;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MembersDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: members")
    public static final Members members = new Members();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: members.user_id")
    public static final SqlColumn<Integer> userId = members.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: members.name")
    public static final SqlColumn<String> name = members.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: members.phone")
    public static final SqlColumn<String> phone = members.phone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: members.mail")
    public static final SqlColumn<String> mail = members.mail;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: members.address")
    public static final SqlColumn<String> address = members.address;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: members.dob")
    public static final SqlColumn<Date> dob = members.dob;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: members.occupation")
    public static final SqlColumn<String> occupation = members.occupation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: members.father_name")
    public static final SqlColumn<String> fatherName = members.fatherName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: members.identity_number")
    public static final SqlColumn<String> identityNumber = members.identityNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: members.identity_type")
    public static final SqlColumn<String> identityType = members.identityType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: members.gender")
    public static final SqlColumn<String> gender = members.gender;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: members.marital_status")
    public static final SqlColumn<String> maritalStatus = members.maritalStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: members")
    public static final class Members extends SqlTable {
        public final SqlColumn<Integer> userId = column("user_id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> phone = column("phone", JDBCType.VARCHAR);

        public final SqlColumn<String> mail = column("mail", JDBCType.VARCHAR);

        public final SqlColumn<String> address = column("address", JDBCType.VARCHAR);

        public final SqlColumn<Date> dob = column("dob", JDBCType.DATE);

        public final SqlColumn<String> occupation = column("occupation", JDBCType.VARCHAR);

        public final SqlColumn<String> fatherName = column("father_name", JDBCType.VARCHAR);

        public final SqlColumn<String> identityNumber = column("identity_number", JDBCType.VARCHAR);

        public final SqlColumn<String> identityType = column("identity_type", JDBCType.VARCHAR);

        public final SqlColumn<String> gender = column("gender", JDBCType.VARCHAR);

        public final SqlColumn<String> maritalStatus = column("marital_status", JDBCType.VARCHAR);

        public Members() {
            super("members");
        }
    }
}