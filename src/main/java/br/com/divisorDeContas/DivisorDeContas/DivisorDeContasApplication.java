package br.com.divisorDeContas.DivisorDeContas;

import br.com.divisorDeContas.DivisorDeContas.Principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DivisorDeContasApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DivisorDeContasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}
