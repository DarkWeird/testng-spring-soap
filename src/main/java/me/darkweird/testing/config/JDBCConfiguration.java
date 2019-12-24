package me.darkweird.testing.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.Driver;
import java.sql.DriverManager;

@Configuration
public class JDBCConfiguration {


    //   <bean id="dataSource"
//        class = "org.springframework.jdbc.datasource.DriverManagerDataSource">
//      <property name = "driverClassName" value = "com.mysql.jdbc.Driver"/>
//      <property name = "url" value = "jdbc:mysql://localhost:3306/TEST"/>
//      <property name = "username" value = "root"/>
//      <property name = "password" value = "password"/>
//   </bean>

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dmds = new DriverManagerDataSource("jdbc:sqliteblzcode.db");
        dmds.setDriverClassName("org.sqlite.JDBC");
        return dmds;
    }
}
