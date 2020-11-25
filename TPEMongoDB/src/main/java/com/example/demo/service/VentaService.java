package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Producto;
import com.example.demo.model.Venta;
import com.example.demo.repository.ProductoRepository;
import com.example.demo.repository.VentaRepository;

@Service
public class VentaService {
	@Autowired
	private VentaRepository ventaRepository;

//	CRUD

	// Create
	public Venta create(List<Producto> productos, String direccion) {
		Venta v = new Venta(productos, direccion );
		return ventaRepository.save(v);
	}

//Read
	public List<Venta> getAll() {
		return ventaRepository.findAll();
	}
	
	//Read
		public Optional<Venta> getById(String id) {
			return ventaRepository.findById(id);
		}
	
	//Update, en general no se actualiza una venta, se cancela la anterior y se factura de vuelta
//	public Producto update(String id, String descripcion, int stock, float precio) {
//		 Producto p =ventaRepository.findById(id);
//		 p.setPrecio(precio);
//		 p.setDescripcion(descripcion);
//		 p.setStock(stock);
//		 p.setPrecio(precio);
//		return ventaRepository.save(p);
//	}

	
	//Delete
	 public void deleteVenta(String id) {
		Optional<Venta> v = ventaRepository.findById(id);
		if(v!=null) {
			this.ventaRepository.deleteById(id);	
		}
	        
	    }
}
