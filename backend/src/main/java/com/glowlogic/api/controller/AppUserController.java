package com.glowlogic.api.controller;

import com.glowlogic.api.dto.AppUserResponse;
import com.glowlogic.api.service.AppUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.glowlogic.api.dto.AppUserRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class AppUserController {

    private final AppUserService appUserService;

    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @GetMapping("/api/users")
    public List<AppUserResponse> getAllUsers() {
        return appUserService.getAllUsers();
    }

    @PostMapping("/api/users")
    public AppUserResponse createUser(@RequestBody AppUserRequest request) {
        return appUserService.createUser(request);
    }

    @GetMapping("/api/users/{id}")
    public AppUserResponse getUserById(@PathVariable Long id) {
        return appUserService.getUserById(id);
    }
}