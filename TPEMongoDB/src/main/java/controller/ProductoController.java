package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Producto;
import com.example.demo.service.ProductoService;

@RestController
public class ProductoController {
@Autowired
	private ProductoService productoService;
//CRUD

//	Create
@RequestMapping("/create")
public String create(@RequestParam String nombre,@RequestParam String descripcion,@RequestParam int stock, @RequestParam float precio ) {
	Producto p = productoService.create(nombre, descripcion, stock, precio);
	return p.toString();
}

//Get one product
@RequestMapping("/get")
public Producto getProducto(@RequestParam String nombre ) {
	return productoService.getByNombre(nombre);
	
}

//Get all products
@RequestMapping("/getAll")
public List<Producto> getAll() {
	return productoService.getAll();
	
}

//Update one product
@RequestMapping("/update")
public String update(@RequestParam String nombre,@RequestParam String descripcion,@RequestParam int stock, @RequestParam float precio ) {
	Producto p = productoService.create(nombre, descripcion, stock, precio);
	return p.toString();
}

//Delete one product
@RequestMapping("/delete")
public String delete(@RequestParam String nombre) {
	productoService.deleteProducto(nombre);
	return "Se ha eliminado " + nombre;
}

}
