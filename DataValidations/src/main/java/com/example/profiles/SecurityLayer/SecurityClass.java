package com.example.profiles.SecurityLayer;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityClass {
	public class httpsecurity {
		@Bean
	 InMemoryUserDetailsManager inMemoryUserDetailsManager()
		{
			UserDetails service=User.builder().username("srinadh").
					roles("ADMIN").password("{noop}srinadh").build();
			UserDetails service1=User.builder().username("kish").
					roles("ADMIN").password("{noop}sr").build();
			InMemoryUserDetailsManager jj=new InMemoryUserDetailsManager(service,service1);
			
					return jj;
		}
	  @Bean
		 SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
		{
            http.csrf().
            disable().authorizeHttpRequests().
            requestMatchers("./post").permitAll();


		}
	}

}
