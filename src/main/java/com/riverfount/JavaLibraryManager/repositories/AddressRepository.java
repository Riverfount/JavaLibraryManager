package com.riverfount.JavaLibraryManager.repositories;

import com.riverfount.JavaLibraryManager.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
