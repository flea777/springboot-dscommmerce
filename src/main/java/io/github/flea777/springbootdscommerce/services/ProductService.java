package io.github.flea777.springbootdscommerce.services;

import io.github.flea777.springbootdscommerce.dtos.ProductDTO;
import io.github.flea777.springbootdscommerce.entities.Product;
import io.github.flea777.springbootdscommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Product product = repository.findById(id).get();
        return new ProductDTO(product);
    }
}
