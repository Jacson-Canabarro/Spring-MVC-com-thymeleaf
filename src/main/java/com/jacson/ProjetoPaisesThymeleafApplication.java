package com.jacson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jacson.entities.Pais;
import com.jacson.repository.PaisRepository;

@SpringBootApplication
public class ProjetoPaisesThymeleafApplication implements CommandLineRunner{
	
	
	@Autowired
	private PaisRepository paisRepo;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoPaisesThymeleafApplication.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		paisRepo.save(new Pais("Brasil","Brasilia"));
		paisRepo.save(new Pais("China","Pequim"));
		paisRepo.save(new Pais("Chile","Santiago"));
		paisRepo.save(new Pais("Argentina","Buenos Aires"));
		paisRepo.save(new Pais("EUA","Washington, D.C."));
		paisRepo.save(new Pais("Alemanha","Berlin"));
		paisRepo.save(new Pais("Nova Zelandia","Wellington"));	
		paisRepo.save(new Pais("Australia","Canberra"));	
		paisRepo.save(new Pais("Namibia","Windhoek"));
		paisRepo.save(new Pais("Hawaii","Honolulu"));
		paisRepo.save(new Pais("Mexico","Mexico City"));
		paisRepo.save(new Pais("Paquistao","Islamabad"));
	}
	
	
}
