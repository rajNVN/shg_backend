package com.rajCo.shg.controllers;

import com.rajCo.shg.entities.Members;
import com.rajCo.shg.mappers.GeneralMapper;
import com.rajCo.shg.mappers.MembersDynamicSqlSupport;
import com.rajCo.shg.mappers.MembersMapper;
import io.swagger.annotations.*;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.select;
import static org.mybatis.dynamic.sql.render.RenderingStrategy.MYBATIS3;

@RestController
@SwaggerDefinition(info = @Info(description="Life controller", version = "2", title = "Life controller"))
public class LifeController {

    @Autowired
    private MembersMapper membersMapper;

    @Autowired
    private GeneralMapper generalMapper;

    @ApiOperation(value = "Check health", response = String.class)
    @GetMapping(value = "/life-check")
    public String lifeCheck(){
//        SelectStatementProvider selectStatementProvider = select(MembersDynamicSqlSupport.userId, MembersDynamicSqlSupport.name, MembersDynamicSqlSupport.mail)
//                .from(MembersDynamicSqlSupport.members).build().render(MYBATIS3);
//        List<Members> javaMapper = membersMapper.selectMany(selectStatementProvider);
//        List<Members> xmlMapper = generalMapper.getAllMembers();
        return "Yes, always alive!!!";
    }

}
