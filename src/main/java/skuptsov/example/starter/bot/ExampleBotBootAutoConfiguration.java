package skuptsov.example.starter.bot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import ru.skuptsov.telegram.bot.platform.client.command.MessageResponse;
import ru.skuptsov.telegram.bot.platform.handler.annotation.MessageHandler;
import ru.skuptsov.telegram.bot.platform.handler.annotation.MessageMapping;
import ru.skuptsov.telegram.bot.platform.model.UpdateEvent;

import static ru.skuptsov.telegram.bot.platform.client.command.MessageResponse.sendMessage;

@EnableAutoConfiguration
@MessageHandler
public class ExampleBotBootAutoConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(ExampleBotBootAutoConfiguration.class, args);
    }

    @MessageMapping(text = "hi")
    public MessageResponse sayGoodMorning(UpdateEvent updateEvent) {
        return sendMessage("Good morning! Happy to see you!", updateEvent);
    }
}