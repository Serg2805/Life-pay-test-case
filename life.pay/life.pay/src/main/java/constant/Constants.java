package constant;

public class Constants {
    public static class TimeoutVariables {
        public static final int IMPLICIT_WAIT = 5;
        public static final int EXPLICIT_WAIT = 10;

    }

    public static class Urls {
        public static final String PAGE_LOGIN = "https://my.life-pos.ru/auth/login";
    }

    public static class Selectors {
        public static final String TITLE_GREETING = "//h2[@class='title']";
    }

    public static class VariablesOfGreetings{
        public static final String GOOD_MORNING = "Доброе утро! \uD83D\uDC4B\uD83C\uDFFB";
        public static final String GOOD_AFTERNOON = "Добрый день! \uD83D\uDC4B\uD83C\uDFFB";
        public static final String GOOD_EVENING = "Добрый вечер! \uD83D\uDC4B\uD83C\uDFFB";
        public static final String GOOD_NIGHT = "Доброй ночи! \uD83D\uDC4B\uD83C\uDFFB";

    }
}
