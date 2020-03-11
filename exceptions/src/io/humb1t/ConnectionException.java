package io.humb1t;

public class ConnectionException extends Exception {
    static final String NO_CONN_NAME = "No connection address, is not permitted!";
    public ConnectionException(String message) {
        super(message);
    }
}
