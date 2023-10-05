package com.datarest.model;


import com.datarest.util.BeerStyleEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.type.SqlTypes;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Beer {

    Beer(Long version) {
        this.version = version;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JdbcTypeCode(SqlTypes.CHAR)
    @Column(length = 36, columnDefinition = "varchar(36)", updatable = false, nullable = false)
    private UUID id;

    @Version Long version;

    private String beerName;
    private BeerStyleEnum beerStyle;
    private String upc;

    private Integer quantityOnHand;

    private BigDecimal price;

    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp cretaedDate;
    @UpdateTimestamp
    private Timestamp lastUpdatedTimestamp;

}



