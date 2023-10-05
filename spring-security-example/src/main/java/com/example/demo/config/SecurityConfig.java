package com.example.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfig {

	
	
	public BCryptPasswordEncoder encoder;

	public SecurityConfig(BCryptPasswordEncoder encoder) {
		super();
		this.encoder = encoder;
	}
	
	
	@Bean
	public UserDetailsManager details () {
		
		UserDetails india = User.withUsername("india").password(encoder.encode("delhi")).authorities("ROLE_ADMIN").build();
		
		UserDetails lanka = User.withUsername("lanka").password(encoder.encode("colombo")).authorities("GUEST").build();
		
		
		
		return new InMemoryUserDetailsManager(india,lanka);
	}
	
	
	@Bean
	public SecurityFilterChain  filterChain(HttpSecurity http) throws Exception{
		
	
		http.authorizeHttpRequests().requestMatchers("/second","/actuator/**")
        .permitAll().and().authorizeHttpRequests()
                 .requestMatchers("/first").authenticated().and().httpBasic();

		
		
		return http.build();
	}
	
	

//	@Bean
//	public UserDetailsService jdbcUserDetailsService(DataSource dataSource) {
//	 
//	 String usersByUsernameQuery = "select username, password, enabled from users where username = ?";
//
//	 String authsByUserQuery = "select username, authority from authorities where username = ?";
//	      
//	JdbcUserDetailsManager mgr = new 						JdbcUserDetailsManager(dataSource);
//
//	  mgr.setUsersByUsernameQuery(usersByUsernameQuery);
//	  mgr.setAuthoritiesByUsernameQuery(authsByUserQuery);
//	  return mgr;
//	}

}
