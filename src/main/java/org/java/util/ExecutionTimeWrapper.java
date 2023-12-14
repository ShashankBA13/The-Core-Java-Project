package org.java.util;

import java.lang.reflect.Method;

public class ExecutionTimeWrapper {

    public static void measureExecutionTime(Object object) {
        Class<?> clazz = object.getClass();
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(ExecutionTime.class)) {
                long startTime = System.currentTimeMillis();
                try {
                    // method.setAccessible(true);
                    method.invoke(object);
                } catch (Exception e) {
                     e.printStackTrace();
                }
                long endTime = System.currentTimeMillis();
                long executionTime = endTime - startTime;
                System.out.println("Method '" + method.getName() + "' took " + executionTime + " ms");
            }
        }
    }
}