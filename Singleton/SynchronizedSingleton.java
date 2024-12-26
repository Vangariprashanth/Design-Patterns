package Singleton;

class DBConnection {
    private static DBConnection dbConnectionObj;

    private DBConnection() {
        System.out.println("DB connection Object is created");
    }

    public synchronized static DBConnection getDBConnectionInstance() {
        if (dbConnectionObj == null) {
            dbConnectionObj = new DBConnection();
        }
        return dbConnectionObj;
    }
}

public class SynchronizedSingleton {
    public static void main(String[] args) {
        DBConnection dbConnectionObj = DBConnection.getDBConnectionInstance();

    }
}
