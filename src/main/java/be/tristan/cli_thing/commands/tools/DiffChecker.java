package be.tristan.cli_thing.commands.tools;

import org.springframework.shell.command.annotation.Command;
import org.springframework.shell.command.annotation.Option;

@Command(group = "tools")
public class DiffChecker {

    @Command(command = "diff", alias = "diffchecker", description = "Check if two strings are equal to each other.")
    public boolean diff(@Option(longNames = "string1", shortNames = 'a', required = true) String string1,
                        @Option(longNames = "string2", shortNames = 'b', required = true) String string2) {
        if (string1.equals(string2)) {
            return true;
        };
        return false;
    }

}
