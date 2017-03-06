/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.israj.haliri.config;

import com.israj.haliri.domain.Resultset;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author israjhaliri
 */
@Configuration
public class BeansConfig {
   @Bean 
   public Resultset resultset(){
      return new Resultset();
   }
}
