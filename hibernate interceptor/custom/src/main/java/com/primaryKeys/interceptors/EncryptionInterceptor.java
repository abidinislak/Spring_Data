package com.primaryKeys.interceptors;

import org.hibernate.EmptyInterceptor;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 6/28/22.
 */
@Component
public class EncryptionInterceptor extends EmptyInterceptor {

//    public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
//        System.out.println("I'm in onSave");
//
//
//        return super.onSave(entity, id, null, propertyNames, types);
//    }
}