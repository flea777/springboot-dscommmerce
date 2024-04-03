package io.github.flea777.springbootdscommerce.repositories;

import io.github.flea777.springbootdscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
