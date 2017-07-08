package org.smart4j.framework.util;

import org.slf4j.LoggerFactory;

import org.slf4j.Logger;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Think on 2017/7/7.
 */
public final class ReflectionUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(ReflectionUtil.class);

    public static Object newInstance(Class<?> cls) {
        Object instance;

        try {
            instance = cls.newInstance();
        } catch (Exception e) {
            LOGGER.error("new instance failure", e);
            throw new RuntimeException(e);
        }
        return instance;
    }

    public static Object invokeMethod(Object obj, Method method, Object... args) {
        Object result;
        try {
            //将此对象的 accessible 标志设置为指示的布尔值。值为 true 则指示反射的对象在使用时应该取消 Java 语言访问检查。值为 false 则指示反射的对象应该实施 Java 语言访问检查。
            method.setAccessible(true);
            result = method.invoke(obj, args);
        } catch (Exception e) {
            LOGGER.error("invoke method failter", e);
            throw new RuntimeException(e);
        }
        return result;
    }

    public static void setField(Object obj, Field field, Object value) {
        try {
            field.setAccessible(true);
            field.set(obj, value);
        } catch (Exception e) {
            LOGGER.error("set field failture", e);
            throw new RuntimeException(e);
        }
    }
}

