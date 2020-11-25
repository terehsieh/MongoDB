package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.model.Producto;
import com.example.demo.repository.ProductoRepository;
import com.example.demo.repository.VentaRepository;
@ComponentScan({"main.controllers", "main.repositories"})
@SpringBootApplication
public class TpeMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpeMongoDbApplication.class, args);
	}
	
	 @Bean
	    public CommandLineRunner run(ProductoRepository productoRepository, VentaRepository ventaRepository) throws Exception {
	        return (String[] args) -> {

//	           

	        };
	 }
}
