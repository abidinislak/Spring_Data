package com.jpaQuery.model;


import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class OrderHeader extends BaseEntity {


    private String custoer;


    @Enumerated(EnumType.STRING)
    private OrderStatus status;
    @AttributeOverrides({
            @AttributeOverride(name = "state", column = @Column(name = "cutomstate")),
            @AttributeOverride(name = "city", column = @Column(name = "cutomcity"))
    })
    @Embedded
    private Adress customadress;
    @Column(insertable = false, updatable = false)
    private Adress billAdress;


    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp createTime;


    @UpdateTimestamp
    private Timestamp lastModifieded;

    public Timestamp getLastModifieded() {
        return lastModifieded;
    }

    public void setLastModifieded(Timestamp lastModifieded) {
        this.lastModifieded = lastModifieded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        OrderHeader that = (OrderHeader) o;

        return Objects.equals(custoer, that.custoer);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (custoer != null ? custoer.hashCode() : 0);
        return result;
    }
}
