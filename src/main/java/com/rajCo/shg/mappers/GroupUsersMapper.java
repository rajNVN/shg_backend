package com.rajCo.shg.mappers;

import static com.rajCo.shg.mappers.GroupUsersDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.rajCo.shg.entities.GroupUsers;
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
public interface GroupUsersMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group_users")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group_users")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group_users")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<GroupUsers> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group_users")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("GroupUsersResult")
    GroupUsers selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group_users")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="GroupUsersResult", value = {
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="is_admin", property="isAdmin", jdbcType=JdbcType.CHAR),
        @Result(column="savings_ammount", property="savingsAmmount", jdbcType=JdbcType.DECIMAL)
    })
    List<GroupUsers> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group_users")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group_users")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(groupUsers);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group_users")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, groupUsers);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group_users")
    default int deleteByPrimaryKey(Integer groupId_, Integer userId_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, groupUsers)
                .where(groupId, isEqualTo(groupId_))
                .and(userId, isEqualTo(userId_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group_users")
    default int insert(GroupUsers record) {
        return insert(SqlBuilder.insert(record)
                .into(groupUsers)
                .map(groupId).toProperty("groupId")
                .map(userId).toProperty("userId")
                .map(isAdmin).toProperty("isAdmin")
                .map(savingsAmmount).toProperty("savingsAmmount")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group_users")
    default int insertSelective(GroupUsers record) {
        return insert(SqlBuilder.insert(record)
                .into(groupUsers)
                .map(groupId).toPropertyWhenPresent("groupId", record::getGroupId)
                .map(userId).toPropertyWhenPresent("userId", record::getUserId)
                .map(isAdmin).toPropertyWhenPresent("isAdmin", record::getIsAdmin)
                .map(savingsAmmount).toPropertyWhenPresent("savingsAmmount", record::getSavingsAmmount)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group_users")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<GroupUsers>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, groupId, userId, isAdmin, savingsAmmount)
                .from(groupUsers);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group_users")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<GroupUsers>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, groupId, userId, isAdmin, savingsAmmount)
                .from(groupUsers);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group_users")
    default GroupUsers selectByPrimaryKey(Integer groupId_, Integer userId_) {
        return SelectDSL.selectWithMapper(this::selectOne, groupId, userId, isAdmin, savingsAmmount)
                .from(groupUsers)
                .where(groupId, isEqualTo(groupId_))
                .and(userId, isEqualTo(userId_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group_users")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(GroupUsers record) {
        return UpdateDSL.updateWithMapper(this::update, groupUsers)
                .set(groupId).equalTo(record::getGroupId)
                .set(userId).equalTo(record::getUserId)
                .set(isAdmin).equalTo(record::getIsAdmin)
                .set(savingsAmmount).equalTo(record::getSavingsAmmount);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group_users")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(GroupUsers record) {
        return UpdateDSL.updateWithMapper(this::update, groupUsers)
                .set(groupId).equalToWhenPresent(record::getGroupId)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(isAdmin).equalToWhenPresent(record::getIsAdmin)
                .set(savingsAmmount).equalToWhenPresent(record::getSavingsAmmount);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group_users")
    default int updateByPrimaryKey(GroupUsers record) {
        return UpdateDSL.updateWithMapper(this::update, groupUsers)
                .set(isAdmin).equalTo(record::getIsAdmin)
                .set(savingsAmmount).equalTo(record::getSavingsAmmount)
                .where(groupId, isEqualTo(record::getGroupId))
                .and(userId, isEqualTo(record::getUserId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group_users")
    default int updateByPrimaryKeySelective(GroupUsers record) {
        return UpdateDSL.updateWithMapper(this::update, groupUsers)
                .set(isAdmin).equalToWhenPresent(record::getIsAdmin)
                .set(savingsAmmount).equalToWhenPresent(record::getSavingsAmmount)
                .where(groupId, isEqualTo(record::getGroupId))
                .and(userId, isEqualTo(record::getUserId))
                .build()
                .execute();
    }
}