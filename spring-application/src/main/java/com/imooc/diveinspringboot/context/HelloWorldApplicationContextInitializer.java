package com.imooc.diveinspringboot.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloWorldApplicationContextInitializer<C extends ConfigurableApplicationContext> implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("id : " + applicationContext.getId());
    }
}
