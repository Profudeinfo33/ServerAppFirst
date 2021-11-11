package com.dinu.serverappfirst;

import com.dinu.serverappfirst.model.Server;
import com.dinu.serverappfirst.repository.ServerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.dinu.serverappfirst.enumeration.Status.SERVER_DOWN;
import static com.dinu.serverappfirst.enumeration.Status.SERVER_UP;

@SpringBootApplication
public class ServerAppFirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerAppFirstApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepository serverRepository){
		return args -> {
			serverRepository.save(new Server(null, "192.168.1.160", "Ubuntu Linux", "16GB", "Personal PC", "http://localhost:8080/server/image/server1.png", SERVER_UP));
			serverRepository.save(new Server(null, "192.168.1.58", "Fedora Linux", "16GB", "Office PC", "http://localhost:8080/server/image/server2.png", SERVER_DOWN));
			serverRepository.save(new Server(null, "192.168.1.21", "MS 2008", "32GB", "Home PC", "http://localhost:8080/server/image/server3.png", SERVER_UP));
			serverRepository.save(new Server(null, "192.168.1.14", "RED Linux", "64GB", "Laptop", "http://localhost:8080/server/image/server4.png", SERVER_DOWN));
		};
		}

}
