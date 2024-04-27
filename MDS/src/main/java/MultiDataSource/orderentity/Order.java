package MultiDataSource.orderentity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {


    @Id
    private int id;

    private  String orderfrom;

    private Date date;

    public Order() {
    }

    public Order(int id, String orderfrom, Date date) {
        this.id = id;
        this.orderfrom = orderfrom;
        this.date = date;
    }
}
