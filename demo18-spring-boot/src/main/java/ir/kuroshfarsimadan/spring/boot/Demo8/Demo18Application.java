package ir.kuroshfarsimadan.spring.boot.Demo8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo18Application {

	public static void main(String[] args) {
		// Tester tester = new Tester(2, "Example test");
		// System.out.println(tester.toString());
		ApplicationContext ac = SpringApplication.run(Demo18Application.class, args); // Commented or as is
		Tester tester = ac.getBean(Tester.class);
		System.out.println(tester.toString());
	}
}
