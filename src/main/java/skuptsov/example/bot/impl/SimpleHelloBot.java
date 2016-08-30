package skuptsov.example.bot.impl;

import org.telegram.telegrambots.api.objects.Message;
import ru.skuptsov.telegram.bot.platform.client.command.MessageResponse;
import ru.skuptsov.telegram.bot.platform.handler.annotation.MessageHandler;
import ru.skuptsov.telegram.bot.platform.handler.annotation.MessageMapping;
import ru.skuptsov.telegram.bot.platform.model.UpdateEvent;

import java.util.function.Consumer;

import static ru.skuptsov.telegram.bot.platform.client.command.MessageResponse.sendMessage;

/**
 * @author Sergey Kuptsov
 * @since 04/07/2016
 */
@MessageHandler
public class SimpleHelloBot {

    @MessageMapping(text = "Hi")
    public MessageResponse sayHi(UpdateEvent updateEvent){
        return sendMessage("Hi there!", updateEvent)
                .setCallback((Consumer<Message>) message -> System.out.println("Message sent"));
    }

    @MessageMapping(regexp = "(.*(g|G)ood.*morning.*)")
    public MessageResponse sayGoodMorning(UpdateEvent updateEvent) {
        return sendMessage("Good morning! Happy to see you!", updateEvent);
    }
}
