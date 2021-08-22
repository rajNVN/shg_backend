package com.rajCo.shg.mappers;

import static com.rajCo.shg.mappers.MembersDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.rajCo.shg.entities.Members;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.DeleteDSL;
import org.mybatis.dynamic.sql.delete.MyBatis3DeleteModelAdapter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.MyBatis3SelectModelAdapter;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSL;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.MyBatis3UpdateModelAdapter;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

@Mapper
public interface MembersMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: members")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: members")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: members")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="select max(user_id) +1 from members", keyProperty="record.userId", before=true, resultType=Integer.class)
    int insert(InsertStatementProvider<Members> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: members")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MembersResult")
    Members selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: members")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MembersResult", value = {
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="mail", property="mail", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="dob", property="dob", jdbcType=JdbcType.DATE),
        @Result(column="occupation", property="occupation", jdbcType=JdbcType.VARCHAR),
        @Result(column="father_name", property="fatherName", jdbcType=JdbcType.VARCHAR),
        @Result(column="identity_number", property="identityNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="identity_type", property="identityType", jdbcType=JdbcType.VARCHAR),
        @Result(column="gender", property="gender", jdbcType=JdbcType.VARCHAR),
        @Result(column="marital_status", property="maritalStatus", jdbcType=JdbcType.VARCHAR)
    })
    List<Members> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: members")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: members")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(members);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: members")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, members);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: members")
    default int deleteByPrimaryKey(Integer userId_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, members)
                .where(userId, isEqualTo(userId_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: members")
    default int insert(Members record) {
        return insert(SqlBuilder.insert(record)
                .into(members)
                .map(userId).toProperty("userId")
                .map(name).toProperty("name")
                .map(phone).toProperty("phone")
                .map(mail).toProperty("mail")
                .map(address).toProperty("address")
                .map(dob).toProperty("dob")
                .map(occupation).toProperty("occupation")
                .map(fatherName).toProperty("fatherName")
                .map(identityNumber).toProperty("identityNumber")
                .map(identityType).toProperty("identityType")
                .map(gender).toProperty("gender")
                .map(maritalStatus).toProperty("maritalStatus")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: members")
    default int insertSelective(Members record) {
        return insert(SqlBuilder.insert(record)
                .into(members)
                .map(userId).toProperty("userId")
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(phone).toPropertyWhenPresent("phone", record::getPhone)
                .map(mail).toPropertyWhenPresent("mail", record::getMail)
                .map(address).toPropertyWhenPresent("address", record::getAddress)
                .map(dob).toPropertyWhenPresent("dob", record::getDob)
                .map(occupation).toPropertyWhenPresent("occupation", record::getOccupation)
                .map(fatherName).toPropertyWhenPresent("fatherName", record::getFatherName)
                .map(identityNumber).toPropertyWhenPresent("identityNumber", record::getIdentityNumber)
                .map(identityType).toPropertyWhenPresent("identityType", record::getIdentityType)
                .map(gender).toPropertyWhenPresent("gender", record::getGender)
                .map(maritalStatus).toPropertyWhenPresent("maritalStatus", record::getMaritalStatus)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: members")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Members>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, userId, name, phone, mail, address, dob, occupation, fatherName, identityNumber, identityType, gender, maritalStatus)
                .from(members);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: members")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Members>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, userId, name, phone, mail, address, dob, occupation, fatherName, identityNumber, identityType, gender, maritalStatus)
                .from(members);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: members")
    default Members selectByPrimaryKey(Integer userId_) {
        return SelectDSL.selectWithMapper(this::selectOne, userId, name, phone, mail, address, dob, occupation, fatherName, identityNumber, identityType, gender, maritalStatus)
                .from(members)
                .where(userId, isEqualTo(userId_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: members")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Members record) {
        return UpdateDSL.updateWithMapper(this::update, members)
                .set(userId).equalTo(record::getUserId)
                .set(name).equalTo(record::getName)
                .set(phone).equalTo(record::getPhone)
                .set(mail).equalTo(record::getMail)
                .set(address).equalTo(record::getAddress)
                .set(dob).equalTo(record::getDob)
                .set(occupation).equalTo(record::getOccupation)
                .set(fatherName).equalTo(record::getFatherName)
                .set(identityNumber).equalTo(record::getIdentityNumber)
                .set(identityType).equalTo(record::getIdentityType)
                .set(gender).equalTo(record::getGender)
                .set(maritalStatus).equalTo(record::getMaritalStatus);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: members")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Members record) {
        return UpdateDSL.updateWithMapper(this::update, members)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(name).equalToWhenPresent(record::getName)
                .set(phone).equalToWhenPresent(record::getPhone)
                .set(mail).equalToWhenPresent(record::getMail)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(dob).equalToWhenPresent(record::getDob)
                .set(occupation).equalToWhenPresent(record::getOccupation)
                .set(fatherName).equalToWhenPresent(record::getFatherName)
                .set(identityNumber).equalToWhenPresent(record::getIdentityNumber)
                .set(identityType).equalToWhenPresent(record::getIdentityType)
                .set(gender).equalToWhenPresent(record::getGender)
                .set(maritalStatus).equalToWhenPresent(record::getMaritalStatus);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: members")
    default int updateByPrimaryKey(Members record) {
        return UpdateDSL.updateWithMapper(this::update, members)
                .set(name).equalTo(record::getName)
                .set(phone).equalTo(record::getPhone)
                .set(mail).equalTo(record::getMail)
                .set(address).equalTo(record::getAddress)
                .set(dob).equalTo(record::getDob)
                .set(occupation).equalTo(record::getOccupation)
                .set(fatherName).equalTo(record::getFatherName)
                .set(identityNumber).equalTo(record::getIdentityNumber)
                .set(identityType).equalTo(record::getIdentityType)
                .set(gender).equalTo(record::getGender)
                .set(maritalStatus).equalTo(record::getMaritalStatus)
                .where(userId, isEqualTo(record::getUserId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: members")
    default int updateByPrimaryKeySelective(Members record) {
        return UpdateDSL.updateWithMapper(this::update, members)
                .set(name).equalToWhenPresent(record::getName)
                .set(phone).equalToWhenPresent(record::getPhone)
                .set(mail).equalToWhenPresent(record::getMail)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(dob).equalToWhenPresent(record::getDob)
                .set(occupation).equalToWhenPresent(record::getOccupation)
                .set(fatherName).equalToWhenPresent(record::getFatherName)
                .set(identityNumber).equalToWhenPresent(record::getIdentityNumber)
                .set(identityType).equalToWhenPresent(record::getIdentityType)
                .set(gender).equalToWhenPresent(record::getGender)
                .set(maritalStatus).equalToWhenPresent(record::getMaritalStatus)
                .where(userId, isEqualTo(record::getUserId))
                .build()
                .execute();
    }
}