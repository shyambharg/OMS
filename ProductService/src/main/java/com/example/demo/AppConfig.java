package com.example.demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@EnableAutoConfiguration
@Configuration
@ComponentScan({"com.example"})
@PropertySource("classpath:database.properties")
public class AppConfig {
	
	@Autowired
	Environment environment;
	private final String URL = "url";
	private final String USER = "username";
	private final String DRIVER = "driver-class-name";
	private final String PASSWORD = "password";

	@Bean
	@Autowired
	DataSource dataSource_mydb() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl(environment.getProperty(URL));
		driverManagerDataSource.setUsername(environment.getProperty(USER));
		driverManagerDataSource.setPassword(environment.getProperty(PASSWORD));
		driverManagerDataSource.setDriverClassName(environment.getProperty(DRIVER));
		return driverManagerDataSource;
	}
	
@Bean
@Autowired
@Qualifier("dataSource_mydb")
public JdbcTemplate jdbcTemplate(DataSource dataSource) {
     return new JdbcTemplate(dataSource);
}
}
