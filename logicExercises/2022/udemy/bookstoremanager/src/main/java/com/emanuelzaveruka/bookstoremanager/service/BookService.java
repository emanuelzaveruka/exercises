package com.emanuelzaveruka.bookstoremanager.service;

import com.emanuelzaveruka.bookstoremanager.dto.BookDTO;
import com.emanuelzaveruka.bookstoremanager.dto.MessageResponseDTO;
import com.emanuelzaveruka.bookstoremanager.entity.Book;
import com.emanuelzaveruka.bookstoremanager.mapper.BookMapper;
import com.emanuelzaveruka.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService {

    private final BookMapper bookMapper = BookMapper.INSTANCE;

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(BookDTO bookDTO){
        Book BookToSave = bookMapper.toModel(bookDTO);

        Book savedBook = bookRepository.save(BookToSave);
        return MessageResponseDTO.builder()
                .message("Book created with ID: " + savedBook.getId())
                .build();
    }
}
