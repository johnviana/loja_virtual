package com.lojavirtual.apploja.ConfigSecurity.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;

@Service
@Component
public class JWTTokenAutenticacaoService {

    private static final String SECRET = "sua_chave_secreta_aqui";
    private static final long EXPIRATION_TIME = 86400000; // 1 dia
    private static final String TOKEN_PREFIX = "Bearer";
    private static final String HEADER_STRING = "Authorization";

    // GERA O TOKEN E DA A RESPONSA PARA O CLIENTE COM JJWT
    public void addAuthentication(HttpServletResponse response, String username) throws Exception {
        Key key = Keys.hmacShaKeyFor(SECRET.getBytes());

        String JWT = Jwts.builder() // chama o gerador de token
                .setSubject(username) // ADICIONA O USER
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME)) // TEMPO DE EXPIRAÇÃO TEMPO ATUAL ATÉ O TOKEN
                .signWith(key, SignatureAlgorithm.HS512)
                .compact();

        String token = TOKEN_PREFIX + " " + JWT;

        response.addHeader(HEADER_STRING, token);
        response.getWriter().write("{\"Authorization\": \"" + token + "\"}");
    }

    // Outros métodos e configurações, se necessário
}
