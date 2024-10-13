package lk.ijse.gdse.aad68.NoteCollectorV2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
         http.csrf(AbstractHttpConfigurer::disable)
                 .authorizeRequests()
                 .anyRequest().authenticated()
                 .and()
                 .httpBasic();
         return http.build();
    }
    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        UserDetails principleUser = User.withDefaultPasswordEncoder()
                .username("Sandun")
                .password("sayuri123")
                .roles("ADMIIN")
                .build();
        return new InMemoryUserDetailsManager(principleUser);
    }
}
