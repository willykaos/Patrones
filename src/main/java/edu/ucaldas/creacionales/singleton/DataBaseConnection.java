package edu.ucaldas.creacionales.singleton;

class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {}

    public static DatabaseConnection getInstance() {
        // TODO: thread-safe
        return null;
    }
}
