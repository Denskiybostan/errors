package example;

import org.springframework.web.bind.annotation.RequestParam;

public class WrongLoginException {
    public String login() {
        if (login().contains("[a-z]+") || login().contains("[0-9]+") || login().contains("_")) {
            return "логин введен корректно";
        }else {
            return "логин введен некорректно";
        }

    }
}
