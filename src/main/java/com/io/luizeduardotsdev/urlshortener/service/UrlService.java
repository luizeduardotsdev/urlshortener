package com.io.luizeduardotsdev.urlshortener.service;

import com.io.luizeduardotsdev.urlshortener.repository.UrlRepository;
import org.springframework.stereotype.Service;

@Service
public class UrlService {
    private final UrlRepository repository;

    public UrlService(UrlRepository repository) {
        this.repository = repository;
    }
}
