package com.niit.chatbackend.configure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.niit.models.JstlView;
@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.niit")
public class ApplicationConfig extends WebMvcConfigurerAdapter{
	private static Logger l= LoggerFactory.getLogger(ApplicationContextConfig.class);
	
	@Bean
	public ViewResolver viewResolver(){
	InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
	viewResolver.setViewClass(JstlView.class);
	viewResolver.setPrefix("/WEB-INF/views/");
	viewResolver.setSuffix(".html");
	l.debug("code ended");
	return viewResolver ;
	}
	

}
