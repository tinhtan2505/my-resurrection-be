package nqt.my_resurrection_be.authentication;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;

@Component
public class JwtTokenProvider {

    private SecretKey jwtSecret = Keys.secretKeyFor(SignatureAlgorithm.HS512);
    private final int jwtExpirationMs = 86400000; // 24 hours

    public String generateToken(Authentication authentication) {
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        return Jwts.builder()
                .setSubject(userDetails.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date((new Date()).getTime() + jwtExpirationMs))
                .signWith(SignatureAlgorithm.HS512, jwtSecret)
                .compact();
    }

    // Validate JWT token
    public boolean validateToken(String token) {
        try {
            Jwts.parserBuilder()
                    .setSigningKey(jwtSecret)
                    .build()
                    .parseClaimsJws(token);
            return true;
        } catch (ExpiredJwtException e) {
            System.out.println("Token đã hết hạn");
        } catch (UnsupportedJwtException e) {
            System.out.println("Token không được hỗ trợ");
        } catch (MalformedJwtException e) {
            System.out.println("Token không hợp lệ");
        } catch (SignatureException e) {
            System.out.println("Chữ ký token không hợp lệ");
        } catch (IllegalArgumentException e) {
            System.out.println("Yêu cầu token rỗng");
        }
        return false;
    }

    // Lấy username từ token
    public String getUsernameFromToken(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(jwtSecret)
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }
}

