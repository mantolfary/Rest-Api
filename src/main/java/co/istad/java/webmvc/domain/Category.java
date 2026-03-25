package co.istad.java.webmvc.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor

//2. Make class to be JPA Entity
@Entity
@jakarta.persistence.Table(name = "categories")
public class Category {
    @Id
    private String id;
    @Column(length = 50, unique = true, nullable = false)
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Product> products;

    public String getCode() {
        return null;
    }

    public String getDescription() {
        return null;
    }

    public BigDecimal getPrice() {
        return null;
    }

    public String getPicture() {
        return null;
    }

    public Boolean getIsAvailable() {
        return null;
    }
}
