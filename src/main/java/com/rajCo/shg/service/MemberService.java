package com.rajCo.shg.service;

import com.rajCo.shg.configurations.CommonException;
import com.rajCo.shg.dao.AuthDao;
import com.rajCo.shg.dao.MemberDao;
import com.rajCo.shg.entities.Auth;
import com.rajCo.shg.entities.Members;
import com.rajCo.shg.models.PersonalDetails;
import com.rajCo.shg.models.request.SignupRequest;
import com.rajCo.shg.utils.JWTUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberService {

    @Autowired
    private MemberDao memberDao;

    @Autowired
    private AuthDao authDao;

    @Transactional
    public PersonalDetails signup(final SignupRequest request){
        Members member = memberDao.addNewMember(request);
        Auth auth = new Auth();
        auth.setUserId(member.getUserId());
        auth.setUsername(request.getUsername());
        try {
            auth.setPassword(JWTUtil.getEncodedPassword(request.getPassword()));
        } catch (Exception e){
            throw CommonException.newCommonException(null, "Password encoding failed", null);
        }
        auth.setIsAdmin(false);
        auth.setQuestion1(request.getQuestion1());
        auth.setQuestion2(request.getQuestion2());
        auth.setQuestion3(request.getQuestion3());
        auth.setAnswer1(request.getAnswer1());
        auth.setAnswer2(request.getAnswer2());
        auth.setAnswer3(request.getAnswer3());
        authDao.addNewAuth(auth);

        PersonalDetails personalDetails =  new PersonalDetails();
        BeanUtils.copyProperties(member, personalDetails);
        BeanUtils.copyProperties(auth, personalDetails);
        return personalDetails;
    }

}
