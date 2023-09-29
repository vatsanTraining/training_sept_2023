package com.example.demo.advices;

import java.time.LocalDateTime;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TransformResponse {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

	    @Around("execution(* com.example.demo.service.*.*(..))")                      
	    public Object logMessage(ProceedingJoinPoint pjp) throws Throwable {
	    	
	    	log.info(pjp.getSignature().getName() + ": => Called :=>"+ LocalDateTime.now());
	    	
	    	System.out.println(pjp.getArgs()[0]);
	    	
	       	Object[] args = {10.00};
	    	
	    	   pjp.proceed(args);
	    	   
	       	log.info(pjp.getSignature().getName() + ": => Completed :=>"+ LocalDateTime.now());
	       	
              
	    	   return 9000;
	    }
	}
