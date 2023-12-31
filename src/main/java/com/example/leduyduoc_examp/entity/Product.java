package com.example.leduyduoc_examp.entity;

import lombok.Data;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "Product")
public class Product {
    @Id
    private int prodID;
    private String prodName;
    private String description;
    private Date dateOfManf;
    private BigDecimal price;

    @OneToMany(mappedBy = "product")
    private List<Sale> sales;

}
