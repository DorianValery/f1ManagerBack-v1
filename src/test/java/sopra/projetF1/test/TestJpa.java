package sopra.projetF1.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sopra.projetF1.config.ApplicationConfig;

public class TestJpa {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext spring = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		spring.close();
	}

}
