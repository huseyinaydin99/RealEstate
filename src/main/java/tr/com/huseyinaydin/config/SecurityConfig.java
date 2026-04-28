package tr.com.huseyinaydin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import tr.com.huseyinaydin.security.JwtAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public JwtAuthenticationFilter jwtAuthenticationFilter() {
        return new JwtAuthenticationFilter();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(AbstractHttpConfigurer::disable)
            .headers(headers -> headers.frameOptions(frame -> frame.sameOrigin()))
            .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            .authorizeHttpRequests(authorize -> authorize
                .requestMatchers("/api/Login/**", "/", "/index", "/Default/Index", "/about", "/contact").permitAll()
                .requestMatchers("/property/**", "/Register/**", "/Login/**").permitAll()
                .requestMatchers("/css/**", "/js/**", "/images/**", "/lib/**", "/AdminPanel/**", "/RealEstatePanel/**").permitAll()
                .requestMatchers("/swagger-ui/**", "/v3/api-docs/**", "/error/**", "/h2-console/**").permitAll()
                .requestMatchers("/api/Categories/**", "/admin/categories/**").hasAnyRole("Admin", "Employee")
                .requestMatchers("/api/Products/**", "/admin/products/**").hasAnyRole("Admin", "Employee")
                .requestMatchers("/admin/dashboard/**", "/admin/statistics/**", "/admin/profile/**", "/Profile/**", "/messages/**").authenticated()
                .requestMatchers("/estateagent/**").hasAnyRole("Employee", "Manager")
                .anyRequest().authenticated()
            )
            .exceptionHandling(exception -> exception
                .accessDeniedPage("/error/403")
            )
            .addFilterBefore(jwtAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }
}
