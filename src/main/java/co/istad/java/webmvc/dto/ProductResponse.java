package co.istad.java.webmvc.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Builder
public record ProductResponse(
        String code,
        String name,
        String description,
        String picture,
        BigDecimal price,
        Boolean isAvailable
) {
}
