package com.riverfount.JavaLibraryManager.repositories;

import com.riverfount.JavaLibraryManager.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
