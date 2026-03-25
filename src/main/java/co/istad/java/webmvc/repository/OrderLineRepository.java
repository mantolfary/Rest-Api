package co.istad.java.webmvc.repository;

import co.istad.java.webmvc.domain.OrderLine;
import org.springframework.data.repository.CrudRepository;

public interface OrderLineRepository extends CrudRepository<OrderLine, Integer> {
}
