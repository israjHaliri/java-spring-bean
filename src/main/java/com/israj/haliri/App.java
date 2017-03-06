package com.israj.haliri;

import com.israj.haliri.domain.Resultset;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
        Resultset resultsetXml = (Resultset)ctx.getBean("baseBeans");
        System.out.println("resultsetXml : "+resultsetXml.getMessage());
        System.out.println("resultsetXml : "+resultsetXml.getStatus());
        System.out.println("=================================");
        
        Resultset resultset = ctx.getBean(Resultset.class);
        resultset.setMessage("Welcome Haliri");
        resultset.setStatus("success by Haliri");
        System.out.println("resultsetXml : "+resultset.getMessage());
        System.out.println("resultsetXml : "+resultset.getStatus());
        
    }
}
