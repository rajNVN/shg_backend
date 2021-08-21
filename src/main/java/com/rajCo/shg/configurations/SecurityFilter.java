package com.rajCo.shg.configurations;

import com.rajCo.shg.entities.Auth;
import com.rajCo.shg.models.AuthModel;
import com.rajCo.shg.repositories.AuthDao;
import com.rajCo.shg.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class SecurityFilter extends OncePerRequestFilter {

    @Autowired
    AuthDao authDao;

    @Autowired
    JWTUtil jwtUtil;

    @Override
    protected void doFilterInternal(final HttpServletRequest request,
                                    final HttpServletResponse response, final FilterChain chain) throws ServletException, IOException {
        String token = request.getHeader("auth");
        if(jwtUtil.validateToken(token)) {
            AuthModel authDetails = jwtUtil.getUserFromToken(token);
            SecurityContextHolder.getContext().setAuthentication(new UsernamePasswordAuthenticationToken(
                    authDetails.getUsername(), authDetails.getPassword(),
                    getAuthorities(authDetails.isAdmin())));
            chain.doFilter(request, response);
        }
//        SecurityContextHolder.getContext().setAuthentication(new UsernamePasswordAuthenticationToken(
//                "a", "b",
//                getAuthorities(true)));
//        chain.doFilter(request, response);
        response.setStatus(403);
        response.getWriter().write("Unauthorised");
    }

    private Set<GrantedAuthority> getAuthorities(boolean isAdmin) {
        Set<GrantedAuthority> authorities = new HashSet<>();
        authorities.add(new SimpleGrantedAuthority(isAdmin ? "ADMIN" : "MEMBER"));
        return authorities;
    }
}