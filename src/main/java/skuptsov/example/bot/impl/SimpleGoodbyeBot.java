package skuptsov.example.bot.impl;

import org.springframework.stereotype.Component;
import ru.skuptsov.telegram.bot.platform.client.command.MessageResponse;
import ru.skuptsov.telegram.bot.platform.handler.MessageTextMessageHandler;
import ru.skuptsov.telegram.bot.platform.model.UpdateEvent;

import java.util.Set;

import static com.google.common.collect.ImmutableSet.of;
import static ru.skuptsov.telegram.bot.platform.client.command.MessageResponse.sendMessage;

/**
 * @author Sergey Kuptsov
 * @since 25/08/2016
 */
@Component
public class SimpleGoodbyeBot implements MessageTextMessageHandler {

    @Override
    public Set<String> getMessageText() {
        return of("Bye", "GoodBye");
    }

    @Override
    public MessageResponse handle(UpdateEvent updateEvent) {
        return sendMessage("Goodbye! See you soon!", updateEvent);
    }
}
