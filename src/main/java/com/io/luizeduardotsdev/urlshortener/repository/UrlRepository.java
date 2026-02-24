package com.io.luizeduardotsdev.urlshortener.repository;

import com.io.luizeduardotsdev.urlshortener.domain.Url;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UrlRepository extends JpaRepository<Url, Long> {
    Long id(Long id);
}
