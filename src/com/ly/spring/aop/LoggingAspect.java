package com.ly.spring.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	@Before("execution(public int com.ly.spring.aop.CalculatorImpl.*(..))")
	public void beforeMethod(JoinPoint p) {
		String methodName = p.getSignature().getName();
		Object[] args = p.getArgs();
		System.out.println("the method " + methodName + " is begins:" + Arrays.asList(args));
	}

	@AfterReturning(value = "execution(public int com.ly.spring.aop.CalculatorImpl.*(..))", returning = "result")
	public void afterReturning(JoinPoint p, Object result) {
		System.out.println("the method " + p.getSignature().getName() + " result  is " + result);
	}

	@AfterThrowing(value = "execution(public int com.ly.spring.aop.CalculatorImpl.*(..))")
	public void afterThrowing(JoinPoint p) {
		System.out.println("the method " + p.getSignature().getName() + " exception  is ");
	}

	@After("execution(public int com.ly.spring.aop.CalculatorImpl.*(..))")
	public void afterMethod(JoinPoint p) {
		System.out.println("the method " + p.getSignature().getName() + " is  end.");
	}

	@Around("execution(public int com.ly.spring.aop.CalculatorImpl.*(..))")
	public Object aroundMethod(ProceedingJoinPoint p) {
		Object result = null;
		// @Before 前置通知
		String methodName = p.getSignature().getName();
		Object[] args = p.getArgs();
		System.out.println("the method " + methodName + " is begins:" + Arrays.asList(args));
		try {
			// 调用目标类
			result = p.proceed();
			// 结果通知 @AfterReturning
			System.out.println("the method " + p.getSignature().getName() + " is end." + result);
		} catch (Throwable e) {
			// 异常通知 @AfterThrowing
		}

		// @After 后置通知
		System.out.println("the method " + p.getSignature().getName() + " is end.");
		return result;
	}

}
