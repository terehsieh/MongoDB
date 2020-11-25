package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Producto;
import com.example.demo.repository.ProductoRepository;

@Service
public class ProductoService {
	@Autowired
	private ProductoRepository productoRepository;

//	CRUD

	// Create
	public Producto create(String nombre, String descripcion, int stock, float precio) {
		Producto p = new Producto(nombre, descripcion, stock, precio);
		return productoRepository.save(p);
	}

//Read
	public List<Producto> getAll() {
		return productoRepository.findAll();
	}
	
	//Read
		public Producto getByNombre(String nombre) {
			return productoRepository.findByNombre(nombre);
		}
	
	//Update
	public Producto update(String nombre, String descripcion, int stock, float precio) {
		 Producto p = productoRepository.findByNombre(nombre);
		 p.setPrecio(precio);
		 p.setDescripcion(descripcion);
		 p.setStock(stock);
		 p.setPrecio(precio);
		return productoRepository.save(p);
	}

	
	//Delete
	 public void deleteProducto(String nombre) {
		 Producto p = productoRepository.findByNombre(nombre);
	        this.productoRepository.delete(p);
	    }
}
