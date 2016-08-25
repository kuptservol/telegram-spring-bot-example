package skuptsov.example.bot;

import org.springframework.stereotype.Component;
import ru.skuptsov.telegram.bot.platform.client.NextOffsetStrategy;

import javax.validation.constraints.NotNull;

/**
 * @author Sergey Kuptsov
 * @since 25/08/2016
 */
@Component
public class CustomNextOffsetStrategy implements NextOffsetStrategy {
    private static int currentOffset = 0;

    @Override
    public Integer getNextOffset() {
        return currentOffset += 1;
    }

    @Override
    public void saveLastOffset(@NotNull Integer value) {
        currentOffset = value;
    }

}
