import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class DriveOk extends TelegramLongPollingBot {
    private MessageProcessor messageProcessor;

    DriveOk(MessageProcessor messageProcessor) {
        this.messageProcessor = messageProcessor;
    }

    @Override
    public void onUpdateReceived(Update update) {
        SendMessage sendMessage = messageProcessor.process(update.getMessage());
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() {
        return "DriveOK_od";
    }

    @Override
    public String getBotToken() {
        return "802044498:AAGhKmmBpTOgsfF7hFCi8L8VMTf6QTkyBIU";
    }
}
