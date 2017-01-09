package com.niit.chatbackend.configure;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.models.Blog;
import com.niit.models.Blog_Comment;
import com.niit.models.Chat;
import com.niit.models.Event;
import com.niit.models.Forum;
import com.niit.models.Forum_Comment;
import com.niit.models.Friend;
import com.niit.models.Job;
import com.niit.models.Job_Applied;
import com.niit.models.User;

import javassist.compiler.ast.NewExpr;

@Configuration
@ComponentScan
@EnableTransactionManagement
public class ApplicationContextConfig {
	@Bean
	public DataSource getOracleDataBase(){
		
		DriverManagerDataSource ds= new DriverManagerDataSource();
		ds.setDriverClassName("Oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		ds.setUsername("SYSTEM");
		ds.setPassword("choco");
		Properties cp= new Properties();
		cp.setProperty("hibernate.dialect","org.hibernate.dialect.Oracle10gDialect");
		ds.setConnectionProperties(cp);
		return ds;
		
	}
	@Autowired
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource){
		
		LocalSessionFactoryBuilder sessionBuilder= new LocalSessionFactoryBuilder(dataSource);
		sessionBuilder.addAnnotatedClass(User.class);
		sessionBuilder.addAnnotatedClass(Blog.class);
		sessionBuilder.addAnnotatedClass(Friend.class);
		sessionBuilder.addAnnotatedClass(Job.class);
		sessionBuilder.addAnnotatedClass(Job_Applied.class);
		sessionBuilder.addAnnotatedClass(Chat.class);
		sessionBuilder.addAnnotatedClass(Event.class);
		sessionBuilder.addAnnotatedClass(Blog_Comment.class);
		sessionBuilder.addAnnotatedClass(Forum.class);
		sessionBuilder.addAnnotatedClass(Forum_Comment.class);
		
		return sessionBuilder.buildSessionFactory();
		
	}

}
