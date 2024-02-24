package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
        System.out.println("Context created");
        Sim sim = context.getBean("sim", Sim.class);
        sim.Calling();
        sim.Data();

    }
}