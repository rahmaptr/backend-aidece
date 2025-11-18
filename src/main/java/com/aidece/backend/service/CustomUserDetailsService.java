package com.aidece.backend.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // For testing purposes with hardcoded credentials
        // In production, this would query your database
        if ("admin".equals(username)) {
            return User.builder()
                .username("admin")
                .password("admin123") // Hardcoded password for testing
                .authorities(new ArrayList<>())
                .build();
        }
        
        throw new UsernameNotFoundException("User not found: " + username);
    }
}
