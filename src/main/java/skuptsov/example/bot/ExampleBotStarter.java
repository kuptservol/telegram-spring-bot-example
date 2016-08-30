package skuptsov.example.bot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.skuptsov.telegram.bot.platform.config.BotPlatformStarter;

/**
 * @author Sergey Kuptsov
 * @since 04/07/2016
 */
@Configuration
@ComponentScan(value = "skuptsov.example.bot")
public class ExampleBotStarter {
    public static void main(String[] args) {
        BotPlatformStarter.start(ExampleBotStarter.class, args);
    }
}
