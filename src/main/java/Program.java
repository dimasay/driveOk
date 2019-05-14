import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

import javax.swing.*;
import java.awt.*;

public class Program {
    public static void main(String[] args) {
        JFrame frame = new JFrame("DriveOk");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(260, 100);
        frame.setVisible(true);
        frame.add(new JLabel("DriveOk server for Telegram was started"), BorderLayout.CENTER);

        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new DriveOk(new MessageProcessor()));
        } catch (TelegramApiRequestException e) {
            e.printStackTrace();
        }
    }
}
