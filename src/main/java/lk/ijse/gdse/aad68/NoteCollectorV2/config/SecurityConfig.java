package lk.ijse.gdse.aad68.NoteCollectorV2.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationConverter;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {
    @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
      http.csrf(AbstractHttpConfigurer::disable)
              .authorizeRequests( req ->
                      req.requestMatchers("api/v1/auth/**").permitAll()
                              .anyRequest()
                              .authenticated())
              .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
              .authenticationProvider()
              .addFilterBefore();
      return http.build();
  }
  @Bean
  public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
  }
  //Auth provider
    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider dap =
                new DaoAuthenticationProvider();
        dap.setUserDetailsService();
        dap.setPasswordEncoder(passwordEncoder());
        return dap;
    }
    @Bean
    public AuthenticationManager authenticationManager (AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }

}
