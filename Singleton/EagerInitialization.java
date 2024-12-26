package Singleton;

class DBConnection {
    private static DBConnection dbConnection = new DBConnection();

    private DBConnection() {
        System.out.println("DB Connection Object is created");
    }

    public static DBConnection getDBConnectionInstance() {

        return dbConnection;
    }
}

public class EagerInitialization {
    public static void main(String[] args) {
        DBConnection dbConnectionObj = DBConnection.getDBConnectionInstance();
    }
}
