package com.io.luizeduardotsdev.urlshortener.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "url")
public class Url {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String url;
    private String shortUrl;
}
