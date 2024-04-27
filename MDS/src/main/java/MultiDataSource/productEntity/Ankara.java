package MultiDataSource.productEntity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ankara {
    @Id
    private int id;

    private String description;
}
