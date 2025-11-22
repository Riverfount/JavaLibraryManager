package com.riverfount.JavaLibraryManager.services;

import com.riverfount.JavaLibraryManager.entities.Publisher;
import com.riverfount.JavaLibraryManager.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PublisherService {
    public final PublisherRepository publisherRepository;

    @Autowired
    public PublisherService(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    public Optional<Publisher> findById(Long id) {
        return publisherRepository.findById(id);
    }

    public Publisher save(Publisher publisher) {
        return publisherRepository.save(publisher);
    }

    public void delete(Publisher publisher) {
        publisherRepository.delete(publisher);
    }
}
