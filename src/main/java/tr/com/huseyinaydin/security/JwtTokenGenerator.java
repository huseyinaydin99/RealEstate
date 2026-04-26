package tr.com.huseyinaydin.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtTokenGenerator {

    public String generateToken(Integer id, String username, String role, String name, String email, String imageUrl) {
        Map<String, Object> claims = new HashMap<>();
        claims.put("id", id);
        claims.put("role", role);
        claims.put("username", username);
        claims.put("name", name);
        claims.put("email", email);
        claims.put("imageUrl", imageUrl);
        long expirationTimeInMs = JwtTokenDefaults.EXPIRE * 60 * 1000L;
        
        Key key = Keys.hmacShaKeyFor(JwtTokenDefaults.KEY.getBytes(StandardCharsets.UTF_8));

        return Jwts.builder()
                .setClaims(claims)
                .setSubject(username)
                .setIssuer(JwtTokenDefaults.VALID_ISSUER)
                .setAudience(JwtTokenDefaults.VALID_AUDIENCE)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + expirationTimeInMs))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }
}
