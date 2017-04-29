package skuptsov.example.starter.bot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import ru.skuptsov.telegram.bot.platform.client.command.Reply;
import ru.skuptsov.telegram.bot.platform.handler.annotation.MessageHandler;
import ru.skuptsov.telegram.bot.platform.handler.annotation.MessageMapping;
import ru.skuptsov.telegram.bot.platform.model.UpdateEvent;

import static ru.skuptsov.telegram.bot.platform.client.command.Reply.withMessage;

@EnableAutoConfiguration
@MessageHandler
public class ExampleBotBootAutoConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(ExampleBotBootAutoConfiguration.class, args);
    }

    @MessageMapping(text = "hi")
    public Reply sayGoodMorning(UpdateEvent updateEvent) {
        return withMessage("Good morning! Happy to see you!", updateEvent);
    }
}