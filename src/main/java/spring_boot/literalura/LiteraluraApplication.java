package spring_boot.literalura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import spring_boot.literalura.main.Main;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner{

	@Autowired
	private Main principal;

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		principal.menu();
	}

}
