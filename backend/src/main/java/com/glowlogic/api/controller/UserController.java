package com.glowlogic.api.controller;

import com.glowlogic.api.dto.UserRequest;
import com.glowlogic.api.dto.UserResponse;
import com.glowlogic.api.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@Tag(
        name = "Usuarios",
        description = "Operaciones relacionadas con la gestión de usuarios del sistema"
)
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @Operation(
            summary = "Obtener todos los usuarios",
            description = "Retorna una lista con todos los usuarios activos registrados en el sistema."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Usuarios obtenidos correctamente")
    })
    @GetMapping
    public List<UserResponse> getAllUsers() {
        return userService.getAllUsers();
    }


    @Operation(
            summary = "Crear un nuevo usuario",
            description = "Permite registrar un nuevo usuario dentro del sistema."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Usuario creado correctamente"),
            @ApiResponse(responseCode = "400", description = "Datos enviados inválidos")
    })
    @PostMapping
    public UserResponse createUser(
            @Valid @RequestBody UserRequest request) {

        return userService.createUser(request);
    }


    @Operation(
            summary = "Obtener usuario por ID",
            description = "Busca un usuario específico utilizando su identificador único."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Usuario encontrado"),
            @ApiResponse(responseCode = "404", description = "Usuario no encontrado")
    })
    @GetMapping("/{id}")
    public UserResponse getUserById(
            @PathVariable Long id) {

        return userService.getUserById(id);
    }


    @Operation(
            summary = "Actualizar un usuario",
            description = "Modifica la información de un usuario existente."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Usuario actualizado correctamente"),
            @ApiResponse(responseCode = "400", description = "Datos enviados inválidos"),
            @ApiResponse(responseCode = "404", description = "Usuario no encontrado")
    })
    @PutMapping("/{id}")
    public UserResponse updateUser(
            @PathVariable Long id,
            @Valid @RequestBody UserRequest request) {

        return userService.updateUser(id, request);
    }


    @Operation(
            summary = "Eliminar un usuario",
            description = "Realiza una eliminación lógica del usuario cambiando su estado a inactivo."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Usuario eliminado correctamente"),
            @ApiResponse(responseCode = "404", description = "Usuario no encontrado")
    })
    @DeleteMapping("/{id}")
    public void deleteUser(
            @PathVariable Long id) {

        userService.deleteUser(id);
    }

}