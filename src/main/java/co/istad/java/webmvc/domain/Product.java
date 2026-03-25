package co.istad.java.webmvc.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name="products")
public class Product{
    @Id
    private String code;
    @Column(length = 150, nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private BigDecimal price;
    private String picture;

    @Column(nullable = false)
    private Boolean isAvailable;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "product")
    private List<OrderLine> orderLines;
}
