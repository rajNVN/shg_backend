package com.rajCo.shg.mappers;

import static com.rajCo.shg.mappers.LoanDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.rajCo.shg.entities.Loan;
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
public interface LoanMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: loan")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: loan")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: loan")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Loan> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: loan")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("LoanResult")
    Loan selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: loan")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="LoanResult", value = {
        @Result(column="loan_id", property="loanId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="remaining_ammount", property="remainingAmmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="last_paid_date", property="lastPaidDate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Loan> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: loan")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: loan")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(loan);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: loan")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, loan);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: loan")
    default int deleteByPrimaryKey(Integer loanId_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, loan)
                .where(loanId, isEqualTo(loanId_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: loan")
    default int insert(Loan record) {
        return insert(SqlBuilder.insert(record)
                .into(loan)
                .map(loanId).toProperty("loanId")
                .map(userId).toProperty("userId")
                .map(groupId).toProperty("groupId")
                .map(status).toProperty("status")
                .map(remainingAmmount).toProperty("remainingAmmount")
                .map(lastPaidDate).toProperty("lastPaidDate")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: loan")
    default int insertSelective(Loan record) {
        return insert(SqlBuilder.insert(record)
                .into(loan)
                .map(loanId).toPropertyWhenPresent("loanId", record::getLoanId)
                .map(userId).toPropertyWhenPresent("userId", record::getUserId)
                .map(groupId).toPropertyWhenPresent("groupId", record::getGroupId)
                .map(status).toPropertyWhenPresent("status", record::getStatus)
                .map(remainingAmmount).toPropertyWhenPresent("remainingAmmount", record::getRemainingAmmount)
                .map(lastPaidDate).toPropertyWhenPresent("lastPaidDate", record::getLastPaidDate)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: loan")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Loan>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, loanId, userId, groupId, status, remainingAmmount, lastPaidDate)
                .from(loan);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: loan")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Loan>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, loanId, userId, groupId, status, remainingAmmount, lastPaidDate)
                .from(loan);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: loan")
    default Loan selectByPrimaryKey(Integer loanId_) {
        return SelectDSL.selectWithMapper(this::selectOne, loanId, userId, groupId, status, remainingAmmount, lastPaidDate)
                .from(loan)
                .where(loanId, isEqualTo(loanId_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: loan")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Loan record) {
        return UpdateDSL.updateWithMapper(this::update, loan)
                .set(loanId).equalTo(record::getLoanId)
                .set(userId).equalTo(record::getUserId)
                .set(groupId).equalTo(record::getGroupId)
                .set(status).equalTo(record::getStatus)
                .set(remainingAmmount).equalTo(record::getRemainingAmmount)
                .set(lastPaidDate).equalTo(record::getLastPaidDate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: loan")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Loan record) {
        return UpdateDSL.updateWithMapper(this::update, loan)
                .set(loanId).equalToWhenPresent(record::getLoanId)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(groupId).equalToWhenPresent(record::getGroupId)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(remainingAmmount).equalToWhenPresent(record::getRemainingAmmount)
                .set(lastPaidDate).equalToWhenPresent(record::getLastPaidDate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: loan")
    default int updateByPrimaryKey(Loan record) {
        return UpdateDSL.updateWithMapper(this::update, loan)
                .set(userId).equalTo(record::getUserId)
                .set(groupId).equalTo(record::getGroupId)
                .set(status).equalTo(record::getStatus)
                .set(remainingAmmount).equalTo(record::getRemainingAmmount)
                .set(lastPaidDate).equalTo(record::getLastPaidDate)
                .where(loanId, isEqualTo(record::getLoanId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: loan")
    default int updateByPrimaryKeySelective(Loan record) {
        return UpdateDSL.updateWithMapper(this::update, loan)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(groupId).equalToWhenPresent(record::getGroupId)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(remainingAmmount).equalToWhenPresent(record::getRemainingAmmount)
                .set(lastPaidDate).equalToWhenPresent(record::getLastPaidDate)
                .where(loanId, isEqualTo(record::getLoanId))
                .build()
                .execute();
    }
}