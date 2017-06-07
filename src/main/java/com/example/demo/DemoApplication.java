package com.example.demo;

import com.separated.spring.example.pojo.PojoClass;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@ComponentScan({"com.example.demo","com.separated.spring.example.controller", "com.separated.spring.example.services"})
@SpringBootApplication
public class DemoApplication {

    @Bean
    public PojoClass pojoClass(){
        return new PojoClass("Mathias R","M Ruckert");
    }

	public static void main(String[] args) {
		ApplicationContext  ctx = SpringApplication.run(DemoApplication.class, args);

		String[] beanNames =  ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
//		for (String name: beanNames) {
//			System.out.println(name);
//
//		}
//        System.out.println(ctx.getBean("pojoClass"));
    }
}
