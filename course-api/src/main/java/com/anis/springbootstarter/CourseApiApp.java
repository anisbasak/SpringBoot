package com.anis.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.anis.corsconfig.CorsConfig;


@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(CourseApiApp.class, args);
	}
	
    @Bean
    public FilterRegistrationBean corsFilterRegistration() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new CorsConfig());
        registrationBean.setName("CORS Filter");
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(1);
        return registrationBean;
    }

}



