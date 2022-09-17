package spring.web.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Configuration
public class passwordEncoder {
	@Bean
	public BCryptPasswordEncoder  bCryptPasswordEncoder () {
		return new BCryptPasswordEncoder();
	}

}
