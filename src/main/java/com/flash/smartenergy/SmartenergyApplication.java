package com.flash.smartenergy;

import com.flash.smartenergy.config.JpaAuditingConfiguration;
import com.flash.smartenergy.entity.test.User_Ext;
import com.flash.smartenergy.repository.JWTUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef="auditorProvider")
public class SmartenergyApplication {

	@Autowired
	private JWTUserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SmartenergyApplication.class, args);
	}

	@PostConstruct
	public void initUsers(){
		List<User_Ext> users = Stream.of(
				new User_Ext("admin","admin","Admin"),
				new User_Ext("customer","test","Customer"),
				new User_Ext("eb","test","EB_Office")
		).collect(Collectors.toList());
		userRepository.saveAll(users);
	}

	@Bean
	public PasswordEncoder passwordEncoder(){
		return NoOpPasswordEncoder.getInstance();
	}

	@Bean
	public AuditorAware<String> auditorProvider() {
		return new JpaAuditingConfiguration();
	}

}
