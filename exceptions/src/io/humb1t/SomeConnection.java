package io.humb1t;

public class SomeConnection implements AutoCloseable {

    private String connection;

    public void getSomeConnection() {
        // TODO smth to get connection
        System.out.println("Try to get some connection");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Connection is closed");
    }

    public SomeConnection(String connection) throws ConnectionException {
        if (connection == null) {
            throw new ConnectionException(ConnectionException.NO_CONN_NAME);
        } else {
            this.connection = connection;
        }
    }

    public static void main (String[] args) throws Exception {
        try (SomeConnection conn = new SomeConnection("Connection")) {
            conn.getSomeConnection();
        }

        //what's a value inside your variable. Write down your thoughts.
        //in my opinion it's null value, the instance was not created, because of exception in constructor


        SomeConnection conn1 = new SomeConnection(null);
        conn1.getSomeConnection();
    }
}