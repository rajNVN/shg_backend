package com.rajCo.shg.dao;

import com.rajCo.shg.entities.Members;
import com.rajCo.shg.mappers.AuthMapper;
import com.rajCo.shg.mappers.MembersMapper;
import com.rajCo.shg.models.request.SignupRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class MemberDao {
    
    @Autowired
    private MembersMapper membersMapper;
    
    @Autowired
    private AuthMapper authMapper;
    
    public Members addNewMember(SignupRequest request){
        Members member = new Members();
        member.setName(request.getName());
        member.setPhone(request.getPhone());
        member.setMail(request.getMail());
        member.setAddress(request.getAddress());
        member.setDob(request.getDob());
        member.setOccupation(request.getOccupation());
        member.setFatherName(request.getFatherName());
        member.setIdentityNumber(request.getIdentityNumber());
        member.setIdentityType(request.getIdentityType());
        member.setGender(request.getGender());
        member.setMaritalStatus(request.getMaritalStatus());
        membersMapper.insert(member);
        return member;
    }
    
}
