package com.riverfount.JavaLibraryManager.services;

import com.riverfount.JavaLibraryManager.entities.Address;
import com.riverfount.JavaLibraryManager.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    private final AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public Address save(Address address) {
        return addressRepository.save(address);
    }

    public Optional<Address> findById(Long id) {
        return addressRepository.findById(id);
    }

    public void delete(Long id) {
        addressRepository.deleteById(id);
    }

    public List<Address> findAll() {
        return addressRepository.findAll();
    }
}

