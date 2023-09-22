package com.primaryKeys.config;


import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@Component
public class CustomInterceptor extends EmptyInterceptor {
    @Override
    public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
        System.out.println("I'm in onSave...........................................");

        Object[] newState = processFields(entity, state, propertyNames, "onSave");

        return super.onSave(entity, id, newState, propertyNames, types);
    }

    private Object[] processFields(Object entity, Object[] state, String[] propertyNames, String type) {
        List<String> annotationFields = getAnnotationFields(entity);

        for (String field : annotationFields) {
            for (int i = 0; i < propertyNames.length; i++) {
                if (propertyNames[i].equals(field)) {
                    if (StringUtils.hasText(state[i].toString())) {
                        if ("onSave".equals(type) || "onFlushDirty".equals(type)) {

                        } else if ("onLoad".equals(type)) {

                        }
                    }
                }
            }
        }

        return state;
    }

    private List<String> getAnnotationFields(Object entity) {

        List<String> annotatedFields = new ArrayList<>();

        for (Field field : entity.getClass().getDeclaredFields()) {

        }

        return annotatedFields;
    }
}
