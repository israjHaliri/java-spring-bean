package com.israj.haliri;

import com.israj.haliri.domain.Resultset;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = null;
        try {
            ctx = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
        }catch (Exception e){
            e.printStackTrace();
        }

        Resultset resultsetXml = (Resultset) ctx.getBean("resultsetBean");

        System.out.println("resultsetBeanXml message: " + resultsetXml.getMessage());
        System.out.println("resultsetBeanXml status: " + resultsetXml.getStatus());
        System.out.println("\n \n \n");

        Resultset resultsetClass = ctx.getBean(Resultset.class);
        resultsetClass.setMessage("Welcome Haliri");
        resultsetClass.setStatus("success by Haliri");

        System.out.println("resultsetBeanClass message: " + resultsetClass.getMessage());
        System.out.println("resultsetBeanClass status: " + resultsetClass.getStatus());
    }
}
