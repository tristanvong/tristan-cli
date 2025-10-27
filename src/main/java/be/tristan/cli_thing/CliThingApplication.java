package be.tristan.cli_thing;

import be.tristan.cli_thing.commands.tools.DiffChecker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.command.annotation.EnableCommand;

@SpringBootApplication
@EnableCommand(DiffChecker.class)
public class CliThingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CliThingApplication.class, args);
	}

}
