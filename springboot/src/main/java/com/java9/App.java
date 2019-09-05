package com.java9;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration
@ComponentScan("com.java9.web")
@MapperScan("com.java9.web.mapper")
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class);
    }
}
