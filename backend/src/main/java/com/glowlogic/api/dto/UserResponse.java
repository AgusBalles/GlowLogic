package com.glowlogic.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

public class UserResponse {

    @Schema(
            description = "Identificador único del usuario",
            example = "1"
    )
    private Long id;

    @Schema(
            description = "Nombre del usuario",
            example = "Agustina"
    )
    private String firstName;

    @Schema(
            description = "Apellido del usuario",
            example = "Ballesteros"
    )
    private String lastName;

    @Schema(
            description = "Correo electrónico del usuario",
            example = "agustina@gmail.com"
    )
    private String email;

    @Schema(
            description = "Indica si el usuario se encuentra activo",
            example = "true"
    )
    private Boolean active;

    @Schema(
            description = "Fecha de creación del usuario",
            example = "2026-08-04T10:30:00"
    )
    private LocalDateTime createdAt;

    @Schema(
            description = "Fecha de la última actualización del usuario",
            example = "2026-08-04T11:15:00"
    )
    private LocalDateTime updatedAt;

    public UserResponse() {
    }

    public UserResponse(
            Long id,
            String firstName,
            String lastName,
            String email,
            Boolean active,
            LocalDateTime createdAt,
            LocalDateTime updatedAt) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.active = active;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
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