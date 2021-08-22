package com.rajCo.shg.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.Claim;
import com.rajCo.shg.entities.Auth;
import com.rajCo.shg.models.AuthModel;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public final class JWTUtil {

    private static final String USER_ID = "userId";
    private static final String USER_NAME = "username";
    private static final String IS_ADMIN = "isAdmin";

    @Value("${security.jwt.expiration}")
    private Integer expiration;

    @Value("${security.jwt.secret}")
    private String secret;

    public boolean validateToken(final String token) {
        if(StringUtils.isBlank(token)){
            return false;
        }
        try {
            final JWTVerifier verifier = JWT.require(getAlgorithm(secret)).build();
            verifier.verify(token);
            Date expiration = JWT.decode(token).getClaim("exp").asDate();
            if(DateTime.now().isAfter(new DateTime(expiration))){
                return false;
            }
        } catch (final JWTVerificationException e) {
            return false;
        }
        return true;
    }

    public AuthModel getUserFromToken(final String token) {
        final Map<String, Claim> claims = JWT.decode(token).getClaims();

        final Claim userId = claims.get(USER_ID);
        final Claim username = claims.get(USER_NAME);
        final Claim isAdmin = claims.get(IS_ADMIN);

        return AuthModel.builder()
                .userId(null == userId ? null : userId.asInt())
                .username(null == username ? null : username.asString())
                .isAdmin(null == isAdmin ? null : isAdmin.asBoolean())
                .build();
    }

    public String getUserNameFromToken(final String token) {
        return JWT.decode(token).getClaim("userId").asString();
    }


    public String generateAccessToken(final AuthModel user) {
        return JWT.create()
                .withClaim(USER_ID, user.getUserId())
                .withClaim(USER_NAME, user.getUsername())
                .withClaim(IS_ADMIN, user.isAdmin())
                .withExpiresAt(getExpirationDate(expiration))
                .sign(getAlgorithm(secret));
    }
//eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc0FkbWluIjp0cnVlLCJleHAiOjE2MzAwMDgxMjgsInVzZXJJZCI6IjEiLCJ1c2VybmFtZSI6InJhak5WTiJ9.7ZhULmd98w34EIN6bW5dZZZISCfStLMAhzfFlGCcZZ8
    private Date getExpirationDate(final Integer expiration) {
        return new DateTime().plusSeconds(expiration).toDate();
    }

    private Algorithm getAlgorithm(final String secret) {
        return Algorithm.HMAC256(secret);
    }

    public static String getEncodedPassword(String password) throws NoSuchAlgorithmException {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(password.getBytes());
            byte[] bytes = m.digest();
            StringBuilder s = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                s.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            return s.toString();
    }
}