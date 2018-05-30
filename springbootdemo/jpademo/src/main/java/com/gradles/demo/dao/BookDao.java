package com.gradles.demo.dao;

import com.gradles.demo.pojo.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book, Long> {


}
