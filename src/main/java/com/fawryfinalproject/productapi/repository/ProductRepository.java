package com.fawryfinalproject.productapi.repository;

import com.fawryfinalproject.productapi.entity.ProductEntity;
import lombok.extern.java.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<ProductEntity,Long> {

    List<ProductEntity> findByCategoryNameContaining(String name);
    @Query("SELECT product FROM ProductEntity product WHERE CAST(product.id AS string) LIKE %:id%")
    List<ProductEntity> findByIdContaining(@Param("id") String id);

    List<ProductEntity> findByNameContaining(String name);


}
