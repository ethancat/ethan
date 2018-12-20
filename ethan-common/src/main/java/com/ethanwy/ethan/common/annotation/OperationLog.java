package com.ethanwy.ethan.common.annotation;

import com.ethanwy.ethan.common.enums.OperationType;

import java.lang.annotation.*;

/**
 * 业务操作日志注解
 *
 * @author Ethan
 * @date 2018/12/18
 */
@Target({ ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OperationLog {

    String moduleName() default "";

    OperationType OPERATION_TYPE() default OperationType.OTHER;
}
