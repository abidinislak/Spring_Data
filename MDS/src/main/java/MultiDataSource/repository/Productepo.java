package MultiDataSource.repository;

import MultiDataSource.productEntity.Product;
import org.springframework.data.repository.CrudRepository;

public interface Productepo extends CrudRepository<Product,Integer> {
}
