package be.tristan.cli_thing.commands.tools;

import org.springframework.shell.command.annotation.Command;

import java.util.Random;

@Command(group = "tools")
public class DiceWare {

    @Command(command = "diceware", alias = "roll-dice", description = "Roll dice to create a passphrase.")
    public String diceWare(){

        Random random = new Random();
        String result = "";

        for(int i = 0; i < 5; i++){
            result += random.nextInt(6) + 1;
        }

        return result;
    }

}
