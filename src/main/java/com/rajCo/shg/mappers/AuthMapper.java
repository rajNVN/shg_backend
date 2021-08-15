package com.rajCo.shg.mappers;

import static com.rajCo.shg.mappers.AuthDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.rajCo.shg.entities.Auth;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
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
public interface AuthMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: auth")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: auth")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: auth")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Auth> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: auth")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AuthResult")
    Auth selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: auth")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AuthResult", value = {
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_admin", property="isAdmin", jdbcType=JdbcType.TINYINT),
        @Result(column="question1", property="question1", jdbcType=JdbcType.VARCHAR),
        @Result(column="question2", property="question2", jdbcType=JdbcType.VARCHAR),
        @Result(column="question3", property="question3", jdbcType=JdbcType.VARCHAR),
        @Result(column="answer1", property="answer1", jdbcType=JdbcType.VARCHAR),
        @Result(column="answer2", property="answer2", jdbcType=JdbcType.VARCHAR),
        @Result(column="answer3", property="answer3", jdbcType=JdbcType.VARCHAR)
    })
    List<Auth> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: auth")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: auth")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(auth);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: auth")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, auth);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: auth")
    default int deleteByPrimaryKey(Integer userId_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, auth)
                .where(userId, isEqualTo(userId_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: auth")
    default int insert(Auth record) {
        return insert(SqlBuilder.insert(record)
                .into(auth)
                .map(userId).toProperty("userId")
                .map(username).toProperty("username")
                .map(password).toProperty("password")
                .map(isAdmin).toProperty("isAdmin")
                .map(question1).toProperty("question1")
                .map(question2).toProperty("question2")
                .map(question3).toProperty("question3")
                .map(answer1).toProperty("answer1")
                .map(answer2).toProperty("answer2")
                .map(answer3).toProperty("answer3")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: auth")
    default int insertSelective(Auth record) {
        return insert(SqlBuilder.insert(record)
                .into(auth)
                .map(userId).toPropertyWhenPresent("userId", record::getUserId)
                .map(username).toPropertyWhenPresent("username", record::getUsername)
                .map(password).toPropertyWhenPresent("password", record::getPassword)
                .map(isAdmin).toPropertyWhenPresent("isAdmin", record::getIsAdmin)
                .map(question1).toPropertyWhenPresent("question1", record::getQuestion1)
                .map(question2).toPropertyWhenPresent("question2", record::getQuestion2)
                .map(question3).toPropertyWhenPresent("question3", record::getQuestion3)
                .map(answer1).toPropertyWhenPresent("answer1", record::getAnswer1)
                .map(answer2).toPropertyWhenPresent("answer2", record::getAnswer2)
                .map(answer3).toPropertyWhenPresent("answer3", record::getAnswer3)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: auth")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Auth>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, userId, username, password, isAdmin, question1, question2, question3, answer1, answer2, answer3)
                .from(auth);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: auth")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Auth>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, userId, username, password, isAdmin, question1, question2, question3, answer1, answer2, answer3)
                .from(auth);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: auth")
    default Auth selectByPrimaryKey(Integer userId_) {
        return SelectDSL.selectWithMapper(this::selectOne, userId, username, password, isAdmin, question1, question2, question3, answer1, answer2, answer3)
                .from(auth)
                .where(userId, isEqualTo(userId_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: auth")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Auth record) {
        return UpdateDSL.updateWithMapper(this::update, auth)
                .set(userId).equalTo(record::getUserId)
                .set(username).equalTo(record::getUsername)
                .set(password).equalTo(record::getPassword)
                .set(isAdmin).equalTo(record::getIsAdmin)
                .set(question1).equalTo(record::getQuestion1)
                .set(question2).equalTo(record::getQuestion2)
                .set(question3).equalTo(record::getQuestion3)
                .set(answer1).equalTo(record::getAnswer1)
                .set(answer2).equalTo(record::getAnswer2)
                .set(answer3).equalTo(record::getAnswer3);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: auth")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Auth record) {
        return UpdateDSL.updateWithMapper(this::update, auth)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(username).equalToWhenPresent(record::getUsername)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(isAdmin).equalToWhenPresent(record::getIsAdmin)
                .set(question1).equalToWhenPresent(record::getQuestion1)
                .set(question2).equalToWhenPresent(record::getQuestion2)
                .set(question3).equalToWhenPresent(record::getQuestion3)
                .set(answer1).equalToWhenPresent(record::getAnswer1)
                .set(answer2).equalToWhenPresent(record::getAnswer2)
                .set(answer3).equalToWhenPresent(record::getAnswer3);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: auth")
    default int updateByPrimaryKey(Auth record) {
        return UpdateDSL.updateWithMapper(this::update, auth)
                .set(username).equalTo(record::getUsername)
                .set(password).equalTo(record::getPassword)
                .set(isAdmin).equalTo(record::getIsAdmin)
                .set(question1).equalTo(record::getQuestion1)
                .set(question2).equalTo(record::getQuestion2)
                .set(question3).equalTo(record::getQuestion3)
                .set(answer1).equalTo(record::getAnswer1)
                .set(answer2).equalTo(record::getAnswer2)
                .set(answer3).equalTo(record::getAnswer3)
                .where(userId, isEqualTo(record::getUserId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: auth")
    default int updateByPrimaryKeySelective(Auth record) {
        return UpdateDSL.updateWithMapper(this::update, auth)
                .set(username).equalToWhenPresent(record::getUsername)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(isAdmin).equalToWhenPresent(record::getIsAdmin)
                .set(question1).equalToWhenPresent(record::getQuestion1)
                .set(question2).equalToWhenPresent(record::getQuestion2)
                .set(question3).equalToWhenPresent(record::getQuestion3)
                .set(answer1).equalToWhenPresent(record::getAnswer1)
                .set(answer2).equalToWhenPresent(record::getAnswer2)
                .set(answer3).equalToWhenPresent(record::getAnswer3)
                .where(userId, isEqualTo(record::getUserId))
                .build()
                .execute();
    }
}