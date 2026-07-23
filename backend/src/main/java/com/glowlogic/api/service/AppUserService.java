package com.glowlogic.api.service;

import com.glowlogic.api.dto.AppUserResponse;
import com.glowlogic.api.entity.AppUser;
import com.glowlogic.api.repository.AppUserRepository;
import org.springframework.stereotype.Service;
import com.glowlogic.api.dto.AppUserRequest;
import java.util.List;

@Service
public class AppUserService {

    private final AppUserRepository appUserRepository;

    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    public List<AppUserResponse> getAllUsers() {
        return appUserRepository.findAll()
                .stream()
                .map(this::toResponse)
                .toList();
    }
    public AppUserResponse createUser(AppUserRequest request) {

        AppUser user = new AppUser();

        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setActive(true);

        AppUser savedUser = appUserRepository.save(user);

        return toResponse(savedUser);


    }
    public AppUserResponse getUserById(Long id) {

        AppUser user = appUserRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        return toResponse(user);
    }


    private AppUserResponse toResponse(AppUser user) {
        return new AppUserResponse(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getActive(),
                user.getCreatedAt(),
                user.getUpdatedAt()
        );
    }
}