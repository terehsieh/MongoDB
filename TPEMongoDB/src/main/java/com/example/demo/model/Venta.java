package com.example.demo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "venta")
public class Venta {
	@Id
	private  String id;
	    private transient List<Producto> productos;
	    private String direccion;
	    
	    
		public Venta(List<Producto> productos, String direccion) {
			super();
			this.productos = productos;
			this.direccion = direccion;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public List<Producto> getProductos() {
			return productos;
		}
		public void setProductos(List<Producto> productos) {
			this.productos = productos;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		
		
		@Override
		public String toString() {
			return "Venta [id=" + id + ", direccion=" + direccion + "]";
		}


	  
}
