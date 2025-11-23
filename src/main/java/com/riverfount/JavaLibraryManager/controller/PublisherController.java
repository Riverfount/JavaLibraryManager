package com.riverfount.JavaLibraryManager.controller;

import com.riverfount.JavaLibraryManager.entities.Publisher;
import com.riverfount.JavaLibraryManager.services.PublisherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/publisher")
@RequiredArgsConstructor
public class PublisherController {
    public final PublisherService publisherService;

    @PostMapping
    public ResponseEntity<Void> createPublisher(@RequestBody Publisher publisher) {
        publisherService.save(publisher);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<Publisher>> getAllPublishers(){
        return ResponseEntity.ok(publisherService.findAll());
    }
}
