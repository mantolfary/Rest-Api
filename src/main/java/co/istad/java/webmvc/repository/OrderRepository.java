package co.istad.java.webmvc.repository;

import co.istad.java.webmvc.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {
}
