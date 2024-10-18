package dev.zakir.product_services.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.zakir.product_services.models.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
}
