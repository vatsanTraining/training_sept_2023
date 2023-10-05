package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity(jsr250Enabled = true)
public class SecurityConfig {

	
	@Autowired
	BCryptPasswordEncoder encoder;
	
	
	@Bean
	public SecurityFilterChain filter(HttpSecurity http) throws Exception {
		
		
		http.authorizeHttpRequests(auth -> auth.requestMatchers("/places","/spots")
				  .authenticated()).httpBasic(Customizer.withDefaults());
		


		return http.build();
	}
	
	
	@Bean
	public UserDetailsManager users() {
		
		UserDetails india = User
				   .withUsername("india")
				  .password(encoder.encode("india"))
				   .roles("ADMIN")
				   .build();
				
		UserDetails lanka = User
				       .withUsername("lanka")
				       .password(encoder.encode("lanka"))
				       .roles("GUEST")
				       .build();
				
				

		return new InMemoryUserDetailsManager(india,lanka);
	}
}
