package com.emanuelzaveruka.bookstoremanager.repository;

import com.emanuelzaveruka.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
