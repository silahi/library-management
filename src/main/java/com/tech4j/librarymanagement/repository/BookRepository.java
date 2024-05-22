package com.tech4j.librarymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tech4j.librarymanagement.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    // Ajoutez ici des méthodes personnalisées si nécessaire
}
