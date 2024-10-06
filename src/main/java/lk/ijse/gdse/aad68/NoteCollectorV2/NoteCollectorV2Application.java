package lk.ijse.gdse.aad68.NoteCollectorV2;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NoteCollectorV2Application {

	public static void main(String[] args) {
		SpringApplication.run(NoteCollectorV2Application.class, args);
	}
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
