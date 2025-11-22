package com.riverfount.JavaLibraryManager.repositories;

import com.riverfount.JavaLibraryManager.entities.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
