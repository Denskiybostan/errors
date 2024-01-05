package example;

public class Account {
    private static final String CHECK = "^[a-zA-Z0-9]*$";
    public static void account (String login, String password, String confirmPassword) {
        if (!login.matches(CHECK)) {
            throw new RuntimeException("В логине присутствуют недопустимые символы");
        }
        if (login.length() > 20) {
            throw new RuntimeException("Длина логина выше допустимого");
        }
        if (!confirmPassword.matches(CHECK)) {
            throw new RuntimeException("В пароле присутствуют недопустимые символы");
        }
        if (password.length() > 20) {
            throw new RuntimeException("Длина пароля выше допустимого");
        }
        if (confirmPassword != password) {
            throw new RuntimeException("Пароль не подтвержден");
        }
    }
}
