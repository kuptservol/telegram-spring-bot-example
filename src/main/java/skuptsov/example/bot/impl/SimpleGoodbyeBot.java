package skuptsov.example.bot.impl;

import org.springframework.stereotype.Component;
import ru.skuptsov.telegram.bot.platform.client.command.Reply;
import ru.skuptsov.telegram.bot.platform.client.command.ReplyTo;
import ru.skuptsov.telegram.bot.platform.handler.MessageTextMessageHandler;
import ru.skuptsov.telegram.bot.platform.model.UpdateEvent;

import java.util.Set;

import static com.google.common.collect.ImmutableSet.of;

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
    public Reply handle(UpdateEvent updateEvent) {
        return ReplyTo.to(updateEvent).withMessage("Goodbye! See you soon!");
    }
}
