package spring_boot.literalura;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import spring_boot.literalura.service.HttpConection;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		HttpConection api = new HttpConection();

		System.out.println(api.connection("https://gutendex.com/books/"));
	}

}
