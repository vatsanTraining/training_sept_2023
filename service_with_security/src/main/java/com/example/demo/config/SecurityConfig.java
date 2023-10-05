package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	
	@Autowired
	BCryptPasswordEncoder encoder;
	
	
	@Bean
	public SecurityFilterChain filter(HttpSecurity http) throws Exception {
		
		
		http.authorizeHttpRequests(auth -> auth.requestMatchers("/places")
				  .authenticated()).httpBasic(Customizer.withDefaults());
		


		return http.build();
	}
	
	
	@Bean
	public UserDetailsManager users() {
		
		UserDetails india = User
				   .withUsername("india")
				  .password(encoder.encode("india"))
				   .authorities("ROLE_ADMIN")
				   .build();
				
		UserDetails lanka = User
				       .withUsername("lanka")
				       .password(encoder.encode("lanka"))
				       .authorities("ROLE_GUEST")
				       .build();
				
				

		return new InMemoryUserDetailsManager(india,lanka);
	}
}
