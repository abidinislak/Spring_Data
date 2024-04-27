package MultiDataSource.orderRepo;

import MultiDataSource.orderentity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order ,Integer> {
}
