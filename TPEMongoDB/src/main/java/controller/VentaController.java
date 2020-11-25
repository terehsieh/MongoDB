package controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Producto;
import com.example.demo.model.Venta;
import com.example.demo.service.VentaService;

@RestController
public class VentaController {
@Autowired
	private VentaService ventaService;
//CRUD

//	Create
@RequestMapping("/create")
public String create(@RequestParam List<Producto> productos,@RequestParam String direccion ) {
	Venta v = ventaService.create(productos, direccion);
	return v.toString();
}

//Read
@RequestMapping("/get")
public Optional<Venta> getProducto(@RequestParam String id ) {
	return ventaService.getById(id);
	
}

@RequestMapping("/getAll")
public List<Venta> getAll() {
	return ventaService.getAll();
	
}

//Update, general no se actualiza una venta, se elimina y luego se crea uno nuevo

//Delete one product
@RequestMapping("/delete")
public String delete(@RequestParam String id) {
	ventaService.deleteVenta(id);
	return "Se ha eliminado la venta con" + id;
}
}
