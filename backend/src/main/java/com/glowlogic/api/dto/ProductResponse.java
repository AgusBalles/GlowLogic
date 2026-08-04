package com.glowlogic.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductResponse {

    @Schema(
            description = "Identificador único del producto",
            example = "1"
    )
    private Long id;

    @Schema(
            description = "Nombre del producto",
            example = "Base Fit Me Matte"
    )
    private String name;

    @Schema(
            description = "Descripción del producto",
            example = "Base líquida de larga duración con acabado mate"
    )
    private String description;

    @Schema(
            description = "Precio del producto",
            example = "12990"
    )
    private BigDecimal price;

    @Schema(
            description = "Cantidad disponible en inventario",
            example = "20"
    )
    private Integer stock;

    @Schema(
            description = "Indica si el producto se encuentra activo",
            example = "true"
    )
    private Boolean active;

    @Schema(
            description = "Fecha de creación del producto",
            example = "2026-08-04T10:30:00"
    )
    private LocalDateTime createdAt;

    @Schema(
            description = "Fecha de la última actualización del producto",
            example = "2026-08-04T11:15:00"
    )
    private LocalDateTime updatedAt;

    public ProductResponse() {
    }

    public ProductResponse(
            Long id,
            String name,
            String description,
            BigDecimal price,
            Integer stock,
            Boolean active,
            LocalDateTime createdAt,
            LocalDateTime updatedAt) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.active = active;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }

    public Boolean getActive() {
        return active;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}