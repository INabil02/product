package com.test.project.util;

import com.test.project.dto.ProductDTO;
import com.test.project.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public ProductDTO toProductDTO(Product product) {
        ProductDTO dto = new ProductDTO();
        dto.setId(product.getId());
        dto.setCode(product.getCode());
        dto.setName(product.getName());
        dto.setDescription(product.getDescription());
        dto.setImage(product.getImage());
        dto.setCategory(product.getCategory());
        dto.setPrice(product.getPrice());
        dto.setQuantity(product.getQuantity());
        dto.setInternalReference(product.getInternalReference());
        dto.setInventoryStatus(product.getInventoryStatus());
        dto.setRating(product.getRating());
        dto.setShellId(product.getShellId());
        dto.setCreatedAt(product.getCreatedAt());
        dto.setUpdatedAt(product.getUpdatedAt());
        return dto;
    }

    public Product toProduct(ProductDTO productDTO) {
        Product product = new Product();
        product.setCode(productDTO.getCode());
        product.setName(productDTO.getName());
        product.setDescription(productDTO.getDescription());
        product.setImage(productDTO.getImage());
        product.setCategory(productDTO.getCategory());
        product.setPrice(productDTO.getPrice());
        product.setQuantity(productDTO.getQuantity());
        product.setInternalReference(productDTO.getInternalReference());
        product.setInventoryStatus(productDTO.getInventoryStatus());
        product.setRating(productDTO.getRating());
        product.setShellId(productDTO.getShellId());
        return product;
    }

    public void updateProductFromDTO(ProductDTO productDTO, Product product) {
        if (productDTO.getName() != null) {
            product.setName(productDTO.getName());
        }
        if (productDTO.getDescription() != null) {
            product.setDescription(productDTO.getDescription());
        }
        if (productDTO.getImage() != null) {
            product.setImage(productDTO.getImage());
        }
        if (productDTO.getPrice() != 0) {
            product.setPrice(productDTO.getPrice());
        }
        if (productDTO.getQuantity() != 0) {
            product.setQuantity(productDTO.getQuantity());
        }
        if (productDTO.getInventoryStatus() != null) {
            product.setInventoryStatus(productDTO.getInventoryStatus());
        }
    }
}

