package com.springboot.app.products.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.app.products.domain.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long>{

}
