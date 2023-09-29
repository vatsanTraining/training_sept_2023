package com.example.demo.advices;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAdvice {

	  
	
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    
    
    @Before("execution(* com.example.demo.*.*.*(..))")                      
    public void logMessage(JoinPoint jp) {
    	
    	log.info(jp.getArgs()[0]+ "Is the argument");
    	log.info(jp.getSignature().getName()+ "====Called");
    }
	
    
    @After("execution(* com.example.demo.*.*.*(..))")                      
    public void logAfter(JoinPoint jp) {
    	
    	log.info(jp.getSignature().getName()+ "*****Finished");
    }
}
