package AtmMVC.model;

public class IllegalBalanceException extends Exception {

    private String message;

    public IllegalBalanceException(String message) {
        this.message = message;
    }

    public String infoError() {
        return message;
    }
}