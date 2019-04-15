package org.rhapsodyman.springcucumber;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("org.rhapsodyman")
public class Config {
	@Bean
//    @Scope("cucumber-glue")
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}