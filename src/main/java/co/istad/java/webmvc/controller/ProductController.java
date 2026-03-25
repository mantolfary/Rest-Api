package co.istad.java.webmvc.controller;

import co.istad.java.webmvc.dto.CreateProductRequest;
import co.istad.java.webmvc.dto.ProductDto;
import co.istad.java.webmvc.dto.ProductResponse;
import co.istad.java.webmvc.dto.UpdateProductRequest;
import co.istad.java.webmvc.service.ProductService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    private ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PatchMapping("/{code}")
    public ProductResponse patchByCode(
            @PathVariable
            String code,
            @RequestBody
            ProductDto productDto
    ) {
        log.info("patchByCode: {}, newDataL {}", code, productDto);
        return null;
    }

    @PutMapping("/{code}")
    public ProductResponse updateByCode(
            @PathVariable
            String code,
            @RequestBody
            UpdateProductRequest updateProductRequest
    ){
        log.info("updateByCode: {}, newData: {}", code, updateProductRequest);
        return null;
    }

    @DeleteMapping("/{code}")
    public ProductResponse deleteByCode(@PathVariable String code){
        log.info("deleteByCode: {}", code);
        return null;
    }

    @PostMapping
    public ProductResponse createNew(
            @Valid
            @RequestBody
            CreateProductRequest createProductRequest
    ){
        log.info("createNew: {}", createProductRequest);
        return productService.createNew(createProductRequest);
    }

    @GetMapping("/{code}")
    public ProductResponse getByCode(
            @PathVariable String code
    ){
        log.info("getByCode: {}", code);
        return null;
    }

    @GetMapping
    public Page<ProductResponse> getAll(
            @RequestParam(required = false, defaultValue = "0") int pageNumber,
            @RequestParam(required = false, defaultValue = "20") int pageSize
    ){
        log.info("getAll with pageNumber: {} and pageSize: {}", pageNumber, pageSize);
        return productService.getAll(pageNumber, pageSize);
    }
}