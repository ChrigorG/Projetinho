package br.com.projetinho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ProjetinhoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetinhoApplication.class, args);
	}

	@GetMapping("/online")
	public String online(){
		return "Server Online";
	}
}
