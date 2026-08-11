package com.glowlogic.api.exception;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(Long id) {
        super("Producto con ID " + id + " no encontrado");
    }

}