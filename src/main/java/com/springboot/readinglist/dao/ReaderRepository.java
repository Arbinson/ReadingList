package com.springboot.readinglist.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.readinglist.entities.Reader;

public interface ReaderRepository extends JpaRepository<Reader, String> {

}
