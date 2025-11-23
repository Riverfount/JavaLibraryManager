package com.riverfount.JavaLibraryManager.services;

import com.riverfount.JavaLibraryManager.entities.Address;
import com.riverfount.JavaLibraryManager.entities.User;
import com.riverfount.JavaLibraryManager.repositories.UserRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User updateUserById(Long id, @NotNull User user) {
        User oldUser = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));

        if (user.getEmail() != null) oldUser.setEmail(user.getEmail());
        if (user.getName() != null) oldUser.setName(user.getName());
        if (user.getCPF() != null) oldUser.setCPF(user.getCPF());
        if (user.getActiveLoans() != null) oldUser.setActiveLoans(user.getActiveLoans());
        if (user.getPhone() != null) oldUser.setPhone(user.getPhone());

        Address oldAddress = oldUser.getAddress();
        Address newAddress = user.getAddress();
        if (newAddress != null) {
            if (oldAddress == null) {
                oldUser.setAddress(newAddress);
            } else {
                if (newAddress.getStreet() != null) oldAddress.setStreet(newAddress.getStreet());
                if (newAddress.getCity() != null) oldAddress.setCity(newAddress.getCity());
                if (newAddress.getState() != null) oldAddress.setState(newAddress.getState());
                if (newAddress.getZip() != null) oldAddress.setZip(newAddress.getZip());
                if (newAddress.getCountry() != null) oldAddress.setCountry(newAddress.getCountry());
            }
        }

        userRepository.saveAndFlush(oldUser);
        return oldUser;
    }

}

