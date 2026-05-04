package edu.icet.ecom.model;

import java.math.BigDecimal;

public class SpendingCategory {
    private Long id;
    private String name;
    private String icon;
    private String color;
    private BigDecimal budgetLimit;
    private BigDecimal amountSpent;
    private Long userId;
    private String createdAt;
}