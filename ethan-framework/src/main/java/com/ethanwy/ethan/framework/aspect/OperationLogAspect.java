package com.ethanwy.ethan.framework.aspect;

import com.ethanwy.ethan.common.annotation.OperationLog;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 操作日志注解拦截
 * @author Ethan
 * @date 2018/12/18
 */
@Component
@Aspect
public class OperationLogAspect {

    public static final Logger LOGGER = LoggerFactory.getLogger(OperationLogAspect.class);

    /**
     * 定义切点
     */
    @Pointcut("@annotation(com.ethanwy.ethan.common.annotation.OperationLog)")
    public void controllerAspect(){}

    /**
     * 方法退出前通知（不论正常还是异常）
     * @param joinPoint 切点
     */
    @AfterReturning(pointcut = "controllerAspect()")
    public void doAfterReturn(JoinPoint joinPoint){

    }

    /**
     * 方法抛出异常后通知（不论正常还是异常）
     * @param joinPoint 切点
     * @param exception 异常
     */
    @AfterThrowing(pointcut = "controllerAspect()",throwing = "exception")
    public void doAfterThrowing(JoinPoint joinPoint, Exception exception){

    }

    /**
     * 处理操作日志
     * @param joinPoint 切点
     * @param exception 异常
     */
    private void handleOperationLog(JoinPoint joinPoint, Exception exception){
        try {
            OperationLog operationLog = getOperationLog(joinPoint);
            if(operationLog != null) {

            }
        }catch (Exception e){

        }
    }

    private static OperationLog getOperationLog(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method method = methodSignature.getMethod();
        if (method != null){
            return method.getAnnotation(OperationLog.class);
        }
        return null;
    }
}
