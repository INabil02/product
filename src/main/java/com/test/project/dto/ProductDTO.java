package com.test.project.dto;

import com.test.project.enums.InventoryStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ProductDTO {
    private Long id;
    private String code;
    private String name;
    private String description;
    private String image;
    private String category;
    private double price;
    private int quantity;
    private String internalReference;
    private InventoryStatus inventoryStatus;
    private double rating;
    private Long shellId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


}

