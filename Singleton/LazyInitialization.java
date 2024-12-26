package Singleton;

class DBConnection {
    private static DBConnection dbConnectionObj;

    private DBConnection() {
        System.out.println("DBConnection Object is created");
    }

    public static DBConnection getDBConnectionInstance() {
        if (dbConnectionObj == null) { // It is not thread safe.
            dbConnectionObj = new DBConnection();
        }
        return dbConnectionObj;
    }
}

public class LazyInitialization {
    public static void main(String[] args) {
        DBConnection dbConnectionobj = DBConnection.getDBConnectionInstance();
    }
}
