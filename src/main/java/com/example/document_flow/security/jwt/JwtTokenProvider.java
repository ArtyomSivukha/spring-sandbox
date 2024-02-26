package com.example.document_flow.security.jwt;

import com.example.document_flow.entity.Role;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
import org.springframework.security.core.Authentication;

import java.util.ArrayList;
import java.util.List;

public class JwtTokenProvider {

    @Value("${jwt.token.secret}")
    private String secret;

    @Value("${jwt.token.expired}")
    private long validityInMilliseconds;


    public String createToken(String username, List<Role> role) {
    }

    public Authentication getAuthentication(String token) {
    }

    public String getUsername(String token) {
    }

    public boolean validateToken(String token) {
    }

    private List<String> getRoleNames(List<Role> userRoles) {
        List<String> result = new ArrayList<>();

        userRoles.forEach(role -> {
            result.add(role.getName());
        });

        return result;
    }
}
