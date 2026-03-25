package co.istad.java.webmvc.repository;

import co.istad.java.webmvc.domain.Category;
import co.istad.java.webmvc.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
