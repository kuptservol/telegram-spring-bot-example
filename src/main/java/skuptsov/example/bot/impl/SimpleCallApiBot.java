package skuptsov.example.bot.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.telegram.telegrambots.api.objects.User;
import ru.skuptsov.telegram.bot.platform.client.TelegramBotApi;
import ru.skuptsov.telegram.bot.platform.client.command.MessageResponse;
import ru.skuptsov.telegram.bot.platform.handler.annotation.MessageHandler;
import ru.skuptsov.telegram.bot.platform.handler.annotation.MessageMapping;
import ru.skuptsov.telegram.bot.platform.model.UpdateEvent;

import static ru.skuptsov.telegram.bot.platform.client.command.MessageResponse.sendMessage;

/**
 * @author Sergey Kuptsov
 * @since 30/08/2016
 */
@MessageHandler
public class SimpleCallApiBot {

    @Autowired
    private TelegramBotApi telegramBotApi;

    @MessageMapping(text = "/me")
    public MessageResponse getMe(UpdateEvent updateEvent) {
        User me = telegramBotApi.getMe().get();

        return sendMessage("Me is : " + me.getFirstName() + " " + me.getLastName(), updateEvent);
    }
}
