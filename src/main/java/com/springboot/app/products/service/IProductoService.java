package com.springboot.app.products.service;

import java.util.List;

import com.springboot.app.products.domain.Producto;

public interface IProductoService {

	public List<Producto> findAll();

	public Producto findById(Long id);

}
