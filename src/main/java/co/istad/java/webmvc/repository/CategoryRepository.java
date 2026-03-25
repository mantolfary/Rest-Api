package co.istad.java.webmvc.repository;

import co.istad.java.webmvc.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String> {

}
