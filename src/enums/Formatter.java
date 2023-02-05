package enums;

public enum Formatter {
    CALM {
        public String format(String message) {
            return "Here is your message" + message;
        }
    },
    NERVOUS;
    

    public abstract String format(String message);
}
