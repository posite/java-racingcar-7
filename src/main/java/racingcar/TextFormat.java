package racingcar;

public enum TextFormat {
    RACING_TRY_RESULT("%s : ");

    private final String format;

    TextFormat(String format) {
        this.format = format;
    }

    public String format(Object args) {
        return String.format(this.format, args);
    }
}