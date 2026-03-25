package co.istad.java.webmvc.domain;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name="order_line")
public class OrderLine {
    @Id
    private Integer id;

    //Associate mapping with order
    @ManyToOne
    private Order order;

    //Associate mapping with order
    @ManyToOne
    private Product product;

    private Integer qty;
    private BigDecimal unitPrice;
    private float discount;
}
