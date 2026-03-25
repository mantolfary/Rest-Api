package co.istad.java.webmvc.dto;

import java.math.BigDecimal;

public record ProductDto(
        String name,
        BigDecimal price,
        Boolean status
) {
}
