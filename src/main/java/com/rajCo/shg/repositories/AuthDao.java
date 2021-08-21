package com.rajCo.shg.repositories;

import com.rajCo.shg.entities.Auth;
import com.rajCo.shg.mappers.AuthDynamicSqlSupport;
import com.rajCo.shg.mappers.AuthMapper;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static org.mybatis.dynamic.sql.SqlBuilder.select;

@Repository
public class AuthDao {

    @Autowired
    AuthMapper authMapper;

    public Auth getAuthDetailsByUsername(String username){
        return authMapper.selectOne(select(AuthDynamicSqlSupport.username, AuthDynamicSqlSupport.password, AuthDynamicSqlSupport.isAdmin)
                .from(AuthDynamicSqlSupport.auth).where(AuthDynamicSqlSupport.username, isEqualTo(username))
                .build().render(RenderingStrategy.MYBATIS3));
    }

}
