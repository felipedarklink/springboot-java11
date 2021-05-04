package com.felipeosilva.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipeosilva.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
