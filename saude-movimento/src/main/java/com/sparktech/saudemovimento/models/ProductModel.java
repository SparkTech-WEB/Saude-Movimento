package com.sparktech.saudemovimento.models;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productID;
    private String productName;
    private BigDecimal productPrice;
    private boolean isProductDiscount;
    private Long productDiscountPercentage;
    private BigDecimal productDiscountPrice;
    private String productCategory;
    private String productFileName1;
    private String productFileName2;
    private String productFileName3;
}
