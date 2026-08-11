package com.glowlogic.api.service;

import com.glowlogic.api.dto.UserResponse;
import com.glowlogic.api.entity.User;
import com.glowlogic.api.repository.UserRepository;
import org.springframework.stereotype.Service;
import com.glowlogic.api.dto.UserRequest;
import java.util.List;
import com.glowlogic.api.exception.UserNotFoundException;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserResponse> getAllUsers() {
        return userRepository.findByActiveTrue()
                .stream()
                .map(this::toResponse)
                .toList();
    }
    public UserResponse createUser(UserRequest request) {

        User user = new User();

        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setActive(true);

        User savedUser = userRepository.save(user);

        return toResponse(savedUser);


    }
    public UserResponse getUserById(Long id) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));

        return toResponse(user);
    }

    public UserResponse updateUser(Long id, UserRequest request) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));

        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        User updatedUser = userRepository.save(user);

        return toResponse(updatedUser);
    }

    private UserResponse toResponse(User user) {
        return new UserResponse(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getActive(),
                user.getCreatedAt(),
                user.getUpdatedAt()
        );
    }
    public void deleteUser(Long id) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));

        user.setActive(false);

        userRepository.save(user);
    }

}