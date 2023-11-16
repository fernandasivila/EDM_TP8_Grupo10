package ar.edu.unju.escmi.poo.tp8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.escmi.poo.tp8.collections.CollectionEmpresa;
import ar.edu.unju.escmi.poo.tp8.collections.CollectionTicket;

@SpringBootApplication
public class ProyectoTp8Application {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoTp8Application.class, args);
		CollectionTicket.precargarTickets();
		CollectionEmpresa.precargarEmpresas();
	}

}
