package com.adventures.MineStore.repo;

import com.adventures.MineStore.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
