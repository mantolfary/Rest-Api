package co.istad.java.webmvc.domain;

import java.time.Instant;
import java.util.List;
import java.util.UUID;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name="orders")

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private Instant orderAt;

    @Column(nullable = false, length = 150)
    private String orderedBy;

    @OneToMany(mappedBy = "order")
    private List<OrderLine> orderLines;
}
