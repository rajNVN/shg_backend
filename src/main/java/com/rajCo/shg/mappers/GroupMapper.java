package com.rajCo.shg.mappers;

import static com.rajCo.shg.mappers.GroupDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.rajCo.shg.entities.Group;
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
public interface GroupMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Group> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("GroupResult")
    Group selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="GroupResult", value = {
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="group_name", property="groupName", jdbcType=JdbcType.VARCHAR),
        @Result(column="savings_total", property="savingsTotal", jdbcType=JdbcType.DECIMAL),
        @Result(column="loans_pending", property="loansPending", jdbcType=JdbcType.INTEGER),
        @Result(column="total_loans", property="totalLoans", jdbcType=JdbcType.INTEGER),
        @Result(column="no_of_members", property="noOfMembers", jdbcType=JdbcType.INTEGER),
        @Result(column="min_savings", property="minSavings", jdbcType=JdbcType.DECIMAL),
        @Result(column="max_loan_allowed", property="maxLoanAllowed", jdbcType=JdbcType.DECIMAL),
        @Result(column="savings_pay_ammount", property="savingsPayAmmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="loan_interest", property="loanInterest", jdbcType=JdbcType.DECIMAL),
        @Result(column="min_individual_savings", property="minIndividualSavings", jdbcType=JdbcType.DECIMAL)
    })
    List<Group> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(group);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, group);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group")
    default int deleteByPrimaryKey(Integer groupId_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, group)
                .where(groupId, isEqualTo(groupId_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group")
    default int insert(Group record) {
        return insert(SqlBuilder.insert(record)
                .into(group)
                .map(groupId).toProperty("groupId")
                .map(groupName).toProperty("groupName")
                .map(savingsTotal).toProperty("savingsTotal")
                .map(loansPending).toProperty("loansPending")
                .map(totalLoans).toProperty("totalLoans")
                .map(noOfMembers).toProperty("noOfMembers")
                .map(minSavings).toProperty("minSavings")
                .map(maxLoanAllowed).toProperty("maxLoanAllowed")
                .map(savingsPayAmmount).toProperty("savingsPayAmmount")
                .map(loanInterest).toProperty("loanInterest")
                .map(minIndividualSavings).toProperty("minIndividualSavings")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group")
    default int insertSelective(Group record) {
        return insert(SqlBuilder.insert(record)
                .into(group)
                .map(groupId).toPropertyWhenPresent("groupId", record::getGroupId)
                .map(groupName).toPropertyWhenPresent("groupName", record::getGroupName)
                .map(savingsTotal).toPropertyWhenPresent("savingsTotal", record::getSavingsTotal)
                .map(loansPending).toPropertyWhenPresent("loansPending", record::getLoansPending)
                .map(totalLoans).toPropertyWhenPresent("totalLoans", record::getTotalLoans)
                .map(noOfMembers).toPropertyWhenPresent("noOfMembers", record::getNoOfMembers)
                .map(minSavings).toPropertyWhenPresent("minSavings", record::getMinSavings)
                .map(maxLoanAllowed).toPropertyWhenPresent("maxLoanAllowed", record::getMaxLoanAllowed)
                .map(savingsPayAmmount).toPropertyWhenPresent("savingsPayAmmount", record::getSavingsPayAmmount)
                .map(loanInterest).toPropertyWhenPresent("loanInterest", record::getLoanInterest)
                .map(minIndividualSavings).toPropertyWhenPresent("minIndividualSavings", record::getMinIndividualSavings)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Group>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, groupId, groupName, savingsTotal, loansPending, totalLoans, noOfMembers, minSavings, maxLoanAllowed, savingsPayAmmount, loanInterest, minIndividualSavings)
                .from(group);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Group>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, groupId, groupName, savingsTotal, loansPending, totalLoans, noOfMembers, minSavings, maxLoanAllowed, savingsPayAmmount, loanInterest, minIndividualSavings)
                .from(group);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group")
    default Group selectByPrimaryKey(Integer groupId_) {
        return SelectDSL.selectWithMapper(this::selectOne, groupId, groupName, savingsTotal, loansPending, totalLoans, noOfMembers, minSavings, maxLoanAllowed, savingsPayAmmount, loanInterest, minIndividualSavings)
                .from(group)
                .where(groupId, isEqualTo(groupId_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Group record) {
        return UpdateDSL.updateWithMapper(this::update, group)
                .set(groupId).equalTo(record::getGroupId)
                .set(groupName).equalTo(record::getGroupName)
                .set(savingsTotal).equalTo(record::getSavingsTotal)
                .set(loansPending).equalTo(record::getLoansPending)
                .set(totalLoans).equalTo(record::getTotalLoans)
                .set(noOfMembers).equalTo(record::getNoOfMembers)
                .set(minSavings).equalTo(record::getMinSavings)
                .set(maxLoanAllowed).equalTo(record::getMaxLoanAllowed)
                .set(savingsPayAmmount).equalTo(record::getSavingsPayAmmount)
                .set(loanInterest).equalTo(record::getLoanInterest)
                .set(minIndividualSavings).equalTo(record::getMinIndividualSavings);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Group record) {
        return UpdateDSL.updateWithMapper(this::update, group)
                .set(groupId).equalToWhenPresent(record::getGroupId)
                .set(groupName).equalToWhenPresent(record::getGroupName)
                .set(savingsTotal).equalToWhenPresent(record::getSavingsTotal)
                .set(loansPending).equalToWhenPresent(record::getLoansPending)
                .set(totalLoans).equalToWhenPresent(record::getTotalLoans)
                .set(noOfMembers).equalToWhenPresent(record::getNoOfMembers)
                .set(minSavings).equalToWhenPresent(record::getMinSavings)
                .set(maxLoanAllowed).equalToWhenPresent(record::getMaxLoanAllowed)
                .set(savingsPayAmmount).equalToWhenPresent(record::getSavingsPayAmmount)
                .set(loanInterest).equalToWhenPresent(record::getLoanInterest)
                .set(minIndividualSavings).equalToWhenPresent(record::getMinIndividualSavings);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group")
    default int updateByPrimaryKey(Group record) {
        return UpdateDSL.updateWithMapper(this::update, group)
                .set(groupName).equalTo(record::getGroupName)
                .set(savingsTotal).equalTo(record::getSavingsTotal)
                .set(loansPending).equalTo(record::getLoansPending)
                .set(totalLoans).equalTo(record::getTotalLoans)
                .set(noOfMembers).equalTo(record::getNoOfMembers)
                .set(minSavings).equalTo(record::getMinSavings)
                .set(maxLoanAllowed).equalTo(record::getMaxLoanAllowed)
                .set(savingsPayAmmount).equalTo(record::getSavingsPayAmmount)
                .set(loanInterest).equalTo(record::getLoanInterest)
                .set(minIndividualSavings).equalTo(record::getMinIndividualSavings)
                .where(groupId, isEqualTo(record::getGroupId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: group")
    default int updateByPrimaryKeySelective(Group record) {
        return UpdateDSL.updateWithMapper(this::update, group)
                .set(groupName).equalToWhenPresent(record::getGroupName)
                .set(savingsTotal).equalToWhenPresent(record::getSavingsTotal)
                .set(loansPending).equalToWhenPresent(record::getLoansPending)
                .set(totalLoans).equalToWhenPresent(record::getTotalLoans)
                .set(noOfMembers).equalToWhenPresent(record::getNoOfMembers)
                .set(minSavings).equalToWhenPresent(record::getMinSavings)
                .set(maxLoanAllowed).equalToWhenPresent(record::getMaxLoanAllowed)
                .set(savingsPayAmmount).equalToWhenPresent(record::getSavingsPayAmmount)
                .set(loanInterest).equalToWhenPresent(record::getLoanInterest)
                .set(minIndividualSavings).equalToWhenPresent(record::getMinIndividualSavings)
                .where(groupId, isEqualTo(record::getGroupId))
                .build()
                .execute();
    }
}