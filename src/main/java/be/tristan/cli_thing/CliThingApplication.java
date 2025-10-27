package be.tristan.cli_thing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.command.annotation.CommandScan;

@CommandScan
@SpringBootApplication
public class CliThingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CliThingApplication.class, args);
	}

}
