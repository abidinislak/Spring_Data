package com.primaryKeys.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class springcontextHelper implements ApplicationContextAware {


    private static ApplicationContext applicationContext;

    private static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext1) throws BeansException {
        springcontextHelper.applicationContext = applicationContext1;
    }
}
