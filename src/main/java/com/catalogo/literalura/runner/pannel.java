package com.catalogo.literalura.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class pannel implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(pannel.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		boolean running = true;
		while (running) {
			System.out.println("Bienvenido al sistema de gestión.");
			System.out.println("Seleccione una opción:");
			System.out.println("1. Insertar datos");
			System.out.println("2. Consultar datos");
			System.out.println("3. Salir");
			System.out.print("Ingrese el número de la opción: ");

			int opcion;
			try {
				opcion = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Error: por favor ingrese un número válido.");
				continue;
			}

			switch (opcion) {
				case 1:
					System.out.print("Ingrese los datos a insertar: ");
					String datos = scanner.nextLine();
					System.out.println("Datos '" + datos + "' insertados correctamente.");
					break;

				case 2:
					System.out.println("Realizando consulta de datos...");
					System.out.println("Consulta realizada con éxito.");
					break;

				case 3:
					System.out.println("Saliendo del sistema...");
					running = false;
					break;

				default:
					System.out.println("Error: opción no reconocida. Por favor seleccione una opción válida.");
					break;
			}
		}

    }
}
