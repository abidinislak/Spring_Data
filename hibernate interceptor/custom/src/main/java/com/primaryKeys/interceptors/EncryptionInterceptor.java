package com.primaryKeys.interceptors;

import com.primaryKeys.domain.Customer;
import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by jt on 6/28/22.
 */
@Component
public class EncryptionInterceptor extends EmptyInterceptor {
    public boolean onSave(Object entity,
                          Serializable id,
                          Object[] state,
                          String[] propertyNames,
                          Type[] types) {
        if (entity instanceof Customer) {
            System.out.println("Student Create Operation");
            return true;
        }
        return false;
    }
}
