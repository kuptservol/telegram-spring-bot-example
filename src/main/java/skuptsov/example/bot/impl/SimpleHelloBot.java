package skuptsov.example.bot.impl;

import ru.skuptsov.telegram.bot.platform.client.command.Reply;
import ru.skuptsov.telegram.bot.platform.client.command.ReplyTo;
import ru.skuptsov.telegram.bot.platform.handler.annotation.MessageHandler;
import ru.skuptsov.telegram.bot.platform.handler.annotation.MessageMapping;
import ru.skuptsov.telegram.bot.platform.model.UpdateEvent;

/**
 * @author Sergey Kuptsov
 * @since 04/07/2016
 */
@MessageHandler
public class SimpleHelloBot {

    @MessageMapping(text = "Hi")
    public Reply sayHi(UpdateEvent updateEvent) {
        return ReplyTo.to(updateEvent).withMessage("Hi there!")
                .setCallback(message -> System.out.println("Message sent"));
    }

    @MessageMapping(regexp = "(.*(g|G)ood.*morning.*)")
    public Reply sayGoodMorning(UpdateEvent updateEvent) {
        return ReplyTo.to(updateEvent).withMessage("Good morning! Happy to see you!");
    }
}
