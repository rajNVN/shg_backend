package com.rajCo.shg.service;

import com.rajCo.shg.configurations.CommonException;
import com.rajCo.shg.entities.Auth;
import com.rajCo.shg.models.AuthModel;
import com.rajCo.shg.dao.AuthDao;
import com.rajCo.shg.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    AuthDao authDao;

    @Autowired
    JWTUtil jwtUtil;

    public String getAuthToken(AuthModel request){
        Auth dbUserDetails = authDao.getAuthDetailsByUsername(request.getUsername());
        if(dbUserDetails == null){
            throw CommonException.newCommonException(1001, "Username and password didn't match", null);
        }
        String encryptedPassword = "";
        try {
             encryptedPassword = JWTUtil.getEncodedPassword(request.getPassword());
        } catch (Exception e){
            throw CommonException.newCommonException(null, "Failed to encrypt password", null);
        }
            if (!dbUserDetails.getPassword().equals(encryptedPassword)) {
                throw CommonException.newCommonException(1001, "Username and password didn't match", null);
            }

        request.setAdmin(dbUserDetails.getIsAdmin().toString().equals("0"));
            request.setPassword(null);
        request.setUserId(dbUserDetails.getUserId());
        return jwtUtil.generateAccessToken(request);
    }

}
