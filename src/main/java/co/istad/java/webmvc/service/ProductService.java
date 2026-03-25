package co.istad.java.webmvc.service;

import co.istad.java.webmvc.dto.CreateProductRequest;
import co.istad.java.webmvc.dto.ProductResponse;
import org.springframework.data.domain.Page;

public interface ProductService {
    Page<ProductResponse> getAll(int pageNumber, int pageSize);

    ProductResponse createNew(CreateProductRequest createProductRequest);
}
