package com.catalogo.literalura;

import com.catalogo.literalura.model.DatosConsumirApi;
import com.catalogo.literalura.service.ConvertirDatos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.catalogo.literalura.service.ConsumirApi;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var url = "https://gutendex.com/books/";
		var consumirApi = new ConsumirApi();
		var json = consumirApi.datosApi(url);
		ConvertirDatos conversor = new ConvertirDatos();
		var datos = conversor.obtenerDatos(json, DatosConsumirApi.class);
		System.out.println(datos);
	}
}
