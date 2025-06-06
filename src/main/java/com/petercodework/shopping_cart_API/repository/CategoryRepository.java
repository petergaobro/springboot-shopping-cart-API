package com.petercodework.shopping_cart_API.repository;

import com.petercodework.shopping_cart_API.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);
}
