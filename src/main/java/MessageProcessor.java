import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class MessageProcessor {
    public SendMessage process(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId());
        chooseAction(message, sendMessage);
        return sendMessage;
    }

    private void chooseAction(Message message, SendMessage sendMessage) {
        switch (message.getText()) {
            case "/start":
                setMainButtons(sendMessage);
                break;
            case "Проезд на красный цвет":
                setSecondButtons(sendMessage);
                break;
            case "Проверка видеорегистратора":
            case "Назад":
                setThirdButtons(sendMessage);
                break;
            case "Отсутствие записи":
                setFourthButtons(sendMessage);
                break;
            case "Красный сигнал светофора":
                setRedButtons(sendMessage);
                break;
            case "Оплатить штраф":
            case "Cпособы оплаты":
                setPayButtons(sendMessage);
                break;
            case "Приват 24":
                setPrivatButtons(sendMessage);
                break;
            case "Онлайн сервис (Штрафы UA)":
                setOnlineShtrafButtons(sendMessage);
                break;
            case "Мигающий сигнал светофора":
                setBlinkButtons(sendMessage);
                break;
            case "Нарушение":
                setNarushButtons(sendMessage);
                break;
            case "Завершение маневра":
                setEndManButtons(sendMessage);
                break;
        }
    }

    private void setMainButtons(SendMessage sendMessage) {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRows = new ArrayList<>();

        KeyboardRow mainKeyboardRow = new KeyboardRow();
        mainKeyboardRow.add(new KeyboardButton("Проезд на красный цвет"));
        keyboardRows.add(mainKeyboardRow);

        replyKeyboardMarkup.setKeyboard(keyboardRows);

        sendMessage.setText("Выберите действие");
    }

    private void setSecondButtons(SendMessage sendMessage) {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRows = new ArrayList<>();

        KeyboardRow mainKeyboardRow = new KeyboardRow();
        mainKeyboardRow.add(new KeyboardButton("Проверка видеорегистратора"));
        keyboardRows.add(mainKeyboardRow);

        replyKeyboardMarkup.setKeyboard(keyboardRows);

        sendMessage.setText("Выберите действие");
    }

    private void setThirdButtons(SendMessage sendMessage) {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRows = new ArrayList<>();

        KeyboardRow mainKeyboardRow = new KeyboardRow();
        mainKeyboardRow.add(new KeyboardButton("Отсутствие записи"));

        KeyboardRow mainKeyboardRow2 = new KeyboardRow();
        mainKeyboardRow2.add(new KeyboardButton("Красный сигнал светофора"));

        KeyboardRow mainKeyboardRow3 = new KeyboardRow();
        mainKeyboardRow3.add(new KeyboardButton("Мигающий сигнал светофора"));

        keyboardRows.add(mainKeyboardRow);
        keyboardRows.add(mainKeyboardRow2);
        keyboardRows.add(mainKeyboardRow3);

        replyKeyboardMarkup.setKeyboard(keyboardRows);

        sendMessage.setText("Выберите действие");
    }

    private void setFourthButtons(SendMessage sendMessage) {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRows = new ArrayList<>();

        KeyboardRow mainKeyboardRow = new KeyboardRow();
        mainKeyboardRow.add(new KeyboardButton("Назад"));
        keyboardRows.add(mainKeyboardRow);

        replyKeyboardMarkup.setKeyboard(keyboardRows);

        sendMessage.setText("Невозможно доказать");
    }

    private void setRedButtons(SendMessage sendMessage) {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRows = new ArrayList<>();

        KeyboardRow mainKeyboardRow = new KeyboardRow();
        mainKeyboardRow.add(new KeyboardButton("Оплатить штраф"));
        keyboardRows.add(mainKeyboardRow);

        replyKeyboardMarkup.setKeyboard(keyboardRows);

        sendMessage.setText("Оплата штрафа \nП 8.7.3.у ч2 ст122\n Санкция 425 гривен");
    }

    private void setPayButtons(SendMessage sendMessage) {
        //todo доделать
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRows = new ArrayList<>();

        KeyboardRow mainKeyboardRow = new KeyboardRow();
        mainKeyboardRow.add(new KeyboardButton("Приват 24"));

        KeyboardRow mainKeyboardRow2 = new KeyboardRow();
        mainKeyboardRow2.add(new KeyboardButton("Через терминал полицейского"));

        KeyboardRow mainKeyboardRow3 = new KeyboardRow();
        mainKeyboardRow3.add(new KeyboardButton("В полиции через терминал"));

        KeyboardRow mainKeyboardRow4 = new KeyboardRow();
        mainKeyboardRow4.add(new KeyboardButton("Онлайн сервис (Штрафы UA)"));

        KeyboardRow mainKeyboardRow5 = new KeyboardRow();
        mainKeyboardRow5.add(new KeyboardButton("Касса банка"));

        KeyboardRow mainKeyboardRow6 = new KeyboardRow();
        mainKeyboardRow6.add(new KeyboardButton("Поручение юристу"));

        KeyboardRow mainKeyboardRow7 = new KeyboardRow();
        mainKeyboardRow7.add(new KeyboardButton("Назад"));

        keyboardRows.add(mainKeyboardRow);
        keyboardRows.add(mainKeyboardRow2);
        keyboardRows.add(mainKeyboardRow3);
        keyboardRows.add(mainKeyboardRow4);
        keyboardRows.add(mainKeyboardRow5);
        keyboardRows.add(mainKeyboardRow6);
        keyboardRows.add(mainKeyboardRow7);

        replyKeyboardMarkup.setKeyboard(keyboardRows);

        sendMessage.setText("Выберите действие");
    }

    private void setPrivatButtons(SendMessage sendMessage) {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRows = new ArrayList<>();

        KeyboardRow mainKeyboardRow = new KeyboardRow();
        mainKeyboardRow.add(new KeyboardButton("Назад"));
        keyboardRows.add(mainKeyboardRow);

        replyKeyboardMarkup.setKeyboard(keyboardRows);

        sendMessage.setText("https://www.privat24.ua/");
    }

    private void setOnlineShtrafButtons(SendMessage sendMessage) {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRows = new ArrayList<>();

        KeyboardRow mainKeyboardRow = new KeyboardRow();
        mainKeyboardRow.add(new KeyboardButton("Назад"));
        keyboardRows.add(mainKeyboardRow);

        replyKeyboardMarkup.setKeyboard(keyboardRows);

        sendMessage.setText("https://police.kiev.ua/pdr/oplata-shtrafa-pdr?gclid=Cj0KCQjwzunmBRDsARIsAGrt4muMFDQdIrrjocNrZ9vXGSpz1ZuGW-s47-z3YRZFbIv0yWVdY--FqOcaAmP7EALw_wcB");
    }

    private void setBlinkButtons(SendMessage sendMessage) {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRows = new ArrayList<>();

        KeyboardRow mainKeyboardRow = new KeyboardRow();
        mainKeyboardRow.add(new KeyboardButton("Нарушение"));

        KeyboardRow mainKeyboardRow2 = new KeyboardRow();
        mainKeyboardRow2.add(new KeyboardButton("Завершение маневра"));

        keyboardRows.add(mainKeyboardRow);
        keyboardRows.add(mainKeyboardRow2);

        replyKeyboardMarkup.setKeyboard(keyboardRows);

        sendMessage.setText("Выберите действие");
    }

    private void setNarushButtons(SendMessage sendMessage) {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRows = new ArrayList<>();

        KeyboardRow mainKeyboardRow = new KeyboardRow();
        mainKeyboardRow.add(new KeyboardButton("Cпособы оплаты"));
        keyboardRows.add(mainKeyboardRow);

        replyKeyboardMarkup.setKeyboard(keyboardRows);

        sendMessage.setText("Выберите действие");
    }

    private void setEndManButtons(SendMessage sendMessage) {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRows = new ArrayList<>();

        KeyboardRow mainKeyboardRow = new KeyboardRow();
        mainKeyboardRow.add(new KeyboardButton("Не является нарушением"));

        KeyboardRow mainKeyboardRow2 = new KeyboardRow();
        mainKeyboardRow2.add(new KeyboardButton("Звонок юристу для консультации"));

        KeyboardRow mainKeyboardRow3 = new KeyboardRow();
        mainKeyboardRow3.add(new KeyboardButton("Назад"));

        keyboardRows.add(mainKeyboardRow);
        keyboardRows.add(mainKeyboardRow2);
        keyboardRows.add(mainKeyboardRow3);

        replyKeyboardMarkup.setKeyboard(keyboardRows);

        sendMessage.setText("Выберите действие");
    }
}
