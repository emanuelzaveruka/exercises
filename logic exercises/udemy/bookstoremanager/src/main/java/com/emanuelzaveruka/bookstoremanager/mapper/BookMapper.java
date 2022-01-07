package com.emanuelzaveruka.bookstoremanager.mapper;

import org.mapstruct.Mapper;
import com.emanuelzaveruka.bookstoremanager.dto.BookDTO;
import com.emanuelzaveruka.bookstoremanager.entity.Book;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book toModel(BookDTO bookDTO);

    BookDTO toDTO(BookDTO bookDTO);


}
